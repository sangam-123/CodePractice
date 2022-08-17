//The number which will be divisible by 1 and itself then that number is a prime number.
//0 and 1 are not prime numbers

public class PrimeNumber {
    static void PrimenumCheck(int n){

        int flag = 0;
        //checking edge cases since o and 1 are not prime numbers
        if(n <= 1) {
            System.out.println(n + " is not a prime number.");

        } else {
            //if not 0 and 1 then this block of code will be executed
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number.");
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0) {
            System.out.println(n + " is a prime number.");
        }
    }
    public static void main(String[] args) {
            PrimenumCheck(101);

    }
}

