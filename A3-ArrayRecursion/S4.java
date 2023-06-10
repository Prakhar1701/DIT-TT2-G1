/* Q4: Given is an Array of Employee Salary, add the tax 10% in each salary 
       and return the new array which contains (salary + tax). */

import java.lang.reflect.Array;
import java.util.ArrayList;

public class S4 {

    public static void main(String[] args) {

        int[] empSalaryAry = { 100000, 305000, 800000, 2000000, 3500000 };

        int[] empSalaryPlusTaxAry = addTaxReturnAnotherArray( // Fixed
                empSalaryAry,
                empSalaryAry.length - 1,
                new int[empSalaryAry.length]);

        for (int empSalaryPlusTax : empSalaryPlusTaxAry) {
            System.out.print(empSalaryPlusTax + ", ");
        }

        System.out.println("<-- Initial Array Not Modified");

        addTaxModifyArrayValues(empSalaryAry, 0); // Fixed

        for (int empSalaryPlusTax : empSalaryAry) {
            System.out.print(empSalaryPlusTax + ", ");
        }

        System.out.println("<-- Initial Array Modified");
    }

    static int[] addTaxReturnAnotherArray(int[] empSalaryAry, int index, int[] empSalaryPlusTaxAry) {

        if (index < 0) {
            return empSalaryPlusTaxAry;
        }

        int currentEmpSalary = empSalaryAry[index];

        int[] ary = addTaxReturnAnotherArray(empSalaryAry, index - 1, empSalaryPlusTaxAry);

        ary[index] = currentEmpSalary + currentEmpSalary / 10;

        return ary;
    }

    static void addTaxModifyArrayValues(int[] empSalaryAry, int index) {

        if (index > empSalaryAry.length - 1) {
            return;
        }

        int currentEmpSalary = empSalaryAry[index];

        empSalaryAry[index] = currentEmpSalary + currentEmpSalary / 10;

        addTaxModifyArrayValues(empSalaryAry, index + 1);
    }
}
