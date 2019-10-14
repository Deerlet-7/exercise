public class Test4{
	//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
	public static void main(String[] args){
		int a = 1;
		int flg = 1;
		double sum = 0.0;
		for(a = 1;a <= 100;a++){
			sum += flg*1.0/a;
			flg = -flg;
		}
		System.out.println(sum);
	}
}