package hype;
import java.util.Scanner;
public class hardfirst {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Введите значения переменных x,y,z");


float x = scanner.nextFloat();
float y = scanner.nextFloat();
float z = scanner.nextFloat();

float result = Math.min(x,Math.min(y,z));
System.out.println(result);

    }
}
