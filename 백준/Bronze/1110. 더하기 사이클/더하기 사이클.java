import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialInput = sc.nextInt();
        int tmpInput = initialInput;
        int tenthDigit;
        int unitsDigit;
        int result;
        int cycle = 0;
        while (true) {
            cycle++;
            tmpInput = Integer.parseInt(String.format("%02d", tmpInput));
            tenthDigit = tmpInput / 10;
            unitsDigit = tmpInput % 10;

            result = (unitsDigit * 10) + ((tenthDigit + unitsDigit) % 10);

            if (result == initialInput) {
                System.out.println(cycle);
                break;
            }
            tmpInput = +result;
        }
    }
}