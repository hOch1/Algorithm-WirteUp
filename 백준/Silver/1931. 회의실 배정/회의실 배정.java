import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        
        int count = 0;
        int endTime = 0;
        
        for(int i=0; i<N; i++){
            if(endTime <= arr[i][0]){
                endTime = arr[i][1];
                count++;
            }
        }
        
        System.out.println(count);
    }
}

