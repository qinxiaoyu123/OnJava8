import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDBPediaFile {
    public static void main(String[]args) throws IOException {
        String path = "F:\\第三个论文\\赵乐园学长\\dbty73\\instance_ty73.nt";
        Path fpath= Paths.get(path);
        BufferedReader bfr= Files.newBufferedReader(fpath);
        String line;
        int count = 0;
        while((line=bfr.readLine())!=null) {
            count++;
            if(count>=30) break;
            System.out.println(line);
        }
    }
}
