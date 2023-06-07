import java.util.ArrayList;

public class S10 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int[] ary = { 5, 1, 2, 5, 4, 5, 5 };

        int ele = 5;

        allIndexElementSearch(ary, 0, ele, list);
        System.out.println(list);

        System.out.println(allIndexElementSearch(ary, 0, ele));
    }

    static ArrayList<Integer> allIndexElementSearch(int[] arr, int index, int ele) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index > arr.length - 1) {
            return list;
        }

        if (arr[index] == ele) {
            list.add(index);
            list.addAll(allIndexElementSearch(arr, index + 1, ele));
            return list;
        }

        return allIndexElementSearch(arr, index + 1, ele);
    }

    static void allIndexElementSearch(int[] arr, int index, int ele, ArrayList<Integer> list) {

        if (index > arr.length - 1) {
            return;
        }

        if (arr[index] == ele) {
            list.add(index);
        }

        allIndexElementSearch(arr, index + 1, ele, list);
    }
}
