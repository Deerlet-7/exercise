public class Test3{
	//求两个正整数最大公约数
	public static void main(String[] args){
		int a = 12;
		int b = 30;
		int i = 0;
		int max = 0;
		for(i = 2;(i <= a)&&(i <= b);i++){
			if(a%i == 0&&b%i == 0){
				max = i;
			}
		}	
		System.out.println(max);
	}
}