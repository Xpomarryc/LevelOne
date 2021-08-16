package com.epam;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunnerOptionalTasks4 {
    public static void main(String[] args) throws IOException {
        List<String> lines = readLinesFromFile();
        lines.sort(Comparator.comparingInt(String::length));
        printLines(lines);
    }

    private static List<String> readLinesFromFile() throws IOException {
        Class<RunnerOptionalTasks4> clazz = RunnerOptionalTasks4.class;
        InputStream inputStream = clazz.getResourceAsStream("/OptionalTask4.txt");
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    private static void printLines(List<String> lines) {
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
