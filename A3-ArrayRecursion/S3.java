// Q3: Find the Highest Element in an Array.

public class S3 {

    public static void main(String[] args) {

        int[] ary = { 1, 2, -3, -5, 5, 10, 45, 21, 87, 4, 2 };

        Integer maxElement = higestElement(ary, ary.length - 1, Integer.MIN_VALUE); // Fixed

        if (maxElement == null)
            System.out.println("Array is empty :(");
        else
            System.out.println("Max element in the array is: " + maxElement);

    }

    static Integer higestElement(int[] ary, int index, int max) {

        if (ary.length == 0) {
            return null;
        }

        if (index < 0) {
            return max;
        }

        int tillMax = higestElement(ary, index - 1, max);

        max = (ary[index] > tillMax) ? ary[index] : tillMax;

        return max;
    }
}
