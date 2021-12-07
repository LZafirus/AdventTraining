package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainThird {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input3.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> input = new ArrayList<>();

        while(scanner.hasNext()) {
            String value = scanner.next();
            input.add(value);
        }

        String gamma = "";
        String epsilon = "";

        int zeros = 0;
        int ones = 0;

        int sizeInput = 12;

        for (int j = 0; j < input.size(); j++) {
            for (int i = 0; i < input.size(); i++) {
                if (input.get(i).substring(j, j+1).equals("0")) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            System.out.println("zeros: " + zeros + ", ones: " + ones);

            if ( ones > zeros ) {
                for (int k = 0; k < input.size(); k++) {
                    if (input.get(k).substring(j, j+1).equals("0")) input.remove(k);
                }
            } if (zeros >= ones ) {
                for (int l = 0; l < input.size(); l++) {
                    if (input.get(l).substring(j, j+1).equals("1")) input.remove(l);
                }
            } if (zeros == ones) {
                for (int d = 0; d < input.size(); d++) {
                    if (input.get(d).substring(j, j+1).equals("0")) input.remove(d);
                }
            }

            System.out.println(j);
            zeros = 0;
            ones = 0;

        }



        // -------------------------------------------
/*
        for (int j = 0; j < sizeInput; j++) {
            for (int i = 0; i < input.size(); i++) {
                if (input.get(i).substring(j, j+1).equals("0")) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            System.out.println( j+ " row - " + "Zeros: " + zeros + ", ones: " + ones);
            if(zeros > ones) {
                gamma += "0";
                epsilon += "1";
            } else {
                gamma += "1";
                epsilon +="0";
            }
            zeros = 0;
            ones = 0;
        }
        int gammaInt = Integer.parseInt(gamma, 2);
        int epsilonInt = Integer.parseInt(epsilon, 2);
        System.out.println(gammaInt * epsilonInt);

*/

        
    }
}
