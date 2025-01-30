import java.util.Scanner;
public class Primechecker{
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(isPrime(number) ? number + " is prime." : number + " is not prime.");
        scanner.close();
    }
}
