// Author: Jack Collis
// GitHub: www.github.com/collis96/
// Portfolio: www.jackcprojects.co.uk

import java.util.*;
import java.io.*;

class Calculator{

    public Calculator(){}

    public int power(int n, int p){
        if(n < 0 || p < 0){
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        if(p==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(p==1){
            return n;
        }
        return n * power(n,p-1);
    }

}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
