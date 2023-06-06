public class S8 {
    public static void main(String[] args) {
        int[] ary = { 1, 2, 3, 4, 5 };
        int li = ary.length - 1;

        int ele = 5;
        System.out.println(lastIndexElementSearch1(ary, li, ele));
        lastIndexElementSearch2(ary, li, ele);

        System.out.println();

        ele = 7;
        System.out.println(lastIndexElementSearch1(ary, li, ele));
        lastIndexElementSearch2(ary, li, ele);
    }

    static int lastIndexElementSearch1(int[] arr, int index, int ele) {

        if (index < 0)
            return -1;

        if (arr[index] == ele) {
            return index;
        }

        return lastIndexElementSearch1(arr, index - 1, ele);
    }

    static void lastIndexElementSearch2(int[] arr, int index, int ele) {

        if (index < 0) {
            System.out.println("Element " + ele + " not found :(");
            return;
        }

        if (arr[index] == ele) {
            System.out.println("Element " + ele + " found at last index " + index + " :)");
            return;
        }

        lastIndexElementSearch2(arr, index - 1, ele);
    }
}
