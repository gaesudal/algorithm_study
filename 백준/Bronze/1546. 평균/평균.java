import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        sc.nextLine();

        String[] scoreStr = sc.nextLine().split(" ");
        double[] scoreArray = Arrays.stream(scoreStr).mapToDouble(Double::parseDouble).toArray();
        double bestScore = Arrays.stream(scoreArray).max().orElseThrow(NoSuchElementException::new);
        for (int i = 0; i < count; i++) {
            scoreArray[i] = scoreArray[i] / bestScore * 100.0;
        }
        double avgScore = Arrays.stream(scoreArray).average().orElse(0);
        System.out.println(avgScore);
    }
}