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
import java.util.Scanner;
class p4{
    public static void main(String [] args){
        Scanner sx = new Scanner (System.in);
        System.out.println("Enter a number to check divisibility(5/7):");
        int a = sx.nextInt();
        if ( a % 5 != 0 && a % 7 != 0 ){
            System.out.println("No");
        }
        else{
            if (a % 5 == 0 && a % 7 == 0){ // part 1
                System.out.println("Both");
            }
            else if ( a % 5 == 0 ){ // have to use 'else if' but if we use 'if' whether the first part true or not it'll enter in the second part
                System.out.println("Invalid: Divisible by 5 Only");
            }
            else if ( a % 7 == 0 ){
                System.out.println("Invalid: Divisible by 7 Only");
            }

            }
        }

    }

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

//import java.util.Scanner;
//class p8{
//    public static void main( String [] args){
//        Scanner xc = new Scanner(System.in);
//        System.out.println("Enter your Student ID: ");
//        int a = xc.nextInt();
//        int b = a / 1000000; // year
//        int c = a / 100000;// getting first 3 digits
//        int d = c % 10;// 3rd digit
//        if ( d == 1 ){
//            System.out.println("Student Joined BRAC in Spring "+b);
//        }
//        else if ( d == 3 ){
//            System.out.println("Student Joined BRAC in Summer "+b);
//        }
//        else if ( d == 2 ){
//            System.out.println("Student Joined BRAC in Fall "+b);
//        }
//
//    }
//}

// Problem - 09
//import java.util.Scanner;
//class p9{
//    public static void main( String [] args){
//        Scanner xc = new Scanner(System.in);
//        System.out.println("Enter your salary : ");
//        int a = xc.nextInt();
//        System.out.println("Enter your age : ");
//        int b = xc.nextInt();
//
//        if (b >= 18 && a >= 10000){
//            if ( a >= 10000 && a<=20000 ){
//                System.out.println("Your tax amounts in " +(a*0.05)+ "Tk");
//            }
//            else if ( a > 20000 ){
//                System.out.println("Your tax amounts in " +(a*0.10)+ "Tk");
//            }
//
//        }
//        else {
//            System.out.println("Your tax amounts in 0 Tk");
//        }
//
//    }
//}

// PROBLEM -- 10
//import java.util.Scanner;
//class p10{
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first number: ");
//        float a = sc.nextFloat();
//        System.out.println("Enter your second number: ");
//        float b = sc.nextFloat();
//        System.out.println("Enter your third number: ");
//        float c = sc.nextFloat();
//        if ( a > b && a > c ){
//            System.out.println("Maximum number is "+a);
//            if ( c < a && c < b){
//                System.out.println("Minimum number is "+c);
//            }
//            else if( b < a && c > b){
//                System.out.println("Minimum number is "+b);
//
//            }
//        }
//        else if (b > a && b > c) {
//            System.out.println("Maximum number is " + b);
//            if (c < a && c < b) {
//                System.out.println("Minimum number is " + c);
//            } else if (a < b && a < c) {
//                System.out.println("Minimum number is " + a);
//            }
//        }
//        else if ( c > a && c > b){
//            System.out.println("Maximum number is "+c);
//            if( a < b && a < c) {
//                System.out.println("Minimum number is " + a);
//            }
//            else if( b < a && c > b){
//                System.out.println("Minimum number is "+b);
//
//            }
//        }
//    }
//}
//
//import java.util.Scanner;
//
//class P10 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Taking three float numbers as input
//        System.out.print("Enter first number: ");
//        float a = sc.nextFloat();
//
//        System.out.print("Enter second number: ");
//        float b = sc.nextFloat();
//
//        System.out.print("Enter third number: ");
//        float c = sc.nextFloat();
//
//        // Initialize max and min with the first number
//        float max = a;
//        float min = a;
//
//        // Determine the maximum number
//        if (b > max) {
//            max = b;
//        }
//        if (c > max) {
//            max = c;
//        }
//
//        // Determine the minimum number
//        if (b < min) {
//            min = b;
//        }
//        if (c < min) {
//            min = c;
//        }
//
//        // Output the results
//        System.out.println("Maximum number is " + max);
//        System.out.println("Minimum number is " + min);
//
//        // Close the scanner
//        sc.close();
//    }
//}

// Problem -- 11
//import java.util.Scanner;
//class p11{
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first side of triangle: ");
//        int a = sc.nextInt();
//        System.out.println("Enter your second side of triangle: ");
//        int b = sc.nextInt();
//        System.out.println("Enter your third side of triangle: ");
//        int c = sc.nextInt();
//        if ( a == b && b == c && a == c){
//            System.out.println("This is a Equilateral Triangle ");
//        }
//        else if (a == b || b == c || a == c ){
//            System.out.println("This is a Isosceles Triangle ");
//        }
//        else {
//            System.out.println("This is a Scalenele Triangle ");
//        }
//    }
//}

// Problem - 12
//import java.util.Scanner;
//class p12n {
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter the amount the customer need to pay(Taka) ");
//        int a = sc.nextInt();
//        System.out.println("Enter the amount, customer gave(Taka) ");
//        int b = sc.nextInt();
//        int c = b-a;
//        if ( b > a ){
//            System.out.println("The returned amount is "+c+ "taka.");
//            int d,e,f,g,h,i,j = 0;
//            d = c / 100; // how many 100 notes i'll need
//            c = c % 100; // mod is used for the remaining amount
//            e = c / 50;
//            c = c % 50;
//            f = c / 20;
//            c = c % 20;
//            g = c / 10;
//            c = c % 10;
//            h = c / 5;
//            c = c % 5;
//            i = c / 2;
//            j = c % 2;
//            System.out.println("100 taka note: "+d);
//            System.out.println("50 taka note: "+e);
//            System.out.println("20 taka note: "+f);
//            System.out.println("10 taka note: "+g);
//            System.out.println("5 taka coin: "+h);
//            System.out.println("2 taka coin: "+i);
//            System.out.println("1 taka coin: "+j);
//
//        } else if ( b < a ) {
//            System.out.println("Please pay"+(a-b)+" taka more.");
//
//        }
//        else {
//            System.out.println("The returned amount is 0 taka.");
//        }
//
//
//    }
//}

/*          d = c / 100;
            c = c % 100;
            e = c / 50;
            c = c % 50;
            f = c / 20;
            c = c % 20;
            g = c / 10;
            c = c % 10;
            h = c / 5;
            c = c % 5;
            i = c / 2;
            j = c % 2;       */



////Problem - 13
//import java.util.Scanner;
// class p13{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input the 1st number: ");
//         int a = sc.nextInt();
//         System.out.println("Input the 2nd number: ");
//         int b = sc.nextInt();
//         System.out.println("Input the 3rd number: ");
//         int c = sc.nextInt();
//
//         if ( (a == b &&  b != c) || (a != b &&  b == c) ){
//             System.out.println("Neither all are equal or different");
//         }
//         else {
//             System.out.println("All numbers are different ");
//         }
//     }
//}