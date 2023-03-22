/**
 * Java has eight build-in data types, referred to as the Java primitive types.
 * A primitive just a sing value in memory, such as number or character.
 * Primitive types: boolean, byte, short, int, long, float, double, char.
 */
package lesson1;

public class PrimitiveVariables {
    // default value have instance and class variables
    static boolean b1, b2;

    public static void main(String[] args) {
        // boolean: true or false, default initialisation value false
        System.out.println("boolean default value: " + b1);
        System.out.println("default value was changed: " + (b2 = true));
        boolean b3;
        // local variable should be initialized before use
        //  System.out.println(b3); DOES NOT COMPILES;
        b3 = (3 > 3); // true/false or any logical statement
        System.out.println("b3 was initialised in 18th row: " + b3);

        //numeric types: byte, short, int, long

        byte a, b, c;
        a = 127;
        b = 1;
        //  c = a + b; DOES NOT COMPILE without explicit casting to (byte);
        //  byte, short and char, are first promoted to int any time thy are used with binary arithmetic operator.
        c = (byte) (a + b);
        System.out.println(c); // -128  would be displayed because of numeric Overflow
        var testType = (a + b);
        System.out.println(testType); // 128
    }
}
