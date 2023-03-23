package syntax;

public class StepSecond {
    public static void main(String[] args) {

        StepSecond stepSecond = new StepSecond();
        stepSecond.triangleArea(3, 4, 3);
    }

    /**
     * Task 1:
     * find an area of a triangle by values of it sides length(Use Herons formula ).
     * For this task use Math library, for square root operation(Math.sqrt(argument) <- it will be magic for now.
     * A little bit later I’ll explain how it works).
     */
    public void triangleArea(double a, double b, double c) {
        double area = (a + b + c) / 2.0d;
        double result = Math.sqrt(area * (area - a) * (area - b) * (area - c));
        System.out.println("***************Task 1***************");
        System.out.println("an area of a triangle ");
        System.out.println("the triangle area " + result);
        System.out.println("************************************");
        System.out.println();
    }

    /**
     * Task 2:
     * compare pre and post increment/decrement programmatically to find difference between them.
     * For comparing create a variable with initial value and use all increments/decrements,
     * line by line with printing result of operation and variable value after.
     */ {
        // unary operators ++/-- increments/decrements a value by 1
        double a = 10;
        double b = (--a) / 2 + (b=++a) ;
        System.out.println("***************Task 2***************");
        System.out.println("pre and post increment/decrement test");
        System.out.println("the result of (--a) / 2 + (b=++a) or (--10)/2 + (++9) = " + b);
        System.out.println("************************************");
        System.out.println();
    }

}
