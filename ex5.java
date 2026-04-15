
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

/* do while Loop - Exit control loop, executes at least once even if the condition is false */

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

//! Factorial of a number 

// import java.util.Scanner;
// public class facto{
//     public static void main(String args[]){
//         long fact = 1;
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             fact *= i;
//         }
//         System.out.println(fact);
//         sc.close();
//     }
// }

//! Banking menu 

// import java.util.Scanner;

// public class Bank {
//     public static void main(String args[]){
//         System.out.println("Welcome to xyz bank: ");
//         System.out.println("Press 1: Deposit, Press 2: Withdraw, Press 3: Check Balance, Press 4: Exit");
//         Scanner sc = new Scanner(System.in);
//         double bal = 18000;
//         int x;
//         do{
//             x = sc.nextInt();
//             switch(x){
//                 case 1: 
//                     System.out.print("Please enter deposit amount: ");
//                     double amt = sc.nextDouble();
//                     bal += amt;
//                     System.out.println("Amount deposited");
//                     break;

//                 case 2:
//                     System.out.print("Please enter amount to withdraw: ");
//                     double wdraw = sc.nextDouble();
//                     if(bal > wdraw){
//                         bal -= wdraw;
//                         System.out.println("Amount has been successfully withdraw, you may check the balance");
//                     }
//                     else{
//                         System.out.println("Insufficient balance");
//                     }
//                     break;
            
//                 case 3: 
//                     System.out.println("Current balance: " + bal);
//                     break;

//                 case 4:
//                     System.out.println("Thank you for using our bank");
//                     break;

//                 default: 
//                     System.out.println("Invalid input");
//             }
//         }while(x != 4);
//         sc.close();
//     }
// }

//! Pattern 1

// import java.util.Scanner;
// public class p1{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// for(int i=0; i<n; i++){
// for(int j=0; j<n; j++){
// if(i == n/2 || j == n/2){
// System.out.print("* ");
// }
// else{
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }

//! Pattern 2

// import java.util.Scanner;
// public class p1{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// for(int i=0; i<n; i++){
// for(int j=0; j<n; j++){
// if(i == j || i+j == n-1){
// System.out.print("* ");
// }
// else{
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// sc.close();
// }
// }

//! Pattern 3

// import java.util.Scanner;
// public class p3{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         for(int i=1; i<=x; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }

//             for(int j=1; j <= (2*x - 2*i); j++){
//                 System.out.print("  ");
//             }

//             for(int j=1; j<=i; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

//! Pattern 4

// import java.util.Scanner;
// public class p3{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         for(int i=0; i<=x; i++){
//             for(int j=1; j<=x-i; j++){
//                 System.out.print("  ");
//             }

//             for(int j=1; j <= (2*i + 1); j++){
//                 System.out.print("* ");
//             }

//             for(int j=1; j<=x-i; j++){
//                 System.out.print("  ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

//! 2D Matrix 

// public class p3{
//     public static void main(String args[]){
//         int[][]matrix = new int[5][6];
//         int k = 1;
//         for(int i=0; i<5; i++){
//             for(int j=0; j<6; j++){
//                 matrix[i][j] = k++;
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class p3{
//     public static void main(String args[]){
//         int[][]arr = new int[5][6];
//         int x = 1;
//         for(int i=0; i<6; i++){
//             if(i % 2 == 0){
//                 for(int j=0; j<5; j++){
//                     arr[j][i] = x++;
//                 }
//             }
//             else{
//                 for(int j=5-1; j>=0; j--){
//                     arr[j][i] = x++;
//                 }
//             }
//         }

//         for(int i=0; i<5; i++){
//             for(int j=0; j<6; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//! UNIT - 2

//! Varargs
/* There can be only one varargs argument
It should be the last argument in the function */

// public class varargs{
//     int add(int... arr){
//         int sum = 0;
//         for(int x : arr){
//             sum += x;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         varargs obj = new varargs(); 
//         int result = obj.add(1, 2, 3, 4, 5);
//         System.out.println(result);
//     }
// }

//! Enums
/* Enum is a special class that represents group of constants
We can attach data to enum using fields and constructors */
//Syntax of enum: 
// enum priority{
//     low, high, medium
// }

//! Varargs - find max element

// public class findmax{
//     int max(int...arr){
//         int max = 0;
//         for(int x: arr){
//             if(x > max){
//                 max = x;
//             }
//         }
//         return max;
//     }

//     public static void main(String args[]){
//         findmax fm = new findmax();
//         int result = fm.max(23, 25, 27, 45, 56);
//         System.out.println(result);
//     }
// }

//! Getter & Setter - Read-only access and Write-only access(with validation) respectively

//! Constructor
/* Types of constructor - Default constructor, parameterized constructor. 
There is no copy constructor in java. But we can create our own copy constructor manually. 
If any constructor is defined manually, compiler will not create the default no-arg constructor. */

//? Bank Account - Create a class with static bankname and instance balance. See how changing bankname affects all objects

// public class q1{
//     public static void main(String args[]){
//         bankname obj1 = new bankname();
//         bankname obj2 = new bankname();
//         obj1.display();
//         obj2.display();

//         obj1.bank = "xyz";
//         obj1.display();
//         obj2.display();
//     }
// }

// class bankname{
//     static String bank = "Axis";

//     void display(){
//         System.out.println("Bank: " + bank);
//     }
// }

//? Overloading - Create a calculator class with add(int, int), add(double, double), add(int, int, int)

// public class q2{
//     public static void main(String args[]){
//         calculator c = new calculator();
//         c.add(12, 15);
//         c.add(5, 8, 11);
//         c.add(12.56, 2.11);
//     }
// }

// class calculator{
//     void add(int a, int b){
//         System.out.println("a + b = " + (a+b));
//     }

//     void add(double a, double b){
//         System.out.println("a + b = " + (a+b));
//     }

//     void add(int a, int b, int c){
//         System.out.println("a + b + c = " + (a+b+c));
//     }
// }

//? Constructor chaining using this - Create a class where the constructor uses this to call another constructor

// public class q3{
//     public static void main(String args[]){
//         class1 c = new class1();
//     }
// }

// class class1{
//     class1(){
//         this(10);
//         System.out.println("Hi, this is class 1");
//     }

//     class1(int x){
//         System.out.println("Hi, this is class 2");
//     }
// }

//? Static Block - Prove that static block runs before the constructor by printing messages

// public class q4{
//     public static void main(String args[]){
//         class1 c = new class1();
//     }
// }

// class class1{
//     class1(){
//         System.out.println("Hi, constructor this side!");
//     }

//     static{
//         System.out.println("Hi, static block this side!");
//     }
// }

//? Object count - Use a static variable count to track how many objects of a class have been created

// public class q5{
//     public static void main(String args[]){
//         class1 c1 = new class1();
//         class1 c2 = new class1();
//         class1 c3 = new class1();
//         class1 c4 = new class1();   
//         System.out.println("Total no. of objects created: " + class1.count);
//     }
// }

// class class1{

//     static int count = 0;
//     class1(){
//         count++;
//     }
// }

//! Overview 
/* instance initializer block - runs every time an obj is created 
 static block - runs only once */

 /* what is an instance variable?
 A variable declared inside a class but outside any method */

//  Constructors cannot be static as it will get confused as to which object to initialize with the values

// Constructor chaining -> Calling one constructor from another 

//! String - sequence of characters & it is immutable (why immutable? Because it creates a new object instead of changing the old one)

// There is no concept of "call by reference" in java, even the address is passed 'as a value' for performing operations that might look like call by reference

// Wrapper classes create diff memory space object if outside range(-128 to 127), therefore they wont be equal using (==)
// Default access modifier -> package-private 

//? ~5 -> take 2's complement(flip bits and then until first 1 copy values from right then flip the bits and if the leftmost bit is 1 then ans is negative otherwise positive) -> SHORTCUT -> ~n = -(n+1)

//? java.lang.String -> automatically imported, cannot be inherited 

// public class st{
//     public static void main(String args[]){
//         String s = "Java";
//         s = s.concat(" World");                        
//         //Java remains the same but at some other address meanwhile java world is at another memory location
//         System.out.println(s);
//     }
// }

//! Two ways to create a string: (1) String s = "Hellow" (2) String s2 = new String("Hellow") 
// .intern() is used to refer to the address of that specific string in the String constant pool instead of the heap address 
// Syntax -> String s = new String("Hellow").intern();

//! String Builder - sequence of characters but mutable 
// It direcly changes the content of the same object instead of creating new objects 
// Same object -> faster execution -> lesser memory 
// java.lang.StringBuilder , automatically imported 
// java.util.* -> imports all the modules 

/* Internal working of String Builder -> 
resizable char array, default capacity -> 16 characters */ 

// StringBuilder s = new StringBuilder(1000)       // Here, 1000 is capacity, not size or length

//? String builder uses a formula of 2n + 2 whenever its capacity is full, it automatically adjust itself in 2n+2 form where n is its own capacity 

//! Collection - 

//? Arrays.fill(arr, 42);                         //?Where arr is the name of the 1D Array and we want to insert 42 at every index of the array

//? Arrays.sort(arr);

//? Arrays.binarySearch(arr, 3);                  //? arr is the array name and it should be sorted 

//! To copy the elements of one array to another array:

//! copyOf method 

//? int newArr = Arrays.copyOf(arr, 10);          //? copyof creates a new array of size 10 and copies the elements of 'arr' into that array and returns the reference of that newly created array 

//! clone - method of array not Array 

//? int [] newarr = oldarr.clone();               //? No need to specify size here 

//! System.arraycopy(oldArray, startindex, newArray, startindexx, oldArray.length) -> System.arraycopy(arr, 0, newArr, 0, arr.length)

//? doesn't return reference

//? To print normal dot in java - "\\."

//! INHERITANCE 
//? Example of inheritance : 
// class Parent{
//     void show(){
//         System.out.println("Hello World");
//     }
// }

// class Child extends Parent{

// }

// public class inhe{
//     public static void main(String args[]){
//         Child c = new Child();
//         c.show();
//     }
// }

//? extends -> a keyword

//! Purpose of inheritance: 
/* 
1-> Code reusability 
2-> Method overriding(runtine polymorphism) 
3-> Logical heirarchy 
4-> Cleaner design 
5-> Maintainability 
*/ 

//? TYPES -> Single, multilevel, heirarchical inheritance 

//? super() -> is used to call the parent constructor -> implicit 
//? use super() to pass the arguments to the parent class constructor and super must be the first statement 
//? call parent method     super.show()
//? access parent members  super.x

//? final class - that class cannot be inherited 
//? final method - that method cannot be overridden 
//? final variable - cannot be changed i.e constant 

//? instanceOf operator -> used to check type

/* if(a instanceOf String){

} */ 

//? it goes upwards in inheritance, may return true if the instanceOf matches the parent classes type 
//? Variable are resolved during compile time so reference type variable is called, and pbject type method is called
 
// class Animal{
//     void eat(){
//         System.out.println("Animal eating");
//     }
// }

// class Dog extends Animal{
//     void eat(){
//         System.out.println("Dog eating");
//     }

//     void sound(){
//         System.out.println("Bow Bow");
//     }
// }

// public class latebinding{
//     public static void main(String args[]){
//         Animal a = new Dog();
//         a.eat();
//         //? a.sound();                                  Not allowed, compiler checks reference type, not the object type 
//     }
// }

//? overriding toString() method (method present in object class that is included explicitly in the class as object class is the top-most(root) class) 
//? Inside object class, == compares references. Check for object type while overloading. if called for different reference object, doesn't work. returns false.
// class Animal{
//     public String toString(){
//         return "Animal class object";
//     }
// }

// class Dog extends Animal{
//     // public String toString(){
//     //     return "Dog class object";
//     // }
// }

// public class over{
//     public static void main(String args[]){
//         Dog d = new Dog();
//         System.out.print(d);
//     }
// }

//? Abstract class 
/* We cannot create an object of an abstract class. It is declared using an 'abstract' keyword. 
It is a class that has atleast one abstract method. 
Abstract class can contain : 
abstract method, normal method, variables, constructors, static */

//? Interface 
/* We cannot write a constructor inside interface. We cannot write a body inside interface We cannot create an object of interface. 
All interface variables are automatically public static final 
Methods become abstract and public 

After JAVA 8, We can give body to some methods but the method should have a default keyword and it is not mandatory to define that function inside the child classes, 
Child classes can overwrite the default method that is inside the interface 
To clearly declare which class method to call in child class write -> classname.super().methodname() */


// abstract class animal{
//     animal(){
//         System.out.println("Abstract class constructor");
//     }
//     abstract void sound();
// }

// class dog extends animal{
//     dog(){
//         System.out.println("Subclass constructor");
//     }
//     void sound(){
//         System.out.println("Bark");
//     }
// }

// public class abs{
//     public static void main(String args[]){
//         dog d = new dog();
//         d.sound();
//     }
// }

// interface core{
//     void wheels();
// }

// interface extrafeatures{
//     void color();
// }

// class car implements core, extrafeatures{
//     public void wheels(){
//         System.out.println("4 Wheels");
//     }

//     public void color(){
//         System.out.println("Black");
//     }
// }

// public class inte{
//     public static void main(String args[]){
//         car c = new car();
//         c.wheels();
//         c.color();
//     }
// }

// interface animal{
//     static void makeSound(){
//         System.out.println("Body of static function 'make sound'");
//     }
// }

// class dog implements animal{}

// class cat implements animal{}

// public class intef{
//     public static void main(String args[]){
//         animal.makeSound();
//     }
// }

/* Non-Static nested classes 
1) -> Member-inner class
non-static, inside outer class, outside methods 
It is associated with the outer class object
"Outer obj = new Outer()
Outer.inner obj2 = obj.new inner()"

2) -> Local-inner class
non-static, inside method, container or any block

*/

//! Anonymous inner class -> instead of implementing interface, we use an anonymous class

// public class anin{
//     public static void main(String[] args) {
//         animal a = new animal(){
//             public void sound(){
//                 System.out.println("Bark");
//             }
//         };
//         a.sound();
//     }
// }

// interface animal{
//     void sound();
// }

//! Lambda for sum of two numbers 

// public class su{
//     public static void main(String args[]){
//         sumint obj = (a, b) -> a + b;

//         int result = obj.sum(5, 8);
//         System.out.println("Sum: " + result);
//     }
// }

// interface sumint{
//     int sum(int a, int b);
// }


//! Exception handling 

// public class CustomResources{
//     public static void main(String args[]){
//         try(cusRes cr = new cusRes()){
//             System.out.println("Reading and writing files");
//         }
//         catch(Exception e){
//             System.out.println("Exception occured!");
//         }
//     }
// }

// class cusRes implements AutoCloseable{
//     public void close(){
//         System.out.println("Closing files");
//     }
// }

// public class CustomResources2{
//     public static void main(String args[]){
//         try(cusRes cr = new cusRes()){
//             System.out.println("Reading and writing files");
//         }
//         catch(Exception e){
//             System.out.println("Exception occured!");
//         }
//     }
// }

// class cusRes implements AutoCloseable{
//     cusRes(){
//         throw new ArithmeticException("Exception occured!");
//     }
//     public void close(){
//         System.out.println("Closing files");
//     }
// }

// public class CustomResources3{
//     public static void main(String args[]){
//         try(cusRes cr = new cusRes()){
//             System.out.println("Reading and writing files");
//             throw new myException();
//         }
//         catch(myException e){
//             System.out.println(e.getMessage());
//         }
//         catch(Exception e){
//             System.out.println("Exception occured!");
//         }
//     }
// }

// class myException extends Exception{
//     public String getMessage(){
//         return "Custom Exception has occured!";
//     }
// }

// class cusRes implements AutoCloseable{
//     // cusRes(){
//     //     throw new ArithmeticException("Exception occured!");
//     // }
//     public void close(){
//         System.out.println("Closing files");
//     }
// }

// public class Assertions{
//     public static void main(String args[]){
//         double side = -0.5;

//         assert(side >= 0) : "Side length must be positive! Found: " + side;

//         System.out.println("Area of the square is: " + side*side);
//     }

//     static void sound(){
//         System.out.println("Sound function!");
//     }
// }

// import java.io.*;
// public class ex1{
//     public static void main(String[] args) {
//         try {
//             // FileOutputStream fos = new FileOutputStream("a.txt");
//             // String s = "Hello World!";
//             // fos.write(s.getBytes());
//             // fos.close();
//             FileInputStream fis = new FileInputStream("a.txt");
//             int data;
//             while((data = fis.read()) != -1){
//                 System.out.print((char)data);
//             }
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.io.FileReader;
// import java.io.FileWriter;

// public class ex2{
//     public static void main(String[] args){
//         try {
//             FileReader fis = new FileReader("file1.txt");
//             int data;
//             FileWriter fos = new FileWriter("file2.txt");
//             while((data = fis.read()) != -1){
//                 fos.write(data);
//             }
//             fos.close();
//             fis.close();
//         } catch (Exception e) {
//         System.out.println(e.getMessage());
//         }
//     }
// }

// import java.io.BufferedWriter;
// import java.io.FileWriter;

// public class ex3{
//     public static void main(String[] args){
//         try {
//             FileWriter fw = new FileWriter("a.txt");
//             BufferedWriter bw = new BufferedWriter(fw);
//             bw.write("Hello, This is written using BufferedWriter");
//             bw.close();
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// public class ex4{
//     public static void main(String[] args){
//         stud s = new stud(1, "Lily");
//         try {
//             // FileOutputStream fos = new FileOutputStream("a.txt");
//             // ObjectOutputStream os = new ObjectOutputStream(fos);
//             // os.writeObject(s);

//             FileInputStream fis = new FileInputStream("a.txt");
//             ObjectInputStream ois = new ObjectInputStream(fis);
//             stud recover = (stud)ois.readObject();
//             System.out.println(recover.name);
//             System.out.println("Task done!");
//         } 
//         catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }

// class stud implements Serializable{
//     int roll;
//     String name;
//     stud(int r, String n){
//         roll = r;
//         name = n;
//     }
// }

//! Generic class
public class ex5{
    public static void main(String[] args){
        Box<Integer> ob = new Box<>(10);
        System.out.println(ob.get());
        Box<String> ob1 = new Box<>("Hello");
        System.out.println(ob1.get());
    }
}

class Box<T>{
    T val;
    Box(T n){
        val = n;
    }
    T get(){
        return val;
    }
}