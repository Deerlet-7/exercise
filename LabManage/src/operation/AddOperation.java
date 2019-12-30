package operation;

import lab.LabList;
import lab.Lab;

public class AddOperation implements IOperation{
    @Override
    public void work(LabList labList) {
        System.out.println("添加实验室");
        System.out.println("输入实验室号码：");
        int number = scanner.nextInt();
        Lab lab = new Lab(number);
        int curSize = labList.getSize();
        labList.setLab(curSize,lab);
        labList.setSize(curSize+1);
        System.out.println("实验室添加成功！");
    }
}
