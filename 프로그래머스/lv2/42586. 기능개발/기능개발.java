import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] day = new int[progresses.length];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<day.length; i++) day[i] = 0;
            
        for(int i=0; i<progresses.length; i++){
            while(true){
                day[i] += 1;
                progresses[i] += speeds[i];
                if(progresses[i] >= 100){
                    queue.add(day[i]);
                    break;
                }
            }
        }
        
        int tmp = queue.poll();
        int count = 1;
        while(!queue.isEmpty()){
            if(tmp >= queue.peek()){
                count++;
                queue.remove();
            }else{
                tmp = queue.poll();
                ans.add(count);
                count=1;
            }
            
            if(queue.isEmpty())
                ans.add(count);
        }

        
        return ans.stream().mapToInt(i->i).toArray();
    }
}