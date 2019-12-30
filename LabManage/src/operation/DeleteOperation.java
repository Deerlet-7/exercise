package operation;

import lab.Lab;
import lab.LabList;

public class DeleteOperation implements IOperation{
    @Override
    public void work(LabList labList) {
        System.out.println("输入要删除实验室序号");
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
        int pos = i;
        for (int j = pos; j < labList.getSize(); j++) {
            Lab nextLab = labList.getLab(j+1);
            labList.setLab(j,nextLab);
        }
        labList.setSize(labList.getSize()-1);
        System.out.println("删除成功！");
    }
}
