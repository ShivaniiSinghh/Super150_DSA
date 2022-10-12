package Assignment_4;


import java.util.*;

public class First_Index {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int y=sc.nextInt();
            int []u=new int[y];
            for(int i=0;i<y;i++)
                u[i]=sc.nextInt();
            int p=sc.nextInt();
            System.out.println(find(u,p,0));
        }
        public static int find(int w[],int r,int i){
            if(i>=w.length){
                return -1;
            }
            if(w[i]==r){
                return i;
            }
            return find(w,r,i+1);
        }
    }

