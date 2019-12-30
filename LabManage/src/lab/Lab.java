package lab;

public class Lab {
    public int number;
    public boolean isBorrowed;

    @Override
    public String toString() {
        return "Lab{"+number+
                ((isBorrowed==true)?",已经被预约":",未被预约") +"}";
    }

    public Lab(int number) {
        this.number = number;
    }
}
