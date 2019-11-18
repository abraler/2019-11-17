import java.util.*;

public class Exchange {
    public static int[] exchangeAB(int[] AB) {
        // write code here
        List<Integer>list=new ArrayList<>();
        list.add(AB[1]);
        list.add(AB[0]);
        AB[0]=list.get(1);
        AB[1]=list.get(0);
        return AB;
    }

    public static void main(String[] args) {
        int []a={1,2};
        exchangeAB(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}