package strings;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Node implements Supplier<Node> {
    @Override
    public Node get() {
        return new Node();
    }
    public String toString(){
        Random random = new Random();
        return String.valueOf(random.nextInt(100));
    }
}
public class ArrayListDisplay {
    public static void main(String []args){
        List<Node> nodes = Stream.generate(new Node()).limit(10).collect(Collectors.toList());
        System.out.println(nodes);
    }
}
