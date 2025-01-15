package ss3_array.thuc_hanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int number;
        System.out.println("Menu");
        System.out.println("1.Celsius to Fahrenheit");
        System.out.println("2.Fahrenheit to Celsius");
        System.out.println("0.Exit");
        System.out.println("Nhập vào cách thức chuyển đổi:");
        number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Nhập vào độ C:");
                celsius = scanner.nextDouble();
                System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.println("Nhập vào độ F:");
                fahrenheit = scanner.nextDouble();
                System.out.println("Fahrenheit to Celsius : " + fahrenheitToCelsius(fahrenheit));
                break;
            case 0:
                System.out.println(" Kết thúc");
                System.exit(0);

        }

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }


}
