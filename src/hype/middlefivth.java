package hype;

import java.util.Scanner;

public class middlefivth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во человек в очереди");


        int x = scanner.nextInt();
        int timemin = 10;
        int timemax = 20;
        int timemiddle = (timemin+timemax)/2;

        int waittimemin = x*timemin;
        int waittimemiddle = x*timemiddle;
        int waittimemax = x*timemax;


        System.out.println("минимальное время ожидания: "+ waittimemin+" минут");
        System.out.println("среднее время ожидания: "+ waittimemiddle+" минут");
        System.out.println("максимальное время ожидания: "+ waittimemax+" минут");




    }
}
