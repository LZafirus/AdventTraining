package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFirst {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        List<Integer> input = new ArrayList<>();
        int tracker = 0;

        while(scanner.hasNextInt()) {
            Integer value = scanner.nextInt();
            input.add(value);
        }

/*      >>> First Puzzle algorithm
        for (int i = 0; i < input.size()-1; i++) {
            if(input.get(i) < input.get(i+1)) tracker ++;
        }
*/
/*     >>> Second puzzle algorithm
       for (int i = 0; i < input.size()-3; i++) {
            int firstSum = 0;
            int secSum = 0;

            firstSum = input.get(i) + input.get(i+1) + input.get(i+2);
            secSum = input.get(i+1) + input.get(i+2) + input.get(i+3);

            if(firstSum < secSum) tracker++;
        }
*/

        System.out.println(tracker);
    }
}
