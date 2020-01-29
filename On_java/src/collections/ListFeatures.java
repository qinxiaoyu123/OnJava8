package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Node{
    private int count;
    Node(int count){
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public String toString(){
        return String.valueOf(count);
    }
//    @Override
@Override
    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof Node) {
           equal = this.count == ((Node) obj).count;
        }
        return equal;
    }

}
class MyComparetor implements Comparator<Node> {
    @Override
    public int compare(Node o1, Node o2) {
        return o1.getCount() - o2.getCount();
    }
}
public class ListFeatures {
    public static void main(String[] args){
        List<Integer> lists = new ArrayList<>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        System.out.println(lists);
        System.out.println(lists.contains(1));
        List<Node> countList = new ArrayList<>();
        countList.add(new Node(1));
        countList.add(new Node(2));
        countList.add(new Node(3));
        System.out.println(countList.contains(new Node(2)));
        countList.remove(new Node(2));
        System.out.println(countList);
        List<Node> subCountList = countList.subList(0,2);
        System.out.println(subCountList);
        countList.add(new Node(7));
        countList.add(new Node(6));
        Collections.sort(countList, new MyComparetor());
        System.out.println(countList);
        countList.retainAll(subCountList);
        System.out.println(countList);

    }
}
