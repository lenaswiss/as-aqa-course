package syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StepSixth {
    public static void main(String[] args) {
        stringFormatPrintAscColumn(); //task 1 test
        stringFormatPrintEvenWordUppercase();//task 2 test

    }

    /**
     * Task 1:
     * for given string sentence from the console delete all spaces
     * and bring it to uppercase, after print result word by letters
     * in column to the console.
     */
    public static void stringFormatPrintAscColumn() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bufferedReader.readLine();
            char[] a = str.replace(" ", "").toUpperCase().toCharArray();
            for (char c : a) {
                System.out.println(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Task 2:
     * for given string sentence, check, that sentence contains word java,
     * if yes
     * - reverse the string and print it,
     * if no
     * - print the sentence (each even word must be uppercase).
     */
    public static void stringFormatPrintEvenWordUppercase() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bufferedReader.readLine();
            StringBuilder sb = new StringBuilder(str);
            if (str.contains("java")) {
                System.out.println(sb.reverse());
            } else {
                ArrayList<String> list = new ArrayList<>();
                while (str.contains(" ")) {
                    int index = str.indexOf(" ");
                    String temp = str.substring(0, index);
                    list.add(temp);
                    str = str.substring(index + 1);
                }
                for (int i = 0; i < list.size(); i++) {
                    if (i % 2 == 0) {
                        System.out.print(list.get(i).toUpperCase() + " ");
                    } else{
                        System.out.print(list.get(i)+ " ");
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Task 3:
     * create a program, that will count number of certain letters
     * in the sentence. Program must read from the console sentence
     * and after read a symbol, number of which must be count.
     * Program must print count of certain letters to the console.
     */

    /**
     * Task 4*:
     * for a given string from the console in PascalCase separate the
     * words by “ ” symbol, before each uppercase letter, like in a sentence.
     * Print the new sentence to the console.
     */

    /**
     * Task 5*:
     * bubble sorting realization.
     */
}
