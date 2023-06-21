package hype;

import java.util.Scanner;

public class middleforth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную");


        float x = scanner.nextFloat();
        int result = 1;
        if(x%10==0){
            System.out.println("делится на 10");
        }
        else {
            System.out.println("не делится на 10");
        }
        if(x%5==0){
            System.out.println("делится на 5");
        }
        else {
            System.out.println("не делится на 5");
        }
        if(x%2==0){
            System.out.println("делится на 2");
        }
        else {
            System.out.println("не делится на 2");
        }

    }
}
