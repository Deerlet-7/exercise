package operation;
import lab.LabList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(LabList labList) {
        for (int i = 0; i < labList.getSize(); i++) {
            System.out.println(labList.getLab(i));
        }
    }
}
