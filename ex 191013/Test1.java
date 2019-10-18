public class Test1{
	//输出 1000 - 2000 之间所有闰年
	public static void main(String[] args){
		int year = 0;
		for(year = 1000;year <2001;year++){
			if((year%4 == 0&&year%100 != 0)||year%400 == 0){
				System.out.println(year + "是闰年");
			}
		}
	}
}