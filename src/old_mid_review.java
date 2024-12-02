// p2
//import java.util.Scanner;
//class p2{
//    public static void main(String [] args){
//        Scanner x = new Scanner(System.in);
//        String a = "Hot Dog";
//        double ap = 4.00;
//        String b = "X-Salad";
//        double  bp = 4.50;
//        String c = "X-Bacon";
//        double cp = 5.00;
//        String d = "Toast";
//        double dp = 2.00;
//        String e = "Soda";
//        double ep = 1.50;
//        System.out.println("Please enter code from the table: ");
//        int inp = x.nextInt();
//        System.out.println("Please enter the quantity: ");
//        int quan = x.nextInt();
//        if ( inp == 1){
//            System.out.println("Item: "+a+"\nQuantity: "+quan+"\nTotal: $ "+(quan*ap));
//        }
//         else if ( inp == 2){
//            System.out.println("Item: "+b+"\nQuantity: "+quan+"\nTotal: $ "+(quan*bp));
//        }
//         else if ( inp == 3){
//            System.out.println("Item: "+c+"\nQuantity: "+quan+"\nTotal: $ "+(quan*cp));
//        }
//         else if ( inp == 4){
//            System.out.println("Item: "+d+"\nQuantity: "+quan+"\nTotal: $ "+(quan*dp));
//        }
//         else if ( inp == 5){
//            System.out.println("Item: "+e+"\nQuantity: "+quan+"\nTotal: $ "+(quan*ep));
//        }
//    }
//}

// p4
//
//import java.util.Scanner;
//import java.lang.Math;
//class p4{
//    public static void main(String [] args){
//        System.out.println("Enter A, B, C: ");
//        Scanner x = new Scanner(System.in);
//        double a = x.nextDouble();
//        double b = x.nextDouble();
//        double c = x.nextDouble();
//        if ( a <= 0 || b <= 0){
//            System.out.println("Impossible to calculate ");
//        }
//        else{
//            if ((b*b-4*a*c) < 0){
//                System.out.println("Impossible to calculate ");
//            }
//            else {
//                double y = (((-b) + Math.sqrt((b * b - 4 * a * c))) / (2 * a));
//                double z = (((-b) - Math.sqrt((b * b - 4 * a * c))) / (2 * a));
//                System.out.printf("Root#1 = %.5f", y );
//                System.out.printf("\nRoot#2 = %.5f", z );
//            }
//
//        }
//    }
//}


// p5

//import java.util.Scanner;
//class p5{
//    public static void main (String [] args){
//        Scanner x = new Scanner (System.in);
//        System.out.println("Enter the first value: ");
//        int a = x.nextInt();
//        System.out.println("Enter the Change: ");
//        int b = x.nextInt();
//        System.out.println("Enter the Last value: ");
//        int c = x.nextInt();
//        for (int i = a; i < c; i += b) {
//            if (i+b > c) { // i + b  > c --> This makes the last value higher than c and so dont comma for that
//                System.out.print(i + " ");
//            } else {
//                System.out.print(i + ", ");
//            }
//        }
//    }
//}

// p6

//import java.util.Scanner;
//class p6{
//    public static void main (String [] args){
//        Scanner x = new Scanner (System.in);
//        double y = 0.0;
//        System.out.println("Enter the nth : ");
//        int b = x.nextInt();
//        for ( int i = 1; i <= b; i++){
//            if ( i % 4 == 0){
//                y = y - (1.0 / i);
//            }
//            else {
//                y = y + (1.0 / i);
//            }
//            }
//        System.out.printf("Y = %.4f",y);
//    }
//    }
//
//

// p7

//import java.util.Scanner;
//class p7{
//    public static void main (String [] args){
//        Scanner sc = new Scanner (System.in);
//        int v = 0;
//        System.out.println("Value of N: ");
//        int n = sc.nextInt();
//        if ( n % 2 == 0){
//            System.out.println("-"+n);
//        }
//        else{
//            for (int i = n ; i <= (n + 2); i += 2){
//                v = i;
//            }
//            System.out.println(v);
//        }
//    }
//}


// p8
//
//import java.util.Scanner;
//class p8 {
//    public static void main(String[] args) {
//        Scanner x = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int a = x.nextInt();
//        while ( a != 1){
//            System.out.print(a+", ");
//            if (a % 2 == 0){
//                a = a / 2;
//            }
//            else {
//                a = a * 3 + 1;
//            }
//        }
//        System.out.print(a+" ");
//
//    }
//}

// p12

//import java.util.Scanner;
//class p12 {
//    public static void main(String[] args) {
//        Scanner x = new Scanner(System.in);
//        System.out.print("Enter  numbers: ");
//        int a = 1;
//        int max = 0;
//        int sum = 0;
//        int min = 0;
//        while (a != 0) {
//            a = x.nextInt();
//            if (a > max) {
//                max = a;
//            }
//            else if (a < min) {
//                min = a;
//            }
//            sum += a;
//        }
//        System.out.println("Max: "+max+"\nMin: "+min+"\nSum: "+sum);
//    }
//}
//
