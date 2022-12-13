
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (work) {
            System.out.print("Input float number: ");
            try {
                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Your number is %f\n", fNumber);
                work = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Incorrect input. Input float number!");
            }

        }
    }
}
