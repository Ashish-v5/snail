package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int c,d,h;
        c=sc.nextInt();
        d=sc.nextInt();
        h=sc.nextInt();
        if(c<=d) {
            if (d > h) {
                System.out.println(1);
            } else {
                System.out.println("Impossible");
            }
        }else{
            int dt=0,days=0;
            while(dt<h){
                dt+=c;
                if(dt>=h){
                    System.out.println(days+1);
                    break;
                }
                dt-=d;
                days++;
            }
        }
        sc.close();
    }
}
