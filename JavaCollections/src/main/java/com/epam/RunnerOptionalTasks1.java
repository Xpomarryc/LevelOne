package com.epam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RunnerOptionalTasks1 {
    public static void main(String[] args) throws IOException {
        List<String> lines = readLinesFromFile();
        writeLinesToFile(lines);
    }

    private static List<String> readLinesFromFile() throws IOException {
        Class<RunnerOptionalTasks1> clazz = RunnerOptionalTasks1.class;
        InputStream inputStream = clazz.getResourceAsStream("/OptionalTask1.txt");
        List<String> lines = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    private static void writeLinesToFile(List<String> lines) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/OptionalTask1Output.txt"));
        for (int i = lines.size(); i > 0; i--) {
            writer.write(lines.get(i - 1));
            writer.newLine();
        }
        writer.close();
    }
}
