public class Test{
	// 打印 1 - 100 之间素数
	public static void main(String[] args){
		int i = 1;
		int j = 0;
		for(i = 1;i < 101;i++){
			for(j = 2;j<i+1;j++){
				if(i%j == 0){
					break;
				}
			}
			if(i == j){
				System.out.println(i);
			}
		}
	}
}