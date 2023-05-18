import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> strList = Arrays.asList("aya", "ye", "woo", "ma");

        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < strList.size(); j++) {
                babbling[i] = babbling[i].replaceAll(strList.get(j),String.valueOf(j));
                if (babbling[i].contains(""+j+j)) {
                    babbling[i] = "false";
                    break;
                }
            }
        }

        for (String babble:
        babbling) {
            if (babble.matches("^[0-9]*$")) {
                answer++;
            }
        }
        return answer;
    }
}