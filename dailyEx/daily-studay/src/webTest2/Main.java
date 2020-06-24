package webTest2;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/6/20 22:29
 * 餐馆
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] desk = new int[n];
            for (int i = 0; i < n; i++) {
                desk[i] = sc.nextInt();
            }
            Arrays.sort(desk);
            PriorityQueue<Customer> queue = new PriorityQueue<>();
            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (a <= desk[n - 1]){
                    queue.add(new Customer(a , b));
                }
            }
            boolean[] used = new boolean[n];
            long sum = 0;
            int count = 0;
            while ( ! queue.isEmpty()){
                Customer customer = queue.poll();
                for (int i = 0; i < n; i++) {
                    if (customer.peopleCount <= desk[i] && !used[i]){
                        sum += customer.monyCount;
                        count++;
                        used[i] = true;
                        break;
                    }
                }
                if (count == n){
                    break;
                }
            }
            System.out.println(sum);
        }
    }

    static class Customer implements Comparable<Customer> {
        private int peopleCount;
        private int monyCount;

        public Customer(int peopleCount, int monyCount){
            this.peopleCount = peopleCount;
            this.monyCount = monyCount;
        }

        @Override
        public int compareTo(Customer o) {
            if (o.monyCount > this.monyCount) {
                return 1;
            } else if (o.monyCount < this.monyCount) {
                return -1;
            }
            return 0;
        }

    }
}
