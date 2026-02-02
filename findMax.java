// public class Practice{
//     public static void main(String [] args){
//         System.out.println("Hello World" + " " + args[0] + " " + args[1]);
//     }

//! Area of a circle
// public class Circle{
//     public static void main(String args[]){
//         double r = 3;
//         double result = 3.14*r*r;
//         double loss = result - (int)(result);
//         System.out.print("The area of circle is: " );
//         System.out.println((int)(result));
//         System.out.print("The amount of loss: ");
//         System.out.print((float)(loss));
//     }
// }

//! Static variable and Static function 
// public class StaticCount{
//     public static void main(String args []){
//         Counter obj1 = new Counter();
//         Counter.countfnc();

//         Counter obj2 = new Counter();
//         Counter.countfnc();
//         System.out.print("Count: " + Counter.count);
//     }
// }

// class Counter{
//     static int count = 0;
//     static void countfnc(){
//         count++;
//     }
// }

//! Operators
// public class Comparision{
//     public static void main(String args []){
//         int a = 8;
//         int b = 11;
//         // if(a < b){
//         //     System.out.print("B is greater than A\n");
//         // }
//         // else{
//         //     System.out.print("A is greater than B\n");
//         // }

//         int max = (b > a) ? b : a;
//         System.out.println("Max: " + max);
//         System.out.println(b << 1);

//         System.out.println(a++);
//         ++a;
//         System.out.println(a);
//         String s1 = "abcd";
//         String s2 = "abcd";
//         if(s1.equals(s2)){
//             System.out.println("s1 is equal to s2");
//         }
//         else{
//             System.out.println("s1 is not equal to s2");
//         }
//     }
// }

//! Switch Statement
// public class Switch{
//     public static void main(String args []){
//         int day = 5;
//         switch(day){
//             case 1: System.out.println("Monday");
//             break;
//             case 2: System.out.println("Tuesday");
//             break;
//             case 3: System.out.println("Wednesday");
//             break;
//             case 4: System.out.println("Thursday");
//             break;
//             case 5: System.out.println("Friday");
//             break;
//             case 6: System.out.println("Saturday");
//             break;
//             case 7: System.out.println("Sunday");
//             break;
//             default: System.out.println("Invalid input");
//             break;
//         }
//     }
// }

// public class Switch{
//     public static void main(String args []){
//         String x = "Sunday";
//         switch(x){
//             case "Monday", "Tuesday": System.out.println("7 am");
//             break;
//             case "Saturday", "Sunday": System.out.println("9 am");
//             break;
//             default: System.out.println("8 am");
//         }
//     }
// }

//! Newer version of switch - No ":" , No "break"
// public class Switch{
//     public static void main(String args []){
//         String x = "Sunday";
//         String alarm = switch(x){
//             case "Monday", "Tuesday" -> "7 am";
//             case "Saturday", "Sunday" -> "9 am";
//             default -> "8 am";
//         };
//         System.out.println("Alarm will ring at: " + alarm);
//     }
// }


//! Q - LEAP YEAR
// public class lyear{
//     public static void main(String args[]){
//         int year = 1600;
//         if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//             System.out.println("It is a leap year");
//         }
//         else{
//             System.out.println("It is not a leap year");
//         }
//     }
// }

//! Q - Ternary 
// public class Status{
//     public static void main(String args[]){
//         int age = 19;
//         String status = (age >= 18)? "Adult" : "Minor";
//         System.out.println(status);
//     }
// }

/* folder java -> folder util -> file named scanner 
(scanner package is imported to take input)
System.in -> System input stream */

//! How to take an input 

// import java.util.Scanner; 

// public class inData{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();
//         System.out.println("Age: " + age);

//         sc.nextLine();                                                      //To clear buffer ("Enter" pressed after entering the int age)

//         System.out.print("Enter name: ");
//         String name = sc.nextLine();
//         System.out.println("Hello " + name);
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class inputS{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter acc Id: ");
//         int AccId = sc.nextInt();
//         System.out.println(AccId);

//         System.out.print("Enter acc no: ");
//         int accNo = sc.nextInt();
//         System.out.println(accNo);

//         sc.nextLine();

//         System.out.print("Enter acc holder's name: ");
//         String name = sc.nextLine();
//         System.out.println(name);
//     }
// }

//! Find max using ternary operator

public class findMax{
    public static void main(String args[]){
        int a = 52;
        int b = 11;
        int c = 35;
        int max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
        System.out.println(max);
    }
}