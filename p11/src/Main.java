import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[DEBUG]: My File path: /Users/jari/Documents/School/1/oop1/p11/src/usd.txt");
        System.out.print("Enter input file: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("[ERROR]: File does not exists!\n");
            main(args);
            return;
        }

        System.out.print("Enter conversion rate (1 USD to xx.xxxx EURO CENTS): ");
        Double conversionRate = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter output file: ");
        String outputFile = scanner.nextLine();

        ArrayList<String> products = readFile(file);
        ArrayList<String> converted = convertProducts(products, conversionRate);
        writeFile(converted, outputFile);
    }

    public static ArrayList<String> convertProducts(ArrayList<String> products, Double conversionRate) {
        ArrayList<String> convertedProducts = new ArrayList<>();

        for (String product : products) {
            String name = product.split(":")[0].trim();
            Double price = Double.valueOf(product.split(":")[1]);

            String convertedPrice = Utils.euroBedrag(price * conversionRate / 100);
            String convertedProduct = name + " : " + convertedPrice;

            convertedProducts.add(convertedProduct);
        }

        return convertedProducts;
    }

    public static void writeFile(ArrayList<String> lines, String file) throws IOException {
        FileWriter writer = new FileWriter(file);

        for (String line : lines) {
            System.out.println(line);
            writer.write(line + "\n");
        }

        writer.close();
    }

    public static ArrayList<String> readFile(File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<String> lines = new ArrayList<>();

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // Filter out blanks
            if (line.trim().isBlank()) {
                continue;
            }

            lines.add(line);
        }

        return lines;
    }
}
