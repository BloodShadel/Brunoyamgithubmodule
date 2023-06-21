package hype;

import java.util.Scanner;

public class middlesixth {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество проголосовавших за первого и второго кандидата");


        int x = scanner.nextInt();
        int y = scanner.nextInt();

        float sum = (float) x + y;
        float percentfirstcan = (100*x)/sum;
        float percentsecondcan = (100*y)/sum;

        System.out.println(percentfirstcan+ "%  " +percentsecondcan + "%");

    }
}
