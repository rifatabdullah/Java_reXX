 // Using Print Function
//import java.util.Scanner;
//
//public class AS2 {
//    public static void main(String[] args) {
//
//        int a = 5;
//        int b = a--;
//        System.out.println(a);
//        System.out.println(b);
//
//        Scanner x = new Scanner(System.in);
//        System.out.println("Give me your name:");
//        String y = x.nextLine();
//        System.out.println(y);
//    }
//}
// Problem 02

//        int a;
//        a = 6;
//        int b;
//        b=5;
//        System.out.println(a+b);
//        System.out.println(a*b);
//        System.out.println(a/b);


//          double a ;
//          double b;
//          a = 10.567d;
//          b = 5;
//          System.out.println(a + b);
//          System.out.println(a*b);
//          System.out.println(a/b);

//        String a ;
//        String b;
//        a = "ami";
//        b= "tmi";
//        System.out.println(a+b);
//

//        int a = 5;
//        String b = "tmi";
//        System.out.println(a+b);

//    }
//}

// 3
//import java.util.Scanner;
//public class AS2 {
//
//    public static void main(String [] args)
//    {
//    Scanner r = new Scanner(System.in);
//    System.out.println("Enter Radius : ");
//    int rad = r.nextInt();
//    double circum = (2*3.1416*rad);
//    double area = 3.1416*(circum*circum) ;
//    System.out.printf("Your area is : %.2f\n", area);
//    System.out.printf("Your circumference is : %.2f\n", circum);
//
//
//    }
//}


//import java.util.Scanner;
//
//// problem 4
// class p4 {
//    public static void main (String[] args){
//
//        int x = 4786%100;
//
//        System.out.printf("Last two digits : %02d\n", x);
//
//
//    }
//
//
//}

// Problem 05 - modified
//import java.util.Scanner;
//class P5 {
//    public static void main (String[] args){
//        Scanner x = new Scanner(System.in);
//        System.out.println("Given value for inch:");
//         double a = x.nextInt();
//         double formula = (0.0254*a);
//         System.out.printf("%.0f inch is %.1f meters\n",a, formula); // %.0f used for a, %.1f used for formula (format specifier)
//
//
//
//
//    }
//}

// Problem 06
 // Approach a
// class p6{
//    public static void main (String[] args){
//       int a = 29;
//       int b = 26;
//       System.out.printf("Initial Integer values are : %d,%d \n",a,b);
//       int temp = a;
//       a=b ;
//       b = temp;
//       System.out.printf("Swapped values are: %d,%d \n",a,b);
//
//
//
//    }
//}

 // Approach b
// class p6{
//     public static void main (String[] args){
//         int a = 29;
//         int b = 26;
//         System.out.printf("Initial Integer values are : %d,%d \n",a,b);
//         a =a+b;
//         b= a-b;
//         a= a-b;
//         System.out.printf("Swapped values are: %d,%d \n",a,b);
//
//
//
//     }
// }


// Problem 07

 /* In order to use floor division we need to use --
 ~ import java.lang.Math ~
 and the function is -- ~ Math.floorDiv() ~ method
  */
// import java.lang.Math;
// class p07{
//    public static void main(String[] args){
//        int min = 3456789; // minutes
////      int tdays = Math.floorDiv(min,1440); // days
//        int tdays = min / 1440; // its possible to do without floor division as int only OUTPUT the decimal vale
//        int year = tdays / 365;
//        int days = tdays % 365;
//        System.out.printf("%d minutes is approximately %d years and %d days",min,year,days);
//
//
//    }
// }


// class p8{
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

 // Problem - 09
// class p9{
//     public static void main(String[] args){
//         int n = 5;
//         System.out.printf("%d x 1 = %d%n", n, n * 1);
//         System.out.printf("%d x 2 = %d%n", n, n * 2);
//         System.out.printf("%d x 3 = %d%n", n, n * 3);
//         System.out.printf("%d x 4 = %d%n", n, n * 4);
//         System.out.printf("%d x 5 = %d%n", n, n * 5);
//         System.out.printf("%d x 6 = %d%n", n, n * 6);
//         System.out.printf("%d x 7 = %d%n", n, n * 7);
//         System.out.printf("%d x 8 = %d%n", n, n * 8);
//         System.out.printf("%d x 9 = %d%n", n, n * 9);
//         System.out.printf("%d x 10 = %d%n", n, n * 10);
//
//     }
// }

 //Problem - 10
// class p10{
//     public static void main(String[] args){
//         int n =100;
//         int a = 1;
//         int L = 100;
//         int S = ((n/2)*(a+L));
//         System.out.println(S);
//     }
// }

 // Problem - 11
// import java.lang.Math;
// class p11{
//     public static void main (String[] args){
//         double a = 4.5;
//         double b = 9.5;
//         double cc = ((a*a)+(b*b));
//         double c = Math.sqrt(cc);
//         System.out.println(c);
//
//     }
// }

 // Problem - 12
 class p12{
     public static void main(String[] args){
         int sID = 23221454;
         int x = sID % 100; // mod by 10,100,1000 will gave you the last 1,2,3 digits of that number
         int f = x % 10;  // now this will give you last digit of x
         int s = x / 10; // this eventually give you 5.4 but as  we take this data as int it'll only give us 5
         System.out.println(f+"\n"+s+"\n");
     }
 }

 // Problem - 13 -- still have some problems
// import java.util.Scanner;
// class P12{
//     public static void main (String [] args){
//         Scanner xc = new Scanner(System.in);
//         System.out.println("Enter your Student ID: \n");
//         int x = xc.nextInt();
//         x = x % 10000;
//         System.out.println(x);
//
//         double hour = 5 +(56/60.0)+(23/3600.0);
//         double kmh = (x / 1000)/hour;
//         double milesh = (x / 1609.0)/hour;
//         System.out.printf("Your velocity in km/h is %f\n",kmh);
//         System.out.printf("Your velocity in miles/h is %f\n",milesh);
//
//     }
// }
