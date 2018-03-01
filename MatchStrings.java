import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class MatchStrings {

    /**
     * Complete the function below.
     * DO NOT MODIFY anything outside this method. 
     */



    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[a.length];
        boolean status = false;
        for(int i=0;i<a.length;i++){

          //  if(i=a.length) break;



            int o1=0,e1=1;
            int o2=0,e2=1;

            String w1 = a[i];
            String w2 = b[i];
            int k= w1.length();
            for(int j=0;j<k/2;j++){


                   status=false;

                o2=o2+2;

                if(w1.charAt(o1)==w2.charAt(o2) )
                {

                  if(e2>k) {
                      status=true;
                      result[i]=status;
                      break;
                  }
                  else{
                      o1=o1+2;


                  }
                    e1=e1+2;
                    o2=o2-2;
                    if(w1.charAt(o1)==w2.charAt(o2)){
                            if(w1.charAt(e1)==w2.charAt(e2))
                        status=true;
                        result[i]=status;
                            break;
                    }
                    else break;


                }
                    else {

                    result[i]=status;
                        break;
                    }
                }





        }

        return result;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        System.out.println("print:");
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }

        int m = Integer.parseInt(in.nextLine().trim());
        String[] b = new String[m];
        for(int i = 0; i < m; i++) {
            b[i] = in.nextLine();

        }

        // call twins function
        boolean[] results = twins(a, b);

        for(int i = 0; i < results.length; i++) {
            System.out.println(results[i]? "Yes" : "No");
        }
    }
}