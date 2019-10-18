public class Test{
	//判断属于青年老年少年哪一年龄段。
	 public static void main1(String[] args){
		 int age = 150;
		 if(age <= 18){
			 System.out.println("少年");
		 }else if(age <= 28){
			 System.out.println("青年");
		 }else if(age <= 55){
			 System.out.println("中年");
		 }else{
			 System.out.println("老年");
		 }
	 }
}