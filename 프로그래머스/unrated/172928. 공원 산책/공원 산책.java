class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for (int i = 0; i < park.length; i++) {
            if (park[i].contains("S")) {
                x = park[i].indexOf("S");
                y = i;
            }
        }

        int tmpX;
        int tmpY;
        
        for (int i = 0; i < routes.length; i++) {

            String[] route = routes[i].split(" ");
            String direction = route[0];
            int step = Integer.parseInt(route[1]);

            tmpX = x;
            tmpY = y;

            for (int j = 0; j < step; j++) {
                if (direction.equals("N")) {
                    y -= 1;
                } else if (direction.equals("S")) {
                    y += 1;
                } else if (direction.equals("W")) {
                    x -= 1;
                } else if (direction.equals("E")) {
                    x += 1;
                }

                if (y > park.length-1 || x > park[0].length()-1 || y < 0 || x < 0) {
                    x = tmpX;
                    y = tmpY;
                    break;
                }
                if (park[y].charAt(x) == 'X') {
                    x = tmpX;
                    y = tmpY;
                    break;
                }
            }

        }
        answer[0] = y;
        answer[1] = x;

        return answer;
    }
}