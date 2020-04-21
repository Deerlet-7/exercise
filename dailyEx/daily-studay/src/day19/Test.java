package day19;

/**
 * Created by Deerlet-7 on 2020/4/21 22:37
 * 成绩排序
 */
import java.util.*;
public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            List<Person> list = new ArrayList<Person>();
            int opear = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Person person = new Person(sc.next(),sc.nextInt());
                list.add(person);
            }
            if(opear==0) {
                Collections.sort(list, new Comparator<Person>() {
                    public int compare(Person o1,Person o2) {
                        return o2.score-o1.score;
                    }
                });
            }
            else if(opear == 1){
                Collections.sort(list, new Comparator<Person>() {
                    public int compare(Person o1,Person o2) {
                        return o1.score-o2.score;
                    }
                });
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).name+" "+list.get(i).score);
            }
        }
    }
}
class Person{
    public String name;
    public int score;
    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
