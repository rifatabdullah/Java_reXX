//public class AS3 {
//}

// Random
//import java.util.Scanner;
//class r1{
//    public static void main (String[] args){
//        Scanner x = new Scanner(System.in);
//        System.out.println("Enter the number :\n");
//        int a = x.nextInt();
//        if ( a > 100) {
//            System.out.println("Greater than 100");
//        }
//        else if ( a < 100){
//            System.out.println("Less than 100");
//            }
//        else {
//            System.out.println("Equal to 100");
//        }
//        System.out.println("This was your input : "+a);
//
//    }
//}

//import java.util.Scanner;
//class r2{
//    public static void main (String[] args){
//        Scanner x = new Scanner(System.in);
//        System.out.println("Enter a number to check positivity & odd-evenness: ");
//        int num = x.nextInt();
//        if (num>2 && num%2==0 ){
//            System.out.println("This number is even & positive.\n");
//        }
//        else if (num>2 && num % 2!=0 ){
//            System.out.println("This number is odd & positive.\n");
//        }
//        else {
//            System.out.println("This number is negative.\n");
//        }
//    }
//}
// Salary & Bonus
//import java.util.Scanner;
//class sal_bonus{
//    public static void main(String[] args){
//        Scanner e =  new Scanner(System.in);
//        System.out.println("Enter the salary ;");
//        int sal = e.nextInt();
//        System.out.println("Enter your work experience (Years) :");
//        int exp = e.nextInt();
//        if ( exp > 8){
//            System.out.println("Bonus in Taka:\n "+0.15*sal);
//        }
//        else if(exp >= 5 ){
//            System.out.println("Bonus in Taka:\n "+0.10*sal);
//        }
//        else if(exp >= 2){
//            System.out.println("Bonus in Taka:\n "+0.05*sal);
//
//        }
//        else {
//            System.out.println("Bonus in Taka:\n "+0.025*sal);
//        }
//    }
//}



// Problem - 01
//import java.util.Scanner;
//class p1{
//    public static void main(String[] args){
//        Scanner xc =  new Scanner(System.in);
//        System.out.println("Enter first number:");
//        int a = xc.nextInt();
//        System.out.println("Enter second number:");
//        int b = xc.nextInt();
//        System.out.println("Enter third number:");
//        int c = xc.nextInt();
//        if ( a > b && a > c){
//            System.out.println("largest number:"+a);
//        }
//        else if (b > a && b > c){
//            System.out.println("largest number:"+b);
//        }
//        else if (c > a && c > b){
//            System.out.println("largest number:"+c);
//        }
//    }
//}

// Problem - 02
//import java.util.Scanner;
//class p2{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number : ");
//        int n = sc.nextInt();
//        if (n <= 100 && n >= 50){
//            if (n >= 90){
//                System.out.println("Your grade is A");
//            }
//            else if (n >= 85){ System.out.println("Your grade is A-"); }
//            else if (n >= 70){ System.out.println("Your grade is B"); }
//            else if (n >= 57){ System.out.println("Your grade is C"); }
//            else if (n >= 50){ System.out.println("Your grade is D"); }
//
//        }
//        else if ( n < 50 && n>0) {System.out.println("Your grade is F");}
//
//    }
//}

// Problem - 03
//
//import java.util.Scanner;
//class p3{
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first number:");
//        int a = sc.nextInt();
//        System.out.println("Enter your second number:");
//        int b = sc.nextInt();
//        System.out.println("Enter an Operator (+,-,*,/):");
//        String c = sc.next(); // here if i use nextString(), it doesn't take input for some reason
//        if (c.equals("+")){
//            System.out.println(a+b);
//        }
//        else if (c.equals("-")){
//            System.out.println(a-b);
//        }
//        else if (c.equals("*")){
//            System.out.println(a*b);
//        }
//        else if (c.equals("/")){
//            System.out.println(a/b);
//        }
//    }
//}

// Problem - o4
// No error
//import java.util.Scanner;
//  class p4{
//      public static void main(String [] args){
//          Scanner sx = new Scanner (System.in);
//          System.out.println("Enter a number to check divisibility(5/7):");
//          int a = sx.nextInt();
//          if ( a % 5 == 0 && a % 7 == 0 ){ // this is the right logic
//              System.out.println("Divisible by Both");
//          }
//          else{
//              if ( a % 5 == 0 ){
//                  System.out.println("Invalid: Divisible by 5 Only");
//              }
//              else if ( a % 7 == 0 ){
//                  System.out.println("Invalid: Divisible by 7 Only");
//              }
//              else{
//                  System.out.println("No");
//              }
//          }
//
//      }
//  }
//
//

// will show error while input is 105 as it takes both part 1 & 2
//import java.util.Scanner;
//class p4{
//    public static void main(String [] args){
//        Scanner sx = new Scanner (System.in);
//        System.out.println("Enter a number to check divisibility(5/7):");
//        int a = sx.nextInt();
//        if ( a % 5 != 0 && a % 7 != 0 ){
//            System.out.println("No");
//        }
//        else{
//            if (a % 5 == 0 && a % 7 == 0){ // part 1
//                System.out.println("Both");
//            }
//            if ( a % 5 == 0 ){ // part 2
//                System.out.println("Invalid: Divisible by 5 Only");
//            }
//            else if ( a % 7 == 0 ){
//                System.out.println("Invalid: Divisible by 7 Only");
//            }
//
//            }
//        }
//
//    }

// problem - 05
//import java.util.Scanner;
//class p5{
//    public static void main(String [] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a year:");
//        int a = sc.nextInt();
//        if ( a % 400 == 0 && a % 100 == 0){ // divisible by 400 & 100 but if only by 100 then it's not a leap year
//               System.out.println(a+" is a leap year");
//        }
//        else if ( a % 100 == 0) {// order is important cuz 1900 is divisible by 4 not 100. so 100 should be before then divisible by 4 part
//            System.out.println(a+" is not a leap year");
//        }
//        else if (a % 4 == 0 ){
//            System.out.println(a+" is a leap year");
//        }
//    }
//
//}

//Problem - 06
//import java.util.Scanner;
//class p6{
//    public static void main( String [] args) {
//        Scanner xc = new Scanner(System.in);
//        System.out.println("Enter a integer number : ");
//        int a = xc.nextInt();
//        if (a > 0) {
//            if (a % 2 == 0) {
//                System.out.println("Positive and even");
//            } else if (a % 2 != 0) {
//                System.out.println("Positive and odd");
//            }
//        } else if (a < 0) {
//            System.out.println("Number is Negative");
//        }
//        else {
//            System.out.println("Number is Zero");
//        }
//    }
//}

// Problem - 07
//import java.util.Scanner;
//class p7{
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a value: ");
//        int n = sc.nextInt();
//        if ( n < 0){
//            System.out.println("output:"+2*n);
//        }
//        else if( n >= 0 && n < 2){ // error occured be careful about logics
//            System.out.println("output:"+(n+1));
//
//        } else if (n >= 2 && n < 5 ) {
//            System.out.println("output:"+((n*n)-1));
//
//        } else if (n >= 5) {
//
//            System.out.println("output:"+(3*(n*n)+2));
//
//        }
//    }
//}

// problem - 08

import java.util.Scanner;
class p8{
    public static void main( String [] args){
        Scanner xc = new Scanner(System.in);
        System.out.println("Enter your Student ID: ");
        int a = xc.nextInt();
        int b = a / 1000000; // year
        int c = a / 100000;// getting first 3 digits
        int d = c % 10;// 3rd digit
        if ( d == 1 ){
            System.out.println("Student Joined BRAC in Spring "+b);
        }
        else if ( d == 3 ){
            System.out.println("Student Joined BRAC in Summer "+b);
        }
        else if ( d == 2 ){
            System.out.println("Student Joined BRAC in Fall "+b);
        }

    }
}
