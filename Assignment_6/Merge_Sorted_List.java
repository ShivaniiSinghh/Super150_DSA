package Assignment_6;
import java.util.*;
public class Merge_Sorted_List{
    public static void main (String args[]) {
        Scanner sannc = new Scanner(System.in);
        int teee = sannc.nextInt();
        while(teee-- !=0){
            int aee = sannc.nextInt();
            int[] tarre1 = new int[aee];
            for(int eye=0; eye<aee; eye++) tarre1[eye] = sannc.nextInt();
            int bee = sannc.nextInt();
            int[] tarre2 = new int[bee];
            for(int eye=0; eye<bee; eye++) tarre2[eye] = sannc.nextInt();
            int eye=0, jay=0;
            ArrayList<Integer> pee = new ArrayList<>();
            while(eye<aee && jay<bee){
                if(tarre1[eye] > tarre2[jay]){
                    pee.add(tarre2[jay]);
                    jay++;
                }
                else{
                    pee.add(tarre1[eye]);
                    eye++;
                }
            }
            while(eye<aee){
                pee.add(tarre1[eye]);
                eye++;
            }
            while(jay<bee){
                pee.add(tarre2[jay]);
                jay++;
            }
            for(int kay : pee){
                System.out.print(kay+" ");
            }
            System.out.println();
        }
    }
}
