package day25;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by Deerlet-7 on 2020/4/27 22:15
 * 学分绩点
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] score = new int[n];
            int[] rel = new int[n];
            for (int i = 0; i < n; i++) {
                score[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                rel[i] = sc.nextInt();
            }
            System.out.println(opear(score,rel));
        }
    }

    public static String opear(int[] score, int[] rel) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < score.length; i++) {
            sum1 += (getJd(rel[i]) * score[i]);
            sum2 += score[i];
        }
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        return nf.format(sum1/sum2);
    }
    public static double getJd(int rel){
        if(rel<=100 && rel>=90){
            return 4.0;
        }else if(rel<=89 && rel>=85){
            return 3.7;
        }else if(rel<=84 && rel>=82){
            return 3.3;
        }else if(rel<=81 && rel>= 78){
            return 3.0;
        }else if(rel<=77 && rel>=75){
            return 2.7;
        }else if(rel<=74 && rel>=72){
            return 2.3;
        }else if(rel<=71 && rel>=68){
            return 2.0;
        }else if(rel<=67 && rel>=64){
            return 1.5;
        }else if(rel<=63 && rel>=60){
            return 1.0;
        }else {
            return 0;
        }
    }
}
