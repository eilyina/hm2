package PACKAGE1;
import java.util.Random;

public class Randomdata {

    public static int[] getIndexList(int n){
       // int k = 100000 +(int)( Math.random() * 200000  );
        int[] k =new int[n];
        for (int idx = 0; idx < n; ++idx){

            k[idx]= 100000+(1 +(int)( Math.random() * 100000 ));
        }
        return k;
    }
}
