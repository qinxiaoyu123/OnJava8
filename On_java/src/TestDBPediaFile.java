import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDBPediaFile {
    public static void main(String[]args) throws IOException {
        String path = "D:\\experiments\\dbpedia1\\dbpedia\\dbpedia+travel.ttl";
        Path fpath= Paths.get(path);
        BufferedReader bfr= Files.newBufferedReader(fpath);
        String line;
        int count = 0;
        while((line=bfr.readLine())!=null) {
            count++;
            if(count>=10) break;
            System.out.println(line);
        }
    }
}
