import java.util.Arrays;
//自定义类型排序时要实现implements Comparable<Student>，并重写其方法
class Student implements Comparable<Student>{//Compearable接口进行排序，<要排序的类型>
    public String name;
    public int age;
    public double score;
    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //return this.age - o.age;//传进来的age和当前的age进行比较
        return this.name.compareTo(o.name);//-->对名字进行比较
    }
}
public class Test {
    public static void sort(Comparable[] comparables){//传的类型是实现Compearable接口的
        //冒泡
        for (int i = 0; i < comparables.length ; i++) {
            for (int j = 0; j < comparables.length-i-1; j++) {
                if(comparables[j].compareTo(comparables[j+1])>0){
                    Comparable tmp = comparables[j + 1];
                    comparables[j + 1] = comparables[j];
                    comparables[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("lala",5,39);
        students[1] = new Student("bibi",9,89);
        students[2] = new Student("dodo",1,9);
        System.out.println(Arrays.toString(students));
        //Arrays.sort(students);//Arrays.sort排序时实现Compearable接口
        sort(students);
        System.out.println(Arrays.toString(students));

    }
}
