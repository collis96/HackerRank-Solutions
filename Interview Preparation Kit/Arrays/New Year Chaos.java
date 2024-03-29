// Author: Jack Collis
// GitHub: www.github.com/collis96/
// Portfolio: www.jackcprojects.co.uk

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Time complexity: O(n)
    // Space complexity: O(1)
    static void minimumBribes(int[] q) {
        
        int count = 0; //Count bribes
    
        /* Lowest 3 values */
        int lowest, nextLowest, lastLowest;
        lowest = nextLowest = lastLowest = Integer.MAX_VALUE;
        
        for(int i=q.length-1 ; i >= 0 ; i--){
            if((q[i]-i) > 3 ) {
                System.out.println("Too chaotic");
                return;
            } else {

                /* Check lowest values against current value */
                if(q[i] > lastLowest){
                    System.out.println("Too chaotic");
                    return;
                } else if(q[i] > nextLowest){
                    count=count+2;
                } else if(q[i] > lowest){
                    count=count+1;
                }
                
                /* Update lowest values */
                if(q[i]<lowest){
                    lastLowest = nextLowest;
                    nextLowest = lowest;
                    lowest = q[i];
                } else if(q[i]<nextLowest){
                    lastLowest = nextLowest;
                    nextLowest = q[i];
                } else if(q[i]<lastLowest){
                    lastLowest = q[i];
                }
            }
        }
        System.out.println(count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
