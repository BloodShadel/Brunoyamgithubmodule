package hype;

import java.util.Scanner;

public class middlesecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения высоты и основания");


        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        float result = (x*y)/2;

        System.out.println(result);

    }
}

