////public class AS4 {
////    public static void main(String[] args) {
////        int return;
////
////    }
////}
//
//// New Assignment Fall2024
//
//// Task - 11
////2.1
//class p11{
//    public static void main (String [] args ){
//        int a ;
//         a = 6;
//        System.out.println(a);
//    }
//}
//
//
//// 2.2
//class p11{
//    public static void main (String [] args ){
//        int a ;
//         a = 6;
//         int b;
//         b = 3;
//         a = a+b;
//        System.out.println(a);
//    }
//}
//
//// 2.3
//class p11{
//    public static void main (String [] args ){
//        int a ;
//         a = 6;
//         int b;
//         b = 3;
//         System.out.println(a * b);
//         System.out.println(a / b);
//    }
////}
//
//// 2.4
//class p11{
//    public static void main (String [] args ){
//        double a;
//         a = 6.879d;
//         double b;
//         b = 3.868d;
//         System.out.println(a + b);
//         System.out.println(a * b);
//         System.out.println(a / b);
//    }
//}
//
////2.5
//class p11{
//    public static void main (String [] args ){
//        double a;
//         a = 6.879d;
//         int b;
//         b = 3;
//         System.out.println(a + b);
//         System.out.println(a * b);
//         System.out.println(a / b);
//    }
//}
//
//// 2.6
//
////2.6.1
//class p11{
//    public static void main (String [] args ){
//        String a;
//         a = "Hello";
//         String  b;
//         b = "BRIXX";
//         System.out.println(a + b);
//    }
//}
//
////2.6.2 (Can't possible)
//class p11{
//    public static void main (String [] args ){
//         int a;
//         a = 6;
//         String b;
//         b = Hello ;
//         System.out.println(a + b);
//    }
//}
//
//// 2.6.3
//class p11{
//    public static void main (String [] args ){
//         String a;
//         a = "Hello";
//         int b;
//         b = 8;
//         System.out.println(a + b);
//    }
//}
//
//// 12
//class p12{
//    public static void main (String [] args){
//        int r =  4;
//        double area;
//        area = Math.PI*(r*r);
//        System.out.println(area);
//    }
//}
//
//// 13
// class p13 {
//    public static void main (String[] args){
//
//        int x = 4786%100;
//
//        System.out.printf("Last two digits : %02d\n", x);
//
//
//    }
//
//// 14
//class P14 {
//    public static void main (String[] args){
//         double a = 1000;
//         double formula = (0.0254*a);
//         System.out.printf("%.0f inch is %.1f meters\n",a, formula);
//
//    }
//}
//
//// 15
//
// //  a
// class 15{
//    public static void main (String[] args){
//       int a = 29;
//       int b = 26;
//       System.out.printf("Initial Integer values are : %d,%d \n",a,b);
//       int temp = a;
//       a=b ;
//       b = temp;
//       System.out.printf("Swapped values are: %d,%d \n",a,b);
//
//    }
//}
//
// //  b
// class 15{
//     public static void main (String[] args){
//         int a = 29;
//         int b = 26;
//         System.out.printf("Initial Integer values are : %d,%d \n",a,b);
//         a= a+b;
//         b= a-b;
//         a= a-b;
//         System.out.printf("Swapped values are: %d,%d \n",a,b);
//
//     }
// }
//
//// 16
//
// class p16{
//    public static void main(String[] args){
//        int min = 3456789; // minutes
//        int tdays = min / 1440;
//        int year = tdays / 365;
//        int days = tdays % 365;
//        System.out.printf("%d minutes is approximately %d years and %d days",min,year,days);
//
//
//    }
// }
//
////17
//
// class p17{
//     public static void main (String[] args){
//         int a = 2;
//         int b = 5;
//         int c = 8;
//         double d = (2*b*((c-a)/3)) + 7;
//         System.out.printf("Value of d is: %.0f", d);
//
//
//     }
//
// }
//
//// 18
//
// class p18{
//     public static void main(String[] args){
//         int sID = 23221454;
//         int x = sID % 100;
//         int f = x % 10;
//         int s = x / 10;
//         System.out.println(f+"\n"+s+"\n");
//     }
// }
//
////
//
////


// 13
//class p13{
//    public static void main (String [] args){
//        int x = 9839;
//        int y = x % 100;
//        System.out.println("Last Two digits:"+y);
//    }
//}

// 14
//class p14{
//    public static void main (String [] args){
//        int x;
//        x = 1000;
//        double y = x * 0.0254d;
//        System.out.println("Given a value for inch: "+x);
//        System.out.println(x+" inch is "+y+" meters");
//    }
//}

// 15
//class p15a{
//    public static void main (String [] args){
//        int x;
//        x = 10;
//        int y;
//        y = 5;
//        int c ;
//        c = x;
//        x = y;
//        y = c;
//        System.out.println(x);
//        System.out.println(y);
//
//    }
//}

// 15 b
//class pb{
//    public static void main(String [] args){
//        int a = 10;
//        int b = 6;
//        System.out.printf("%d , %d  are the values of initial two variables\n",a,b);
//
//        a = a+b;
//        b = a - b;
//        a = a - b;
//        System.out.printf("%d, %d are the swapped values of initial variables\n",a,b);
//
//    }
//}

// 16
// Wrong Way
/*Your Java program has a small logical error in the
calculation of the number of days remaining after
converting minutes to years. Specifically, you're
calculating the number of years correctly, but when
you calculate the remaining days, you should be
using the total minutes minus the minutes that
make up the full years, rather than using the years directly*/

//class p16{
//    public static void main ( String [] args){
//       int x =  3456789;
//       int y =0;
//       y = x / (60 * 24 * 365);
//       int days = y % 365;  // errors x
//       System.out.println(x+" minutes is approximately "+y+" years and "+days+" days");
//// mod actually gives the remainder and the remainder is the left days without completing a year
//    }
//}

// Corrected Way
//class p16{
//    public static void main (String [] args){
//        int x = 3456789;
//        int days = x / (60*24);
//        int years = days / 365;
//        int rday = days % 365;
//        System.out.println(x+" minutes is approximately "+years+" years and "+rday+" days");
//
//    }
//}


// if  Question asked in years,months,days format
//class p16{
//    public static void main(String [] args){
//        int n = 3456789;
//        int days = n / (60*24);
//        int year = days / 365;
//        int rday = days % 365;
//        int month = rday / (30);
//        int day  = rday % 30;
//
//        System.out.println(year+" years "+month+" months "+day+" days");
//
//
//    }
//}

// 18
//class p18{
//    public static void main (String []args ){
//        int x = 23221454;
//        int y = x % 100;
//        int a = y % 10;
//        int b = y / 10;
//        System.out.println(a);
//        System.out.println(b);
//
//    }
//}

// 19
//import java.lang.Math;
//class p19{
//    public static void main(String [] args){
//        int a = 8 / 2; // Base of the triangle in Hexagon;
//        int b = 3; // Height of the triangle
//        double c = Math.sqrt((a*a)+(b*b)); // same side of the hexagon
//        double cir = 6*c;
//        double area = (2.59)*(c*c);
//        System.out.println("The area of the Hexagon is "+area+" \nand the Circumference is "+cir);
//
//    }
//}


//20
//import java.lang.Math;
//class p20{
//    public static void main(String [] args){
//        float a = 4.5f;
//        float b = 9.5f;
//        double c = Math.sqrt((a*a)+(b*b));
//        double sinA = a / c;
//        double cosA = b / c;
//        double sinB = b / c;
//        double cosB = a / c;
//        System.out.println("sin(A) = "+sinA+"\ncos(A) = "+cosA+"\nsin(B) = "+sinB+"\ncos(B) = "+cosB);
//
//    }
//}

// Old Assignemnt 2

// 2
//import java.util.Scanner;
//class p2{
//    public static void main(String [] args){
//        Scanner x = new Scanner(System.in);
//        System.out.println("Enter your Score: ");
//        int y = x.nextInt();
//        if ( y < 50){
//            System.out.println("Your grade is F !!");
//        }
//        else {
//            if (y <= 56){
//                System.out.println("Your grade is D");
//            } else if ( y <= 69) {
//                System.out.println("Your grade is C");
//            }
//            else if (y <= 84){
//                System.out.println("Your grade is B");
//            }
//            else if (y <= 89){
//                System.out.println("Your grade is A- ");
//            } else if (y <= 100) {
//                System.out.println("Your grade is A+ ");
//            }
//
//            }
//        }
//    }




// 5
//import java.util.Scanner;
//class p5{
//    public static void main(String [] args){
//        Scanner x = new Scanner(System.in);
//        System.out.println("Enter a Year: ");
//        int y = x.nextInt();
//        if ( y % 4 == 0){
//            System.out.println(y+" is a leap year ");
//        }
//        else if ( y % 100 == 0 ){
//                if ( y%400 == 0 ){
//                    System.out.println(y+" is a leap year ");
//                }
//                else {
//                System.out.println(y+" is not leap year ");
//            }
//         }
//        else{
//            System.out.println(y+" is not a leap year ");
//        }
//    }
//}


class main{
    public static void main (String[] args){
        int i = 24;
        while ( i <= -6 ){
            if ( i == -6 ){
                System.out.println(i+" ");
            }
            System.out.println( i+", ");
            i -= 6;
        }

    }
}