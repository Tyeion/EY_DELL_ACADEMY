package com.pardeep.Tyeion21Aug;
import java.util.Arrays;
import java.util.Comparator;

 class Employee23 implements Comparable<Employee23> {

    

    private int empId;

    private String empName;

    private int empAge;

    private int empSalary;

    

    public int getEmpId() {

        return empId;

    }

    public void setEmpId(int empId) {

        this.empId = empId;

    }

    public String getEmpName() {

        return empName;

    }

    public void setEmpName(String empName) {

        this.empName = empName;

    }

    public int getEmpAge() {

        return empAge;

    }

    public void setEmpAge(int empAge) {

        this.empAge = empAge;

    }

    public int getEmpSalary() {

        return empSalary;

    }

    public void setEmpSalary(int empSalary) {

        this.empSalary = empSalary;

    }

    

    Employee23(int empId, String empName, int empAge, int empSalary) {

        this.empId = empId;

        this.empName = empName;

        this.empAge = empAge;

        this.empSalary = empSalary;

    }

    

    @Override

    public String toString() {

        return "id is " + this.empId + " and name is " + this.empName + " and age is "

                + this.empAge + " and salary is " + this.empSalary ;

    }

    
    @Override
    public int compareTo(Employee23 o) {

        return this.empId - o.empId;

    }

    public static Comparator<Employee23> ageComparator = new Comparator<Employee23>() {

        @Override
        public int compare(Employee23 o1,Employee23 o2) {
            return o1.getEmpAge() - o2.getEmpAge();
        }
    };

    public static Comparator<Employee23> nameComparator = new Comparator<Employee23>() {

        @Override

        public int compare(Employee23 o1,Employee23 o2) {

            return o1.getEmpName().compareTo(o2.getEmpName());

        }

    };

    public static Comparator<Employee23> salaryComparator = new Comparator<Employee23>() {

        @Override

        public int compare(Employee23 o1,Employee23 o2) {

            return o1.getEmpSalary() - o2.getEmpSalary();

        }

    };

 

    

    }

 

public class SortingTheObject {

    

 

    public static void main(String[] args) {

        Employee23[] empArr = new Employee23[4];

        empArr[0] = new Employee23(123,"A",25,5000);

        empArr[1] = new Employee23(101,"Z",24,5500);

        empArr[2] = new Employee23(134,"X",26,5400);

        empArr[3] = new Employee23(130,"B",27,5800);

        

        Arrays.sort(empArr);

        System.out.println("Sorted emp array is " + Arrays.toString(empArr));

        

        Arrays.sort(empArr,Employee23.ageComparator);

        System.out.println("Sorted emp array-age is "+Arrays.toString(empArr));

 

        Arrays.sort(empArr,Employee23.nameComparator);

        System.out.println("Sorted emp array-name is "+Arrays.toString(empArr));

 

        Arrays.sort(empArr,Employee23.salaryComparator);

        System.out.println("Sorted emp array-salary is "+Arrays.toString(empArr));

        

    }

}
 