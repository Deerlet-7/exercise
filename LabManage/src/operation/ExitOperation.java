package operation;

import lab.LabList;

public class ExitOperation implements IOperation{
    @Override
    public void work(LabList labList) {
        System.out.println("byebye!");
        System.exit(0);
    }
}
