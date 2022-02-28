package LV.TSI;

import java.util.function.Function;

public class application {

    public static void main(String[] args){
        //       variables myVariable = new variables();


//        System.out.println("hello worl");
//        System.out.println("Byte" + myVariable.myByte);
//        System.out.println("int" + myVariable.oByte);


 //       Functions myFunction = new Functions();
   //     int f1 = myFunction.testFunction();
 //       int f2 = myFunction.testFunction3(100);
 //
 //       myFunction.print();
 //       myFunction.print("this is function with input");
   //         System.out.println("f1: " + "\nf2:" + f2);
        calculator calculator = new calculator();

        int result = calculator.add(55, 23);
        System.out.println("res :" + result);
        System.out.println("res :" + calculator.divide(3, 2));
    }

}
