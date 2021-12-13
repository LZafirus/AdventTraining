package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainThird {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input3.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();

        while(scanner.hasNext()) {
            String value = scanner.next();
            input.add(value);
        }

        String gamma = "";
        String epsilon = "";

        int zeros = 0;
        int ones = 0;

        for (int j = 0; j < 9; j++) {
            int inputSize = input.size();
            for (int i = 0; i < inputSize; i++) {
                if (input.get(i).substring(j, j+1).equals("0")) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            System.out.println("Input size: " + inputSize + "zeros: " + zeros + ", ones: " + ones);

            if ( zeros > ones) {
                for (int i = 0; i < inputSize; i++) {
                    if(input.get(i).substring(j, j+1).equals("1")) output.add(input.get(i));
                }
            }
            if (ones >= zeros) {
                for (int i = 0; i < inputSize; i++) {
                    if(input.get(i).substring(j, j+1).equals("0")) output.add(input.get(i));
                }
            }
            if(inputSize == 1) System.out.println(input.get(0));

            input.removeAll(input);
            input.addAll(output);
            output.removeAll(output);

            zeros = 0;
            ones = 0;

        }

        int oxygenRating = Integer.parseInt("111000100010", 2); //931 first, 3618 second
        System.out.println(931 *3618);
    }
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

