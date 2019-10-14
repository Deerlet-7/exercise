public class Test2{
	//输出乘法口诀表
	public static void main(String[] args){
		int i = 1;
		int j = 1;
		for(i = 1;i <= 9;i++){
			for(j = 1;j <= i;j++){
				int ret = i * j;
				System.out.print(i + "*" +j + "=" + ret + " ");
			}
			System.out.print("\n");
		}
	}
}