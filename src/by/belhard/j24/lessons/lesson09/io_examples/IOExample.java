package by.belhard.j24.lessons.lesson09.io_examples;

import java.io.*;
import java.util.Scanner;

public class IOExample {

    public static void main(String[] args) {

        StringBuilder data = new StringBuilder();

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader("input.q"));

            String input;

            while (bufferedReader.ready()) {
                input = bufferedReader.readLine();
                System.out.println(input);
                data.append(input).append("\n");
            }

            System.out.println();

            bufferedReader.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
        }

        try {

            File file = new File("output.q");
            if (!file.exists())
                file.createNewFile();

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, false)); // append

            bufferedWriter.write(data.toString());

            bufferedWriter.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
