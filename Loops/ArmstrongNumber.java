package Loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), sum = 0, temp = num, digit;
        
        while (temp > 0) {
            digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        
        System.out.println(num == sum ? "Armstrong Number" : "Not an Armstrong Number");
        sc.close();
    }
}
