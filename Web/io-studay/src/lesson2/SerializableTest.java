package lesson2;

import java.io.*;

/**
 * Created by Deerlet-7 on 2020/6/5 16:01
 */
public class SerializableTest {
    public static void main(String[] args) throws Exception {
//        new SerializableTest().new Person2();
        Person person = new SerializableTest.Person();
        //序列化
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("F:\\git\\exercise\\Web\\io-studay\\res\\person"));
        oos.writeObject(person);
        //反序列化
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("F:\\git\\exercise\\Web\\io-studay\\res\\person"));
        Person person1 = (Person)ois.readObject();
    }
    private static class Person implements Serializable{
        private String name;
        private Integer age;
    }
//    private class Person2;
}
