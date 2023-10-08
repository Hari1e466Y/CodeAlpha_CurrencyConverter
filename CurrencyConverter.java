import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter the amount in USD: ");
        double amountInUSD = sc.nextDouble();

        System.out.println("Select the currency to convert to:");
        converter.displayCurrencyOptions();

        int choice = sc.nextInt();
        double convertedAmount = converter.convertCurrency(amountInUSD, choice);

        if (convertedAmount != -1) {
            converter.displayConversionResult(amountInUSD, convertedAmount, choice);
        } else {
            System.out.println("Invalid choice. Please select a valid option.");
        }
    }

    private double usdToInrRate = 73.95;
    private double usdToEurRate = 0.85;
    private double usdToBritishPound = 0.82;
    private double usdToAustralianDollar = 1.55;
    private double usdToCanadianDollar = 1.36;
    private double usdToSingaporeDollar = 1.37;
    private double usdToSwissFranc = 0.92;
    private double usdToJapaneseYen = 149.36;

    private void displayCurrencyOptions() {
        System.out.println("1. INR");
        System.out.println("2. EUR");
        System.out.println("3. British Pounds");
        System.out.println("4. Australian Dollar");
        System.out.println("5. Canadian Dollar");
        System.out.println("6. Singapore Dollar");
        System.out.println("7. Swiss Franc");
        System.out.println("8. Japanese Yen");
    }

    private double convertCurrency(double amountInUSD, int choice) {
        switch (choice) {
            case 1:
                return amountInUSD * usdToInrRate;
            case 2:
                return amountInUSD * usdToEurRate;
            case 3:
                return amountInUSD * usdToBritishPound;
            case 4:
                return amountInUSD * usdToAustralianDollar;
            case 5:
                return amountInUSD * usdToCanadianDollar;
            case 6:
                return amountInUSD * usdToSingaporeDollar;
            case 7:
                return amountInUSD * usdToSwissFranc;
            case 8:
                return amountInUSD * usdToJapaneseYen;
            default:
                return -1;
        }
    }

    private void displayConversionResult(double amountInUSD, double convertedAmount, int choice) {
        String[] currencies = {
                "INR", "EUR", "British Pounds", "Australian Dollar",
                "Canadian Dollar", "Singapore Dollar", "Swiss Franc", "Japanese Yen"
        };

        System.out.printf("%.2f USD is equal to %.2f %s%n", amountInUSD, convertedAmount, currencies[choice - 1]);
    }
}

