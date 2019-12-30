package user;

import lab.LabList;
import operation.IOperation;
//
public abstract class User {
    protected String name;
    protected IOperation[] operations;
    public abstract int menu();
    public void doOperation(int choice, LabList labList){
        operations[choice].work(labList);
    }
}
