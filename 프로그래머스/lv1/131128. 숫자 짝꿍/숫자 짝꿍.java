class Solution {
    public String solution(String X, String Y) {
        if (X.equals(Y)) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (int i = 0; i < X.length(); i++) {
            xCount[X.charAt(i) - '0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            yCount[Y.charAt(i) - '0']++;
        }

        for (int i = xCount.length - 1; i > -1; i--) {
                for (int j = 0; j < (Math.min(xCount[i], yCount[i])); j++) {
                    sb.append(i);
                }
        }
        String answer = sb.toString();
        if (answer.length() != 0 && answer.charAt(0) == '0') {
            answer = "0";
        }

        return answer.length() == 0 ? "-1" : answer;
    }
}