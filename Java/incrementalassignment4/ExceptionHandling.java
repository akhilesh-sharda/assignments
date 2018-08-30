package incrementalassignment4;

import java.util.Scanner;

class MyException1 extends Exception {
    public MyException1(String message) {
        super(message);
    }
}


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}


class MyException2 extends Exception {
    public MyException2(String message) {
        super(message);
    }
}

class CustomExceptions {
    static void ThrowTheExeption(int a) throws MyException, MyException2, MyException1, NullPointerException {

        if (a == 0)
            throw new MyException("MyException");
        if (a == 1)
            throw new MyException1("MyException 1");
        if (a == 2)
            throw new MyException2("MyException 2");
        else
            throw new NullPointerException("Null Pointer Exception Thrown");
    }
}


public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit to throw custom exception");

        int digit = sc.nextInt();

        try {
            CustomExceptions.ThrowTheExeption(digit);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally Clause Executed");
        }
    }
}