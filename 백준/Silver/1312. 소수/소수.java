import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputArray = input.split(" ");

        int A = Integer.parseInt(inputArray[0]);
        int B = Integer.parseInt(inputArray[1]);
        int num = Integer.parseInt(inputArray[2]);

        int calNum = A%B;

        for (int i = 0; i < num-1; i++) {
            calNum *= 10;
            calNum %= B;
        }
        calNum *= 10;
        calNum /= B;
        System.out.println(calNum);
    }

}