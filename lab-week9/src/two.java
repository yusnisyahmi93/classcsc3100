
public class two {
	  public static void main(String[] args) {
	  System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
      System.out.println("-----------------------------------------------");

      for (int celsius = -40; celsius <= 100; celsius += 10) {
          double fahrenheit = (celsius * 1.8) + 32;
          double celsiusConverted = (fahrenheit - 32) / 1.8;
          System.out.printf("%d\t%.2f\t\t|\t%.2f\t\t%.2f%n", celsius, fahrenheit, fahrenheit, celsiusConverted);
      }
 }
}