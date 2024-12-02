// 1
// class p1{
//     public static void main(String [] args){
//         int a = 0;
//         int x = 100;
//         int y = 23;
//         int z = -4;
//         if ( x > y && x > z ){
//             System.out.println("largest number: "+x);
//         }
//         else if (y > x && y > z){
//             System.out.println("largest number: "+y);
//         }
//         else{
//             System.out.println("largest number: "+z);
//         }
//     }
// }
//
// 2
// class p2{
//     public static void main(String [] args){
//         int x = 56;
//         if ( x < 50 ){
//             System.out.println("Your grade is F");
//         }
//         else if ( x <= 56){
//             System.out.println("Your grade is D");
//         }
//         else if ( x <= 69){
//             System.out.println("Your grade is C");
//         }
//         else if (x <= 84){
//             System.out.println("Your grade is B");
//         }
//         else if ( x <= 89){
//             System.out.println("Your grade is A-");
//         }
//         else if ( x <= 100){
//             System.out.println("Your grade is A");
//         }
//     }
// }
//
//3
// class p3{
//     public static void main(String[] args){
//         int x = 105;
//         if (x % 5 == 0 && x % 7==0){
//             System.out.println("Divisible by Both");
//         }
//         else if (x % 5 != 0 && x % 7==0 ){
//             System.out.println("Invalid: Divisible by 7 Only");
//
//         }
//         else if (x % 5 == 0 && x % 7 !=0 ){
//             System.out.println("Invalid: Divisible by 5 Only");
//
//         }
//         else{
//             System.out.println("No");
//         }
//
//     }
// }
//
//
//4
// class p4{
//     public static void main(String [] args){
//         int x = 2020;
//         if (x % 4 == 0){
//             System.out.println(x+" is a leap year");
//         }
//         else if (x % 400 == 0 && x % 100 == 0 ){
//             System.out.println(x+" is a leap year");
//         }
//         else{
//             System.out.println(x+" is not a leap year");
//         }
//     }
// }
//
//5
//class p5{
//    public static void main (String [] args){
//        int x = 0;
//        if (x > 0 && x % 2 != 0){
//           System.out.println("Number is positive and odd");
//        }
//        else if (x > 0 && x % 2 == 0){
//           System.out.println("Number is positive and even");
//        }
//        else if (x < 0){
//            System.out.println("Number is negative");
//        }
//        else{
//            System.out.println("Number is zero");
//        }
//    }
//}
//
//
// 6
//class p6{
//    public static void main(String [] args){
//        int x = -3;
//        if ( x < 0 ){
//            System.out.println("output: "+(2*x));
//        }
//        else if ( x >= 0 && x < 2){
//            System.out.println("output: "+(x+1));
//        }
//        else if ( x >= 2 && x < 5){
//            System.out.println("output: "+((x*x)-1));
//        }
//        else if ( x >= 5){
//            System.out.println("output: "+(3*(x*x)+2));
//        }
//    }
//}
//
//
// 7
//class p7{
//    public static void main(String [] args){
//        int id = 23301144;
//        int year,remain,session = 0;
//        year = id / 1000000;
//        remain = id % 1000000;
//        session = remain / 100000;
//        if (session == 1){
//            System.out.println("Student Joined BRAC in Spring "+year);
//        }
//        else if (session == 2){
//            System.out.println("Student Joined BRAC in Fall "+year);
//        }
//        else if (session == 3){
//            System.out.println("Student Joined BRAC in Summer "+year);
//        }
//    }
//}
//
// 8
//class p8{
//    public static void main(String [] args){
//        int sal = 15000;
//        int age = 16;
//        if (age > 18){
//           if ( sal >= 10000 && sal <= 20000){
//            System.out.println("Your tax amounts in "+(sal*0.05)+" Tk ");
//        }
//           else if ( sal > 20000){
//            System.out.println("Your tax amounts in "+(sal*0.10)+" Tk ");
//        }
//           else{
//               System.out.println("Your tax amounts in 0 Tk ");
//           }
//        }
//        else{
//            System.out.println("Your tax amounts in 0 Tk ");
//        }
//
//    }
//}
//
// 9
// class p9{
//    public static void main(String [] args){
//        double x = 18.83;
//        double y = -4.02;
//        double z = 83.12;
//        if ( x > y && x > z){
//            System.out.println("Maximum Number is "+x);
//            if ( y < z ){
//                System.out.println("Minimum Number is "+y);
//            }
//            else{
//                System.out.println("Minimum Number is "+z);
//            }
//        }
//        else if ( y > x && y > z){
//            System.out.println("Maximum Number is "+y);
//            if ( x < z ){
//                System.out.println("Minimum Number is "+x);
//            }
//            else{
//                System.out.println("Minimum Number is "+z);
//            }
//        }
//        else if ( z > x && z > y){
//            System.out.println("Maximum Number is "+z);
//            if ( y < x ){
//                System.out.println("Minimum Number is "+y);
//            }
//            else{
//                System.out.println("Minimum Number is "+z);
//            }
//        }
//    }
//}
//
//
//
// 10
// class p10{
//     public static void main(String [] args){
//         int a = 5;
//         int b = 2;
//         int c = 4;
//         if ( a != b && a != c && b != c){
//             System.out.println("This is a Scalene triangle");
//         }
//         else if ( a == b && a == c && b == c){
//             System.out.println("This is a Equilateral triangle");
//         }
//         else{
//             System.out.println("This is a Isosceles triangle");
//         }
//     }
// }
//
// 11
//import java.util.Scanner;
//class p11 {
//   public static void main(String []args){
//       Scanner sc = new Scanner(System.in);
//       System.out.println(" Enter the amount the customer need to pay(Taka) ");
//       int a = sc.nextInt();
//       System.out.println("Enter the amount, customer gave(Taka) ");
//       int b = sc.nextInt();
//       int c = b-a;
//       if ( b > a ){
//           System.out.println("The returned amount is "+c+ "taka.");
//           int d,e,f,g,h,i,j = 0;
//           d = c / 100; // how many 100 notes i'll need
//           c = c % 100; // mod is used for the remaining amount
//           e = c / 50;
//           c = c % 50;
//           f = c / 20;
//           c = c % 20;
//           g = c / 10;
//           c = c % 10;
//           h = c / 5;
//           c = c % 5;
//           i = c / 2;
//           j = c % 2;
//           System.out.println("100 taka note: "+d);
//           System.out.println("50 taka note: "+e);
//           System.out.println("20 taka note: "+f);
//           System.out.println("10 taka note: "+g);
//           System.out.println("5 taka coin: "+h);
//           System.out.println("2 taka coin: "+i);
//           System.out.println("1 taka coin: "+j);
//
//       } else if ( b < a ) {
//           System.out.println("Please pay"+(a-b)+" taka more.");
//
//       }
//       else {
//           System.out.println("The returned amount is 0 taka.");
//       }
//
//
//   }
//}
//
// 12
//class p12{
//    public static void main (String [] args){
//        int x = 123;
//        int y = 346;
//        int z = 123;
//        if ( x == y && y == z ){
//            System.out.println("All numbers are equal");
//        }
//        else if ( x != y && y == z ){
//            System.out.println(" Neither all are equal or different ");
//        }
//        else if ( x == y && y != z ){
//            System.out.println(" Neither all are equal or different ");
//        }
//        else if ( x != y && x == z){
//            System.out.println(" Neither all are equal or different ");
//        }
//        else{
//            System.out.println("All numbers are different");
//        }
//    }
//}
//
// 13
//class p13{
//    public static void main(String [] args){
//        for (int i = 24; i >= -6; i=i-6){
//            System.out.print(i+" ");
//        }
//    }
//}
//
// 14
//class p14{
//    public static void main(String [] args){
//        for (int i = -10; i <= 20; i = i+5){
//            System.out.print(i+" ");
//        }
//    }
//}
//
// 15
//class p15{
//    public static void main(String [] args){
//        int sum = 0;
//        int avg = 0;
//        for (int i = 1; i <= 200; i++){
//            sum += i;
//        }
//        avg = sum / 200;
//        System.out.println("The average is " + avg+" and\nThe sum is "+sum);
//    }
//}