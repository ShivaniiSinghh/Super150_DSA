package Assignment_4;

import java.util.*;
public class dic_large {
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        dicc(str,"");
        // System.out.println(a);
        Collections.sort(arr);
        int l = 0;
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i).equals(str)){
                l=i;
                break;
            }
        }
        for(int i = l+1; i< arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
    public static void dicc(String s, String ans){
        if(s.length() == 0){
            arr.add(ans);
            return;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            dicc(s.substring(0,i)+s.substring(i+1), ans+ch);
        }
    }
}