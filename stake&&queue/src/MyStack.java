/**
 * Created by Deerlet-7 on 2020/4/17 13:34
 * 实现一个栈
 */
public class MyStack {
    // 简单起见，我们就不考虑扩容问题了
    private int[] array = new int[100];
    private int size = 0;
    public void push(int v) {
        array[size++] = v;
    }
    public int pop() {
        return array[--size];
    }
    public int peek() {
        return array[size - 1];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
}