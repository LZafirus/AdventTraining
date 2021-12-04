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
        List<String> input = new ArrayList<>();

        while(scanner.hasNext()) {
            String value = scanner.next();
            input.add(value);
        }

        String gamma = "";
        String epsilon = "";

        int zeros = 0;
        int ones = 0;

        int sizeInput = input.get(1).length();

        for (int j = 0; j < sizeInput; j++) {
            for (int i = 0; i < input.size(); i++) {
                if (input.get(i).substring(j, j+1).equals("0")) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            System.out.println( j+ " rządek - " + "Zeros: " + zeros + ", ones: " + ones);
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
    }
}
