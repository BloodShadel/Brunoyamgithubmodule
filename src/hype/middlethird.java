package hype;

import java.util.Scanner;

public class middlethird {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение стороны квадрата");


        float x = scanner.nextFloat();

        float result = x*x;

        System.out.println(result);

    }
}
