import java.util.*;
import java.io.*;

public class Main {

    public static int n, m;
    public static int[] arr;
    public static StringBuilder ans = new StringBuilder();

    public static void dfs(int depth, int start, int[] currArr){
        if(depth == m){
            for(int num : currArr){
                ans.append(num).append(" ");
            }
            ans.append("\n");
        }
        else{
            for(int i = start; i < n; i++){
                currArr[depth] = arr[i];
                dfs(depth + 1, i, currArr);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];

        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        dfs(0, 0, new int[m]);

        System.out.println(ans.toString());
    }
}