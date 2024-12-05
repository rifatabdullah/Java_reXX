// print 11 - 20

//class p1{
//    public static void main(String [] args) {
//        int x = 1;
//        while (x <= 1) {
//            int y = 1;
//            while (y <= 10) {
//                if (y == 10) {
//
//                        System.out.println(2 + " " + 0 + " ");
//
//                }
//
//            else{
//                    System.out.println(x + " " + y + "  ");
//                }
//                y++;
//
//            }
//            System.out.println("Inner Loop Done");
//            x++;
//            }
//        }
//
//    }

// Star Pattern

//import java.util.Scanner;
//class star{
//    public static void main (String [] args){
//        Scanner x = new Scanner (System.in);
//        System.out.println("Enter the number of Row : ");
//        int r = x.nextInt();
//        System.out.println("Enter the number of Column : ");
//        int c = x.nextInt();
//        for (int i = 1; i <= r; i++){
//            for (int j = 1 ; j <= c; j++){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
//    }
//}

// 123 pattern

//import java.util.Scanner;
//class num1{
//    public static void main (String [] args){
//        Scanner x = new Scanner (System.in);
//        System.out.println("Enter the number of Row : ");
//        int r = x.nextInt();
//        System.out.println("Enter the number of Column : ");
//        int c = x.nextInt();
//        for (int i = 1; i <= r; i++){
//            for (int j = 1 ; j <= c; j++){
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//
//        }
//    }
//}

// 111 pattern

//
//import java.util.Scanner;
//class num2{
//    public static void main (String [] args){
//        Scanner x = new Scanner (System.in);
//        System.out.println("Enter the number of Row : ");
//        int r = x.nextInt();
//        System.out.println("Enter the number of Column : ");
//        int c = x.nextInt();
//        for (int i = 1; i <= r; i++){
//            for (int j = 1 ; j <= c; j++){
//                if ( j > i){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print(i+" ");
//
//                }
//
//            }
//            System.out.println();
//
//        }
//    }
//}

// Finish Flag

//import java.util.Scanner;
//class finFlag{
//    public static void main (String [] args){
//        Scanner x = new Scanner (System.in);
//        System.out.println("Enter the number of Row : ");
//        int r = x.nextInt();
//        System.out.println("Enter the number of Column : ");
//        int c = x.nextInt();
//        for (int i = 1; i <= r; i++){
//            for (int j = 1 ; j <= c; j++){
//
//                if ( j == 4){
//                    System.out.print("  ");
//                }
//                else if (i == 5){
//                    System.out.print("  ");
//                }
//                else {
//                    System.out.print("*  ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}

// Swish Flag

//import java.util.Scanner;
//class SwishFlag{
//    public static void main (String [] args){
//        Scanner x = new Scanner (System.in);
//        System.out.println("Enter the number of Row : ");
//        int r = x.nextInt();
//        System.out.println("Enter the number of Column : ");
//        int c = x.nextInt();
//        for (int i = 1; i <= r; i++){
//            for (int j = 1 ; j <= c; j++){
//
//                if ( j == 5){
//                    if ( i >= 3 && i <= 8  ){
//                        System.out.print("*  ");
//                    }
//                    else{
//                        System.out.print("*  ");
//                    }
//                }
//                else if (i == 5){
//                       if ( j >= 3 && j <= 8  ){
//                        System.out.print("  ");
//                    }
//                    else{
//                        System.out.print("*  ");
//                    }
//                }
//                else {
//                    System.out.print("*  ");
//                }
//
//            }
//            System.out.println(" ");
//        }
//    }
//}