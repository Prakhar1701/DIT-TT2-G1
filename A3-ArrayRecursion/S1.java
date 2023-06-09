// Q1: Write a recursive function that takes a list of numbers as an input and return product of all numbers in list.

class S1 {
    public static void main(String[] args) {

        int[] ary = {};

        Integer p = productOfAllElements(ary, 0); // Fixed

        if (p == null)
            System.out.println("List is empty :(");
        else
            System.out.println(p);
    }

    static Integer productOfAllElements(int[] ary, int index) {

        if (ary.length == 0) {
            return null;
        }

        if (index > ary.length - 1) {
            return 1;
        }

        return ary[index] * productOfAllElements(ary, index + 1);
    }
}