import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        final Random rng = new Random();
        Set<Integer> set = new HashSet<>(Arrays.asList(6, 10, 12, 20, 24));
        short[] a = new short[20];
        for(int i = 24, j = 0; i >= 6; j++, i -= 2)
        {
            a[j] = (short)i;
        }
        float[] x = new float[17];
        for(int i = 0; i < 17; i++)
        {
            x[i] = rng.nextFloat(24) - 10;
            //System.out.println(x[i]);
        }
        double[][] ans = new double[10][17];
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 17; j++)
            {
                double cx = x[j];
                if(a[i] == 8)
                {
                    ans[i][j] = Math.log(Math.acos(Math.pow(((cx + 2) / 24), 2)));
                }
                else if(set.contains((int)a[i]))
                {
                    ans[i][j] = Math.sin(Math.pow(Math.E, Math.cos(cx)));
                }
                else
                {
                    double tmp1 = Math.cos(Math.pow(Math.exp(cx), 1.0/3));
                    double tmp2 = Math.asin(Math.exp(-Math.abs(cx))) / 6;
                    ans[i][j] = Math.pow(tmp1, tmp2);
                }
            }
        }
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 17; j++)
            {
                System.out.printf("%7.5f ", ans[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
