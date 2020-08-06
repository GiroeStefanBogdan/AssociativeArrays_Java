//Description
//Read a list of real numbers and print them in ascending order along with their number of occurrences.
//
//Examples
//Input                                             Output
//82282                                             2 -> 3
//                                                  8 -> 2

package AssociativeArrayPackage;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");
        double[] numbers = new double[line.length];

        for (int i = 0; i <=numbers.length-1; i++) {
            numbers[i] =  Double.parseDouble(line[i]);
        }

        TreeMap<Double, Integer> printInAsscending = new TreeMap<>();

        for (int i = 0; i <=numbers.length-1; i++) {
            printInAsscending.put(numbers[i], 0);
        }

        for (int i = 0; i <=numbers.length-1; i++) {
            printInAsscending.put(numbers[i], printInAsscending.get(numbers[i]) + 1);
        }

        for (Map.Entry<Double, Integer> entry : printInAsscending.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#####");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }

    }
}
