import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        printNumbersInRange(num1, num2);
        
        scanner.close();
    }
    
    public static void printNumbersInRange(int start, int end) {
        int min = Math.min(start, end);
        int max = Math.max(start, end);
        
        System.out.println("Odd numbers between " + min + " and " + max + ":");
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }