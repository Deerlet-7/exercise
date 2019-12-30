package operation;

import lab.LabList;

import java.util.Scanner;

public interface IOperation {
    Scanner scanner =new Scanner(System.in);
    void work(LabList labList);
}
