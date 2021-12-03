package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainThird {
    public static void main(String[] args) throws FileNotFoundException {

        int gammaRate = 0;
        int epsilonRate = 0;

        File file = new File("input3.txt");
        Scanner scanner = new Scanner(file);
        List<String> input = new ArrayList<>();

        while(scanner.hasNext()) {
            String value = scanner.next();
            input.add(value);
        }

        int tracker = 0;
        String result = "";
        int zeros = 0;
        int ones = 0;

        for (int i = 0; i < input.size(); i++) {
            if(input.get(i).substring(0,1).equals("0")){
                zeros++;
            }
            else {
                ones ++;
            }
        }
        System.out.println("Zeros: " + zeros+ ", ones: " + ones);

    }
}
