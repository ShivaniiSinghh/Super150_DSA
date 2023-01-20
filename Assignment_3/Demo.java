package Assignment_3;
import java.util.*;
public class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //int t=sc.nextInt();

       // for(int k=0;k<t;k++) {
            int index = 0;
            String str = sc.nextLine();

            int n = str.length();
            int unique = 0;
            for (int i = 0; i < n; i++) {
                index = i;
                for (int j = 0; j < n; j++) {
                    if (str.charAt(i) != str.charAt(j)) {
                        unique =1;

                    }

                }

            }
            if (unique == 1) {
                System.out.println("-1");
                //break;
            } else {
                System.out.println(str.charAt(index));
            }
        }
    }
//}
