package Assignment_4;

import java.util.*;
public class duc_small {
    static ArrayList<String> arr = new ArrayList<>();
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        dic(str,"");
        // System.out.println(a);
        Collections.sort(arr);
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i).equals(str)){
                break;
            }
            System.out.println(arr.get(i));
        }
    }
    public static void dic(String strrr, String sol){
        if(strrr.length() == 0){
            arr.add(sol);
            return;
        }
        for(int i=0; i<strrr.length(); i++){
            char ch = strrr.charAt(i);
            dic(strrr.substring(0,i)+strrr.substring(i+1), sol+ch);
        }
    }
}