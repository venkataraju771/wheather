import java.util.Scanner;

public class WeatherAPIProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1. Get weather");
            System.out.println("2. Get Wind Speed");
            System.out.println("3. Get Pressure");
            System.out.println("0. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the new line character after reading the integer input

            switch (option) {
                case 1:
                    getWeatherData(scanner);
                    break;
                case 2:
                    getWindSpeedData(scanner);
                    break;
                case 3:
                    getPressureData(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void getWeatherData(Scanner scanner) {
        System.out.println("Enter the date:");
        String date = scanner.nextLine();
        // Code to get weather data using the API and print the temperature for the input date
        System.out.println("Temperature for " + date + ": 25°C"); // Dummy data
    }

    private static void getWindSpeedData(Scanner scanner) {
        System.out.println("Enter the date:");
        String date = scanner.nextLine();
        // Code to get weather data using the API and print the wind speed for the input date
        System.out.println("Wind speed for " + date + ": 10 km/h"); // Dummy data
    }

    private static void getPressureData(Scanner scanner) {
        System.out.println("Enter the date:");
        String date = scanner.nextLine();
        // Code to get weather data using the API and print the pressure for the input date
        System.out.println("Pressure for " + date + ": 1013 hPa"); // Dummy data
    }
}
