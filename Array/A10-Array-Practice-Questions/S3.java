public class S3 {

    public static void main(String[] args) {

        int[] n1 = { 5, 7, 6, 5, 6 };

        int[] n2 = { 9, 2, 6, 5 };

        int[] r = addNumberArray(n1, n2);

        for (int x : r) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static int[] addNumberArray(int[] array1, int[] array2) {
        int length = Math.max(array1.length, array2.length);
        int[] resultArray = new int[length];

        int carry = 0;

        for (int i = length - 1; i >= 0; i--) {
            int sum = carry;

            if (i >= length - array1.length) {
                sum += array1[i - (length - array1.length)];
            }

            if (i >= length - array2.length) {
                sum += array2[i - (length - array2.length)];
            }

            resultArray[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] expandedResultArray = new int[length + 1];
            expandedResultArray[0] = carry;
            System.arraycopy(resultArray, 0, expandedResultArray, 1, length);
            resultArray = expandedResultArray;
        }

        return resultArray;
    }

}
