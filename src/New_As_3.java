// 1

//class p1{
//    public static void main(String [] args){
//        for (int i = 18; i <=  63; i = i + 9 ){
//            if ( i == 63){
//                System.out.print(i+" ");
//            }
//            else{
//                System.out.print(i+", ");
//            }
//
//
//        }
//    }
//}

// 2
//
//class p2{
//    public static void main(String [] args){
//        for (int i = 18; i <= 63; i = i+9){
//            if ( i % 2 == 0) {
//                System.out.print(i + ", ");
//            }
//            else if(i % 2 != 0) {
//                if ( i == 63){
//                    System.out.print("- "+i+" ");
//                }
//                else{
//                    System.out.print("- "+i+", ");
//                }
//
//            }
//        }
//    }
//}

// 3

//class p3{
//    public static void main(String [] args){
//        int sum = 0;
//        for ( int i = 0; i <= 600; i++){
//            if ( i % 7 == 0 && i % 9 == 0){
//                sum += i; // sum = sum + i
//            }
//            else{
//                sum += 0;
//            }
//        }
//        System.out.println(sum);
//    }
//}

 // 4
//class p4{
//    public static void main(String [] args){
//        int sum = 0;
//        for (int i = 0; i <= 600; i++){
//            if ( i % 7 == 0 || i % 9 == 0 ){
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//    }
//}

// 5
//class p5{
//    public static void main(String [] args){
//        int sum = 0;
//        for (int i = 0; i <= 600; i++){
//            if ( i % 7 == 0 || i % 9 == 0 ){
//                sum += i;
//            }
//            if (i % 7 == 0 && i % 9 == 0 ){
//                sum -= i; // sum = sum - i
//            }
//
//        }
//        System.out.println(sum);
//    }
//}

// 6
//class p6{
//    public static void main(String [] args){
//        int n = 20;
//        int sum = 0;
//        for (int i = 1; i <= n; i++){
//            if ( i % 2 == 0) {
//                sum -= (i*i); // even number
//            }
//            else if(i % 2 != 0) {
//                sum += (i*i); // odd numbers
//            }
//        }
//        System.out.println(sum);
//    }
//}

// 7

//class p7{
//    public static void main(String [] args){
//        int n = 6;
//        for (int i = 1; i <= n; i ++){
//            if ( n % i == 0){
//                System.out.println(i+" ");
//            }
//      }
//    }
//}


// 8

//class p8{
//    public static void main(String [] args){
//        int sum = 0;
//        int n = 5;
//        System.out.println("The odd numbers are: ");
//        for (int i = 0; i <= n*2; i++){
//           if (i % 2 != 0){
//               sum += i; // sum = sum + i
//               System.out.println(i);
//           }
//        }
//        System.out.println("The Sum of odd Natural Numbers up to 5 terms is: "+sum);
//    }
//}

// 9

//class p9{
//    public static void main(String [] args){
//        int sum = 0;
//
//        for ( int i = 1; i <= 10; i++){
//            sum += i;
//            System.out.println("Current Number: "+i+", Sum: "+sum);
//        }
//    }
//}

// 10
//class p10{
//    public static void main (String [] args){
//        int n =  40;
//        for ( int i = 1; i <= n; i++){
//            if ( i % 5 == 0 && i % 3 != 0 ){
//                System.out.println(i);
//            }
//        }
//    }
//}

// 11
//class p11{
//    public static void main (String [] args){
//        int count = 0;
//        int n = 5467;
//        for ( int i = n ; i > 0 ; i = i /10){ // This (i=i / 10) will make sure the time it runs equals to the total digits
//            count = count + 1; // count += 1
//        }
//         System.out.println("Total digits = "+count);
//    }
//}

// 12

//class p12{
//    public static void main (String [] args){
//        int num = 32768;
//        for ( int i = num; i > 0; ){
//            int x = i % 10;
//            i = i /10;
//            if ( i > 0 ){
//                System.out.print(x+", ");
//            }
//            else {
//                System.out.print(x+" ");
//            }
//        }
//    }
//}




//
//// 12
//class p12{
//    public static void main(String [] args){
//        int num = 32768;
//        int d = 0;
//        while (num > 0){
//            d = num % 10;
//            num = num / 10;
//            if ( num > 0 ) {
//                System.out.print(d+", ");
//            }
//            else {
//                System.out.print(d);
//            }
//        }
//    }
//}



// 13

//class xy{
//    public static void main (String [] args){
//        int count = 0;
//        int num = 32768;
//        for (int i = num; i > 0; i = i / 10){
//            count += 1;
//        }
//        while (num > 0){
//            double x = Math.pow(10,(count-1));
//            int y = num / (int) x ;
//            num = num % (int) x ;
//            if ( num > 0){
//                System.out.print(y+", ");
//            }
//            else {
//                System.out.print(y+" ");
//            }
//            count -= 1;
//        }
//    }
//}


//// 13
//
//class p13{
//    public static void main (String [] args){
//      double  num = 32768;
//      int count = 0;
//      double i,j = 0;
//      for ( i = num; i > 0; i = i / 10 ){
//          count++;
//      }
//      for  ( j = num; j > 0;  ){
//          double xx = Math.pow(10,(count - 1));
//
//          double y = j / xx;
//          j = j % xx;
//          if ( j > 0 ){
//              System.out.print(y + ", ");
//          }
//          else {
//              System.out.print(y + " ");
//          }
//          count -= 1;
//
//      }
//    }
//}


// 14
//class p14{
//    public static void main (String [] args){
//        int n = 7;
//        for (int i = 1; i <= n; i++){
//            if ( n % i == 0){
//                System.out.println(n+" is prime number");
//            }
//        }
//    }
//}
//


// 15
/* A perfect number is defined as a positive integer
that is equal to the sum of its proper divisors,
excluding itself. For example, the number 6 is a
perfect number because its proper divisors are 1, 2,
and 3, and their sum is 1+2+3 = 6 1+2+3=6. Other
examples of perfect numbers include 28, 496, and 8128
 */

//class p15{
//    public static void main (String [] args){
//        int n = 6;
//        int x = 0;
//        for ( int i = 1; i < n; i++ ){
//            if ( n % i == 0 ){
//                x += i;
//            }
//        }
//        if ( x == n){
//            System.out.println(n+" is a perfect number ");
//        }
//        else{
//            System.out.println(n+" is not a perfect number ");
//        }
//    }
//}











// 13 modified


//class p13 {
//    public static void main(String[] args) {
//        int num = 32768;
//        int d = 1;
//        int x = num;
//        int count = 0;
//
//      for ( int i = num; i > 0; i = i / 10 ){
//          count++;
//      }
//      for (int i = 1; i < count; i++) {
//            d *= 10;
//      }
//      while (d > 0) {
//            int digit = num / d;
//            System.out.print(digit);
//            if (d > 1) {
//                System.out.print(", ");
//            }
//            num %= d;
//            d /= 10;
//      }
//    }
//}





/* Find all odd divisors of N. For each odd divisor,
multiply it by its square and calculate the cumulative product
of all such values. Finally the program should determine
whether the resulting product is divisible by 7 or not. */

//class px{
//    public static void main(String [] args){
//        int n = 7;
//        int sum = 0;
//        for ( int i = 1; i <= n; i++){
//            if ( n % i == 0 && i % 2 != 0){
//                sum = sum * (i*i);
//            }
//        }
//        if ( sum % 7 ==0){
//            System.out.println(" The product is divisible by 7 ");
//        }
//        else{
//            System.out.println(" The product is not divisible by 7 ");
//        }
//    }
//}




























