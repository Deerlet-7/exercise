package day12;

/**
 * Created by Deerlet-7 on 2020/4/12 19:57
 * 无缓存交换
 */
public class Exchange {
    public int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0]^AB[1];
        AB[1] = AB[0]^AB[1];
        AB[0] = AB[0]^AB[1];
        return AB;
    }
}
