// To check if a number is prime or not

//import java.util.Scanner;
//class PrimeChk{
//    public static void main (String [] args){
//       Scanner x = new Scanner (System.in);
//       System.out.println("Enter a positive integer number: ");
//       int num = x.nextInt();
//       int count = 0;
//       if ( num == 1 || num ==0 ){
//           System.out.println("Not a Prime number");
//       }
//       else{
//           for (int i = 2; i < num*2 / 2 ; i++){ // A number can be divisible till it's half number
//              if (num % i == 0){
//               count++;
//               break;
//              }
//           }
//           if (count == 0){
//           System.out.println("Prime number");
//           }
//           else{
//           System.out.println("Not a Prime number");
//           }
//           }
//    }
//}


// To check prime number from given a to b. Also, How many divisors

//import java.util.Scanner;
//class primeCHK2{
//    public static void main (String [] args){
//        Scanner x = new Scanner (System.in);
//        System.out.println("Enter first Number: ");
//        int a = x.nextInt();
//        System.out.println("Enter second Number: ");
//        int b = x.nextInt();
//        int count = 0;
//        int primeCount = 0;
//        for (int i = a; i <= b; i++){
//            for (int j = 2 ; j < i / 2 ; j++){
//                if (i % j == 0){
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0){
//                primeCount++;
//                System.out.println(i);
//            }
//            count = 0;
//        }
//        System.out.println("Total Prime Numbers: "+primeCount);
//
//    }
//}






// p1

//import java.util.Scanner;
//class p1{
//    public static void main(String[] args){
//
//        int count = 0;
//        int num =2;
//        Scanner x = new Scanner (System.in);
//        System.out.println("Enter N th number : ");
//         int n = x.nextInt();
//
//         while ( n != 0){
//             for (int i = 2; i < num  / 2; i++){
//                 if (num % i == 0){
//                     count++;
//                     break;
//                 }
//             }
//             if (count == 0){
//                 System.out.println(num);
//                 n--;
//             }
//             num++;
//             count = 0;
//         }
//    }
//}
//
//
//











