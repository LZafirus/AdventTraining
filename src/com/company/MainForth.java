package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainForth {
    public static void main(String[] args) {
        File file = new File("input4.txt");
        Scanner scanner = new Scanner(System.in);

        int [] scoresTab = {17,11,37,7,89,48,99,28,56,55,57,27,83,59,53,72,6,87,33,82,13,23,35,40,71,47,78,2,39,4,51,1,67,31,79,69,15,73,80,22,92,95,91,43,26,97,36,34,12,96,86,52,66,94,61,76,64,77,85,98,42,68,84,63,60,30,65,19,54,58,24,20,25,75,93,16,18,44,14,88,45,10,9,3,70,74,81,90,46,38,21,49,29,50,0,5,8,32,62,41};
        int tableLength = scoresTab.length;

        int [][] boardGame = new int [5][5];

        List<Integer> inputWithInts = new ArrayList<>();
        List<Integer[][]> listOfTables = new ArrayList<>();

        while (scanner.hasNextInt()){
            int value = scanner.nextInt();
            inputWithInts.add(value);
        }

        
    }
}
