// 3.Program using Command-Line Arguments.
import java.io.*;
public class SumCalculator {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        if (args.length > 0) {
            for (String arg : args) {
                try {
                    sum += Integer.parseInt(arg);
                } catch (NumberFormatException e) {
                    System.out.println("Ignoring non-numeric argument: " + arg);
                }
            }
        } else {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter numbers separated by spaces:");
            String input = reader.readLine();
            String[] inputArgs = input.split("\\s+");

            // Sum integers from user input
            for (String arg : inputArgs) {
                try {
                    sum += Integer.parseInt(arg);
                } catch (NumberFormatException e) {
                    System.out.println("Ignoring non-numeric argument: " + arg);
                }
            }
        }

        System.out.println("Sum: " + sum);
    }
}
//output
// Arguments :3 5 7
// Sum:15
// Arguments:1 2 a 3
// Ignoring non numeric argument a
// Sum :6