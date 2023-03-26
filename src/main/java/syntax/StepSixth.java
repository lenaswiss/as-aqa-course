package syntax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class StepSixth {
    public static void main(String[] args) throws IOException {
//        stringFormatPrintAscColumn();        //task 1 test
//        stringFormatPrintEvenWordUppercase();//task 2 test
//        countNumberOfSymbolInString();       //task 3 test
        separateStringAndPrint();            //task 4 test

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
            if (str.contains("java")) {//looks for any place ignoring prefixes and ending of the word, using spaces it can be changed
                System.out.println(sb.reverse());
            } else {
                ArrayList<String> list = new ArrayList<>();
                if (!str.contains(" ")) {
                    System.out.println(str);
                    return;
                }
                while (str.contains(" ")) {
                    int index = str.indexOf(" ");
                    String temp = str.substring(0, index);
                    list.add(temp);
                    str = str.substring(index + 1);
                }
                for (int i = 0; i < list.size(); i++) {
                    if (i % 2 == 0) {
                        System.out.print(list.get(i).toUpperCase() + " ");
                    } else {
                        System.out.print(list.get(i) + " ");
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
    public static void countNumberOfSymbolInString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        System.out.println("****** Enter the sentence, please. *******");
        String str = null;
        str = reader.readLine();
        System.out.println("****** Enter a single symbol, please. ******");
        String symbol = reader.readLine();
        if (symbol.isEmpty()) {
            return;
        }
        if (!str.contains(symbol)) {
            System.out.println(symbol + " was not found in given sentence.");
        } else {
            char[] charArray = str.toCharArray();
            char c = symbol.charAt(0);
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == c) {
                    counter++;
                }
            }
        }
        switch (counter) {
            case 0:
                break;
            case 1:
                System.out.println("Only one symbol" + " \"" + symbol + "\" " + "was found in the entered sentence.");
                break;
            default:
                System.out.println(counter + " \"" + symbol + "\" " + "symbols were found in the entered sentence.");
        }
    }

    /**
     * Task 4*:
     * for a given string from the console in PascalCase separate the
     * words by “ ” symbol, before each uppercase letter, like in a sentence.
     * Print the new sentence to the console.
     */
    public static void separateStringAndPrint() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string in PascalCase.");
        String str = reader.readLine();
        if (str.isEmpty()) {
            System.out.println("Empty string was entered.");
        } else if (str.contains(" ")) {
            System.out.println("Wrong string format, expected PascalCase.");
        } else if (!str.contains(" ") && !str.isEmpty()) {
            int counter = 0;
            char[] charArray = str.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if (Character.isUpperCase(charArray[i])) {
                    if (!Character.isUpperCase(charArray[0])) {
                        counter = -1;
                        break;
                    }
                    counter++;
                }
            }
            switch (counter) {
                case -1:
                    System.out.println("Wrong format string.");
                    break;
                case 0:
                    System.out.println("The string does not contains symbols in Uppercase.");
                    break;
                case 1:
                    System.out.println("The string contains only one word starts from Uppercase, cannot be parsed.");
                    break;
                default:
                    ArrayList<String> wordsArray = new ArrayList<>();
                    int index = 0;
                    for (int i = 0; i < charArray.length; i++) {
                        if (Character.isUpperCase(charArray[i])) {
                            wordsArray.add(str.substring(index, i));
                            index = i;
                        }
                        if (i == (charArray.length - 1)) {
                            wordsArray.add(str.substring(index));
                        }
                    }
                    for (String s : wordsArray) {
                        System.out.print(s + " ");
                    }

            }

        }

    }

/**
 * Task 5*:
 * bubble sorting realization.
 */

}
