public class Test{
	//判定一个数字是否是素数
	public static void main(String[] args){
		int a = 71;
		int i = 2;
		for(i = 2;i < a+1;i++){
			if(a%i == 0){
				break;
			}
	    }
		if(i == a){
			System.out.println("是素数");
		}else{
			System.out.println("不是素数");
		}
	}
}