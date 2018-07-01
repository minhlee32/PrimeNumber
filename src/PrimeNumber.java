import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        System.out.println("Solved " + isPrime(number));
    }

    public static boolean isPrime(int number) {
        boolean check = true;
        for (int i = 1; i <= 1000; i++) {
            if (number < 2)
                System.out.println(number + " is not a prime");
            else {
                i = 2;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        check = false;
                        System.out.println(number+ " is not a prime number");
                        break;
                    }
                    System.out.println(number + " is a prime number");
                    break;
                }
                break;
            }
        }
        return check;
    }

    }