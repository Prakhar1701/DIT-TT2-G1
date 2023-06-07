public class S9 {
    public static void main(String[] args) {
        int[] ary = { 5, 2, 4, 5, 5, 2, 1, 9, 0, 3, 5, 7, 6, 1 };
        int li = ary.length - 1;

        int ele = 5;
        System.out.println(ele + " ---> " + countAllOccurrences(ary, li, ele));
        countAllOccurrences(ary, li, ele, 0); // Initial count should be 0

        System.out.println();

        ele = 19;
        System.out.println(ele + " ---> " + countAllOccurrences(ary, li, ele));
        countAllOccurrences(ary, li, ele, 0); // Initial count should be 0
    }

    static int countAllOccurrences(int[] arr, int index, int ele) {

        if (index < 0)
            return 0;

        if (arr[index] == ele) {
            return 1 + countAllOccurrences(arr, index - 1, ele);
        }

        return countAllOccurrences(arr, index - 1, ele);
    }

    static void countAllOccurrences(int[] arr, int index, int ele, int count) {

        if (index < 0) {
            System.out.println(count);
            return;
        }

        if (arr[index] == ele) {
            count++;
        }

        countAllOccurrences(arr, index - 1, ele, count);
    }
}
