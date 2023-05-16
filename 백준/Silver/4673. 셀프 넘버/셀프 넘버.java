import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> selfNumberSet = new HashSet<>();
        for (int i = 1; i <= 10000; i++) {
            int tmpNum = i;
            int result = i;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                result += tmpNum%10;
                tmpNum /= 10;
            }
            selfNumberSet.add(result);
        }
        for (int i = 1; i <= 10000; i++) {
            if (!selfNumberSet.contains(i)) {
                System.out.println(i);
            }
        }
    }
}