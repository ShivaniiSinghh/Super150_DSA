package Assignment_2;

public class Kartik_Bhaiya {
    public static void main(String[] args) {
        String str = "abba";
        int k=2;
        int flipa= perfectness(str,'a',k);
        int flipb=perfectness(str,'b',k);
        System.out.println(Math.max(flipa,flipb));
    }
    public static int perfectness(String str, char ch,int k){
        int si=0;
        int ei=0;
        int ans=0;
        int flip=0;
        while(ei<str.length()){
            if(str.charAt(ei)==ch){
                flip++;
            }
            while(flip>k){
                if(str.charAt(si)==ch){
                    flip--;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
                    ei++;
        }
        return ans;
    }
}
