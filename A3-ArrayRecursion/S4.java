/* Q4: Given is an Array of Employee Salary, add the tax 10% in each salary 
       and return the new array which contains (salary + tax). */

public class S4 {

    public static void main(String[] args) {

        int[] empSalaryAry = { 100000, 305000, 800000, 2000000, 3500000 };

        addTaxModifyArrayValues(empSalaryAry, 0);

        for (int empSalaryPlusTax : empSalaryAry) {
            System.out.print(empSalaryPlusTax + ", ");
        }

        System.out.println();
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
