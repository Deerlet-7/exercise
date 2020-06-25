import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Deerlet-7 on 2020/6/8 20:19
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码及响应编码
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
        //加入请求数据为username=xxx&password=xxx
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //req.getServletPath()获取url的路径：/login
        //req.getContextPath()获取项目的部署名：/test
        System.out.println("servletpath:"+req.getServletPath()+",contextpath:"+req.getContextPath());
        System.out.printf("username=%s,password=%s",username,password);
//        PrintWriter pw = resp.getWriter();
        if("abc".equalsIgnoreCase(username) && "123".equalsIgnoreCase(password)){
//            pw.println("<p>登录成功</p>");
            //登录成功，重定向到首页
            //request.getSession(boolean create);
            //从请求对象获取一个session对象，如果获取不到，根据create决定是否创建
            //create=true，创建一个session对象，create=false，不创建 返回null
            //request.getSession() = request.getSession(true)
            HttpSession session = req.getSession();
            session.setAttribute("user","username"+username);
            resp.sendRedirect(req.getContextPath()+"/main.html");
        }else{
            //登录不成功，转发到错误页
//            pw.println("<p>用户名密码错误，登录不成功</p>");
            req.getRequestDispatcher("/error.html").forward(req,resp);

        }
//        pw.flush();
    }
}
