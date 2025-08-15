package Ch12_ArrayList;

import java.util.ArrayList;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int start = 0;
        int end = list.size()-1;

        while (start<end) {
            int temp = list.get(start);
            list.set(start,list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }

        System.out.println(list+" ");
    }
}
