import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class BOJ_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int M=Integer.parseInt(br.readLine());
        Set<String> set=new HashSet<>();
        for(int i=0;i<M;i++){
            String[] inputs=br.readLine().split(" ");
            if(inputs[0].equals("add")){
                set.add(inputs[1]);
                continue;
            }
            if(inputs[0].equals("check")){
                if(set.contains(inputs[1])){
                    bw.write("1"+"\n");
                    continue;
                }
                bw.write(0+"\n");
                continue;
            }
            if(inputs[0].equals("remove")){
                set.remove(inputs[1]);
                continue;
            }
            if(inputs[0].equals("toggle")){
                if(set.contains(inputs[1])){
                    set.remove(inputs[1]);
                    continue;
                }
                set.add(inputs[1]);
                continue;
            }
            if(inputs[0].equals("all")){
                for(int j=1;j<=20;j++){
                    set.add(Integer.toString(j));
                }
                continue;
            }
            if(inputs[0].equals("empty")){
                set.clear();
            }
        }
        bw.flush();
    }
}
