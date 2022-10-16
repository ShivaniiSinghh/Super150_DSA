package Assignment_4;


import java.util.*;

public class last_Index {

        public static void main(String args[]) {

            Scanner sc=new Scanner(System.in);

            int c=sc.nextInt();

            int []b=new int[c];
            for(int i=0;i<c;i++)

                b[i]=sc.nextInt();

            int d=sc.nextInt();

            System.out.println(findIT(b,d,c-1));
        }

        public static int findIT(int o[],int key,int i){
            if(i<0){
                return -1;
            }
            if(o[i]==key){
                return i;
            }
            return findIT(o,key,i-1);
        }
    }

