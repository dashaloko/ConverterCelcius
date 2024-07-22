public class Main {
    public static void main(String[] args) {
        System.out.println(" It can convert  between Fahrenheit and Celsius.");
        double fahrenheit = 98.6;
        double celsius = Main.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
        celsius = 37.0;
        fahrenheit = Main.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

    }


    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
