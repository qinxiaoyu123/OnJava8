import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertInstanceToDBPedia {
    public static void main(String[]args) throws IOException {
        String path = "F:\\第三个论文\\赵乐园学长\\dbty73\\instance_ty73";
        String writePath = "F:\\第三个论文\\赵乐园学长\\dbty73\\instance_ty73.nt";
        Path fpath= Paths.get(path);
        Path writeFpath= Paths.get(writePath);
        BufferedReader bfr= Files.newBufferedReader(fpath);
        BufferedWriter writer = Files.newBufferedWriter(writeFpath);
        String line;

        StringBuffer a = new StringBuffer();
        while((line=bfr.readLine())!=null) {
            String []arry = line.split("\\s");
            if(arry.length != 2) {
                System.out.println(line);
                System.out.println(arry[0]);
                break;
            }
            a.append("<http://wikidata.dbpedia.org/resource/").append(arry[0]).append(">").append(" ").append("<http://www.w3.org/1999/02/22-rdf-syntax-ns#type>").append(" ").append("<http://wikidata.dbpedia.org/ontology/").append(arry[1]).append(">").append(" .");
            writer.write(a.toString());
            writer.newLine();
            a.setLength(0);
        }
        writer.flush();
        writer.close();
    }
}
