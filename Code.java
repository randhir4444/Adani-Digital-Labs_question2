import java.util.*;

public class Adani {
    public static void main(String[] args) {
        int[]a = {1, 2, 3,4,5,10};
        int[]b = {10,9,8,7,6,11};
        System.out.println(median(a,b));

    }
    public static int median(int a[],int b[])
    {
        int[]c = new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        int counter=0;
        for(int i=a.length;i<b.length+a.length;i++)
        {
            c[i]=b[counter];
            counter++;
        }
        Arrays.sort(c);
        int center=c.length%2;
        if(center==0)
        {
            int middle=c.length/2;
            return (c[middle]+c[middle-1])/2;
        }
        else{
            int middle=c.length/2;
            return c[middle];
        }
    }

}
