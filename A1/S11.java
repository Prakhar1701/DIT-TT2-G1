public class S11 {
    public static void main(String[] args) {

        int[] ary = { 5, 1, 2, 5, 4, 5, 5 };

        int ele = 5;

        int rw = 0;

        replaceElement(ary, 0, ele, rw);

        for (int element : ary) {
            System.out.print(element + " ");
        }

        System.out.println();

    }

    static void replaceElement(int[] arr, int index, int ele, int rw) {

        if (index > arr.length - 1) {
            return;
        }

        if (arr[index] == ele) {
            arr[index] = rw;
        }

        replaceElement(arr, index + 1, ele, rw);
    }
}
