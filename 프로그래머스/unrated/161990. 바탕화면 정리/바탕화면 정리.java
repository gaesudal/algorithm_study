class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        answer[0] = wallpaper.length; 
        answer[1] = wallpaper[0].length(); 
        answer[2] = 0;  
        answer[3] = 0;  

        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#") && i < answer[0]) {
                answer[0] = i;
            }
            if (wallpaper[i].contains("#") && wallpaper[i].indexOf("#") < answer[1]) {
                answer[1] = wallpaper[i].indexOf("#");
            }
            if (wallpaper[i].contains("#") && i + 1 > answer[2]) {
                answer[2] = i + 1;
            }
            if (wallpaper[i].contains("#") && wallpaper[i].lastIndexOf("#") + 1 > answer[3]) {
                answer[3] = wallpaper[i].lastIndexOf("#") + 1;
            }
        }
        
        return answer;
    }
}