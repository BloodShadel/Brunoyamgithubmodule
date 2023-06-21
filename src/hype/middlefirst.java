package hype;

import java.util.Scanner;

public class middlefirst {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения двух сторон прямоугольника");


        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        float result = x*y;

        System.out.println(result);

    }
}

