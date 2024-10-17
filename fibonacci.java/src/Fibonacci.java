import java.util.Scanner;

public class Fibonacci {
    public static boolean isFibonacci(int number) {
        int a = 0, b = 1, cont;

        if (number == 0 || number == 1) {
            return true;
        }

        while (b < number) {
            cont = a + b;
            a = b;
            b = cont;
        }

        return b == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }
}
