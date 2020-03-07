import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//洗牌
//牌的结构
class Card{
    Card(String suit,int rank){
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        String strNum = String.format("%d",rank);//String的格式化方法
        switch (rank){
            case 11:
                strNum = "J";
                break;
            case 12:
                strNum = "Q";
                break;
            case 13:
                strNum = "K";
                break;
        }
        return suit + ':' + strNum;
    }

    private String suit;//牌的花色
    private int rank;//牌的牌面值
}

class CardDeam{
    //构造一副扑克
    String[] color = {"♥","♦","♣","♠"};

    public List<Card> BuyDeck(){
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13 ; j++) {
                Card c = new Card(color[i],j);
                cards.add(c);
            }
        }
        return cards;
    }
    //简单的洗牌算法
    public void shuffleCard(List<Card> cards){
        for (int i = cards.size()-1; i >0 ; i--) {
            //[0.i)随机取一张牌
            Random r = new Random(20200306);//常见设置种子方式：获取系统当前时间
            int j = r.nextInt(i);

            //交换i和j位置元素
            Swap(cards,i,j);
        }
    }
    private void Swap(List<Card> cards,int i,int j){
        Card temp = cards.get(i);
        cards.set(i,cards.get(j));
        cards.set(j,temp);
    }
}
public class Test7 {
    public static void main(String[] args) {
        CardDeam cd = new CardDeam();
        List<Card> L = cd.BuyDeck();
        System.out.println(L);
        cd.shuffleCard(L);
        System.out.println(L);
    }
}
