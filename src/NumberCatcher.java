import java.util.Scanner;

public class NumberCatcher {
    public int getInteger(String instruction, int min) {
        System.out.println(instruction);
        int number = -1;

        while (number < 0) {
            try {
                number = getNumber();
                validateNumber(number, min);
            } catch (InvalidParameterException e) {
                number = -1;
                System.out.println("Invalid number. Must be greater than " + min + ". Please try again.");
            } catch (Exception e) {
                number = -1;
                System.out.println("Invalid number. Please try again.");
            }
        }

        return number;
    }

    private void validateNumber(int value, int min) {
        if (value < min) {
            throw new InvalidParameterException("Number must be greater than " + min);
        }
    }

    private int getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
