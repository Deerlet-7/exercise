package operation;
import lab.Lab;
import  lab.LabList;

public class BorrowOperation implements IOperation{
    @Override
    public void work(LabList labList) {
        System.out.println("请输入要预约实验室号");
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
            System.out.println("已经被预约！");
        }else {
            lab.isBorrowed = true;
            System.out.println("预约成功！");
        }
    }
}
