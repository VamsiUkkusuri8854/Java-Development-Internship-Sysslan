import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        double temperature;
        double res;
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                res = (temperature * 9 / 5) + 32;
                System.out.printf("%.2f °C = %.2f °F%n", temperature, res);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                res = (temperature - 32) * 5 / 9;
                System.out.printf(  "%.2f °F = %.2f °C%n", temperature, res);
                break;
            default:
                System.out.println("Invalid option selected!");
        }
        sc.close();
    }
}