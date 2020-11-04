import jdk.swing.interop.SwingInterOpUtils;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            int result = divide();
            System.out.println(result);
        }catch(ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
        }

    }

    private static int divide(){
     int x, y;
     x = getInt();
     y = getInt();
        System.out.println("x = " + x + ", y = " + y);

        return x/y;
    }



    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.println("please enter a valid number: ");
            }
        }


    }


    }//end of Main


