// Author: Jack Collis
// GitHub: www.github.com/collis96/
// Portfolio: www.jackcprojects.co.uk

import java.util.*;
import java.io.*;

class Solution{

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map map = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if(map.get(s)==null){
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + map.get(s));
            }
        }

        in.close();

    }
}