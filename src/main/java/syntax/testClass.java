package syntax;

import java.util.Stack;

public class testClass {
    int i = 10;
    double d = 12;



    public static void main(String[] args) {
        Test ts = new Test("TestName+122121");
        String s = ts.getName().toString();
        int d = 10;
        System.out.printf("The test class has name %d, and I printed it in console",10) ;
    }

    static class Test{
        private String name;

        Test(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
