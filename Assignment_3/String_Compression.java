package Assignment_3;

import java.util.Scanner;

class String_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str+" ";
        String str1 = "";

        Compress(str,str1);
    }

    public static void Compress(String str, String str1){
        int n = str.length();
        int i=0,j=1;
        int count=1;
        while(i<n && j<n){

            if(str.charAt(i)==str.charAt(j))
            {
                count++;
                j++;

            }
            else if((str.charAt(i)!=str.charAt(i+1))||(i==n-1 && str.charAt(i)!=str.charAt(i-1))){
                str1=str1+str.charAt(i)+count;
                count=1;
                i=j;
                j=i+1;

            }
            else{
                str1=str1+str.charAt(i)+count;
                count=1;
                i=j;
                j=i+1;

            }

        }
        System.out.println(str1);
    }
}
