package Assignment_4;

import java.util.*;
public class keypad {
    static int count =0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // ArrayList<String> list = new ArrayList<>();
        HashMap<Character,String> pam = new HashMap<>();
        pam.put('1',"abc");
        pam.put('2',"def");
        pam.put('3',"ghi");
        pam.put('4',"jkl");
        pam.put('5',"mno");
        pam.put('6',"pqrs");
        pam.put('7',"tuv");
        pam.put('8',"wx");
        pam.put('9',"yz");
        codes(str,0,pam,"");
        System.out.println("\n"+ count);
    }
    public static void codes(String strr, int index, HashMap<Character,String> p, String sol){
        if(index == strr.length()){
            count++;
            System.out.print(sol+" ");
            return;
        }
        String str = p.get(strr.charAt(index));
        for(int i=0; i<str.length(); i++){
            sol += str.charAt(i);
            codes(strr, index+1, p, sol);
            sol = sol.substring(0,sol.length()-1);
        }
    }
}