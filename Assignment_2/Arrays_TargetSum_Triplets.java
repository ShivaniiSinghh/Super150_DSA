package Assignment_2;
import java.util.*;
public class Arrays_TargetSum_Triplets {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int  t=sc.nextInt();
        int[] x =new int[t];
        for(int i=0;i<t;i++)
        {
            x[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        Arrays.sort(x);
        for(int i=0;i<t;i++)
        {
            for(int j=i+1;j<t;j++)
            {
                for(int k=j+1;k<t;k++)
                {
                    if(n==(x[i]+x[j]+x[k])){
                        System.out.println(x[i]+", "+x[j]+" and "+x[k]);
                    }
                }
            }
        }
    }
}
