// Created by islam elhady on 27/01/2018.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          
          for( int i = 1; i <= 10 ; i++){
              
              System.out.printf("%d x %d = %d\n",n,i,n*i);
          }
    }
}