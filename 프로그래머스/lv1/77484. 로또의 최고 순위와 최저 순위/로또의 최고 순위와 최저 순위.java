class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int numZero = 0;
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(lottos[j]==win_nums[i]){
                    cnt++;
                }
            }
            if(lottos[i] == 0)
                numZero++;
        }
        
        answer[0] = rank(cnt+numZero);
        answer[1] = rank(cnt);
        
        return answer;
    }
    public int rank(int i){
        switch(i){
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default : return 6; 
        }
    }
}