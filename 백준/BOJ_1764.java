import java.io.*;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String[] inputs=br.readLine().split(" ");
        int n=Integer.parseInt(inputs[0]);
        int m=Integer.parseInt(inputs[1]);
        List<String> result=new ArrayList<>();
        Set<String> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(br.readLine());
        }
        for(int i=0;i<m;i++){
            String temp=br.readLine();
            if(set.contains(temp)){
                result.add(temp);
            }
        }
        bw.write(result.size()+"\n");
        Collections.sort(result);
        for(String s:result){
            bw.write(s+"\n");
        }
        bw.flush();
    }
}
