import java.util.ArrayList;
import java.util.List;
//杨辉三角🔺
public class Test6 {
    public static void main(String[] args) {
       /* List<Integer> L1 = new ArrayList<>();
        List<Integer> L2 = new ArrayList<>();
        List<Integer> L3 = new ArrayList<>();
        List<List<Integer>> L = new ArrayList<>();
        L.add(L1);
        L.add(L2);
        L.add(L3);*/
        Test6.generate(6);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new  ArrayList<>();
        for (int i = 0;i<numRows;i++){
            List<Integer> Row = new ArrayList<>();//构造时不给参数，会给一块默认容量的空空间,我的jdk版本默认空间为10
            for (int j = 0 ; j <= i ; j++) {
                if (j == 0 || j == i){
//                    Row.set(j,0);//set方法可以理解为更改的意思，要有元素才能更改。即set方法的index必须在size范围内，不然就越界了
                    Row.add(1);
                }else {
                    Row.add(0);
                }
            }
            ret.add(Row);
        }
        for (int i = 2; i < numRows; ++i) {
            List<Integer> cur = ret.get(i);
            List<Integer> pre = ret.get(i-1);
            for (int j = 1; j < i; ++j) {
                cur.set(j,pre.get(j)+pre.get(j-1));
            }
        }
        return ret;
    }
}