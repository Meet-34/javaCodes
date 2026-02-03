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

// public class findMax{
//     public static void main(String args[]){
//         int a = 52;
//         int b = 11;
//         int c = 35;
//         int max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
//         System.out.println(max);
//     }
// }

//! Types of Loops
/* While Loop - Entry control loop, doesn't execute if the condition is false
It consists of initialization of variable, condition - checked at the entry of body of the while loop, update statement - without which the loop runs for infinite times */

/* do while Loop - Exit control loop, executes at least once ven if the condition is false */

/* for Loop - for(initialization; condition; updation){
    Block of code - Body of for Loop} */

//! Control flow - Continue, break
/* Break - exits the loop completely. Break can be used in three situations: 
-> Loops
-> Switch
-> goto statement */

/* Continue - skips the current iteration, control goes to next iteration */

//! Fibonacci series

// import java.util.Scanner;
// public class fibo{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         int a = 0, b = 1, c;
//         System.out.print(0 + " ");
//         for(int i = 0; i < x; i++){
//             c = a + b;
//             a = b;
//             b = c;
//             System.out.print(c + " ");
//         }
//         sc.close();
//     }
// }

//! Reverse the digits of a number

// import java.util.Scanner;
// public class revNumber{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int rev = 0;

//         while(num != 0){
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//         }
//         System.out.println("The number after reversing: " + rev);
//         sc.close();
//     }
// }

//! Pattern 1

import java.util.Scanner;
public class p1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == n/2 || j == n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

