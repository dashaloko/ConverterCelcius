public class Main {
    public static void main(String[] args) {
        System.out.println(" It can convert  between Fahrenheit and Celsius.");
        double fahrenheit = 98.6;
        double celsius = Main.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
    }


    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
