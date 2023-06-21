package hype;

import java.util.Scanner;

public class hardsecond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения зряплат");


        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float z = scanner.nextFloat();
        float n = scanner.nextFloat();

        float resultmin = Math.min(x,Math.min(y,Math.min(z,n)));
        float resultmax = Math.max(x,Math.max(y,Math.max(z,n)));
        float result = resultmax - resultmin;
        System.out.println(result);

    }
}

