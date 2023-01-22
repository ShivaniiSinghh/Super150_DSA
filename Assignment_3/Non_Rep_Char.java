package Assignment_3;

import java.util.Scanner;
class Non_Rep_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            String str = sc.next();
            int ans=Check(str);
            if(ans!=-1)
            {
                System.out.println(str.charAt(ans));
            }
            else{
                System.out.println(ans);
            }
            t--;
        }
    }

    public static int Check(String str) {

        int n=str.length();
        int [] freq= new int[52];
        int flag=0;
        for(int i=0;i<n;i++){
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            int index=str.charAt(i)-'a';
            if(freq[index]==1)
            {
                return i;
            }
        }
        return -1;

    }
}
