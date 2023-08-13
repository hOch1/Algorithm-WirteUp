import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] a={1,2,3,4,5};
        int[] b={2,1,2,3,2,4,2,5};
        int[] c={3,3,1,1,2,2,4,4,5,5};
        
        int[] collect={0,0,0};
        int[] temp={0,0,0};
        
        for(int i=0; i<answers.length; i++){
            if(answers[i]==a[temp[0]])
                collect[0]++;
            if(answers[i]==b[temp[1]])
                collect[1]++;
            if(answers[i]==c[temp[2]])
                collect[2]++;

            if(++temp[0]>4)
                temp[0]=0;
            if(++temp[1]>7)
                temp[1]=0;
            if(++temp[2]>9)
                temp[2]=0;
        }
        
        int max = Math.max(collect[0], Math.max(collect[1], collect[2]));
        
        for(int i=0; i<collect.length; i++)
            if(collect[i]==max) list.add(i+1);
        
        int[] arr = new int[list.size()];
        for(int i=0; i<arr.length; i++)
            arr[i] = list.get(i);
        
        return arr;
    }
}