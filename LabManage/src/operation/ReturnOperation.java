package operation;

import lab.Lab;
import lab.LabList;

public class ReturnOperation implements IOperation{
    @Override
    public void work(LabList labList) {
        System.out.println("输入要归还实验室名称：");
        int number = scanner.nextInt();
        int i = 0;
        for ( ; i < labList.getSize(); i++) {
            if((labList.getLab(i).number) == number){
                break;
            }
        }
        if(i>=labList.getSize()){
            System.out.println("没有这个实验室！");
            return;
        }
        Lab lab = labList.getLab(i);
        if(lab.isBorrowed){
            lab.isBorrowed = false;
            System.out.println("归还成功");
        }else {
            System.out.println("归还失败");
        }
    }
}
