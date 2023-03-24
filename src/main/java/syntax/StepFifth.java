package syntax;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StepFifth {
    public static int[] arrayFirstInt = {1, 45, 6, 15, 0};
    public static int[] arraySecondInt = {-1, 4, 66, 105, 0, 13};
    public static double[] arrayFirstDbl = {-15.5, 5, 103.55, 17, 0.1, 0};
    public static double[] arraySecondDbl = {0.5, 15, 10, 1, 23, -9};

    public static void main(String[] args) {


        System.out.println("Task 1 test");
        System.out.println(" AVG of int [] array : " + avgValueArray(arrayFirstInt));
        System.out.println(" \n AVG of double [] array : " + avgValueArray(arrayFirstDbl));

        System.out.println("Task 2 test all 3 methods");
        printArray(joinArray(arrayFirstInt, arraySecondInt));
        System.out.println("\n");
        printArray(joinArrayNew(arrayFirstDbl, arrayFirstDbl));
        System.out.println("\n");
        printArray(joinArrayNew(arrayFirstInt, arraySecondInt));

        System.out.println("\nTask 3 test ");
        printMaxValue(joinArrayNew(arrayFirstInt, arraySecondInt));
        printMaxValue(joinArrayNew(arrayFirstDbl, arraySecondDbl));
    }

    /**
     * Task 1:
     * calculate average value of given array with numbers and print
     * this value to the console. Program must calculate average value
     * for array with any number of elements.
     */
    public static double avgValueArray(double[] array) {
        double sum = 0;
        for (double d : array) {
            sum += d;
        }
        return sum / array.length;
    }

    public static int avgValueArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    /**
     * Task 2:
     * merge 2 given arrays. Result must be an array, that contains all
     * elements from first and second arrays. Value must be calculated
     * for arrays with any length.
     */
    public static int[] joinArray(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        for (int i = 0; i < a.length; ) {
            array[i] = a[i];
            i++;
        }
        for (int i = a.length, j = 0; i < array.length; i++, j++) {
            array[i] = b[j];
        }
        return array;
    }

    public static int[] joinArrayNew(int[] a, int[] b) {
        return IntStream.concat(IntStream.of(a), IntStream.of(b))
                .toArray();
    }

    public static double[] joinArrayNew(double[] a, double[] b) {
        return DoubleStream.concat(DoubleStream.of(a), DoubleStream.of(b))
                .toArray();
    }

    /**
     * Task 3:
     * for exist array with numbers find the biggest
     * number and print it to the console.
     */
    public static void printMaxValue (int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("The biggest number in array is " +max);
        System.out.println();
    }

    public static void printMaxValue (double[] a){
        double max = 0;
        for (int i = 0; i < a.length; i++) {
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println("The biggest number in array is " +max);
        System.out.println();
    }

    /**
     *Task 4:
     *  create a program, that will sort by asc given array with
     *  numbers and print result array to the console.
     */
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
    }

    public static void printArray(double[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
    }
}


