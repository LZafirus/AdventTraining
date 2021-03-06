package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainSecond {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input2.txt");
        Scanner scanner = new Scanner(file);
        List<String> input = new ArrayList<>();
        List<String> key = new ArrayList<>();
        List<Integer> value = new ArrayList<>();

        int horizontal = 0;
        int depth = 0;
        int aim = 0;

        while(scanner.hasNext()) {
            String inputValue = scanner.next();
            input.add(inputValue);
        }

        for (int i = 0; i < input.size()-1; i++) {
            key.add(input.get(i));
            value.add(Integer.parseInt(input.get(i+1)));
            i++;
        }

        for (int i = 0; i < key.size(); i++) {
            if (key.get(i).equals("forward")) {
                horizontal += value.get(i);
                depth += aim * value.get(i);
            }
            if (key.get(i).equals("down")) {
                //depth += value.get(i);
                aim += value.get(i);
            }
            if (key.get(i).equals("up")){
                //depth -= value.get(i);
                aim -= value.get(i);
            }
        }

        System.out.println("Horizontal: " + horizontal);
        System.out.println("Depth: " + depth);
        System.out.println("Aim: " + aim);
        System.out.println("Tracker: " + horizontal * depth);

    }
}
