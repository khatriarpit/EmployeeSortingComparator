import java.util.*;

/**
 * Created by Arpit khatri on 10/01/17.
 */
public class EmployeeMain {

    public static void main(String args[]) throws Exception {

        ArrayList<Employee> al = new ArrayList();
        al.add(new Employee(1, "Arpit", 230d));
        al.add(new Employee(2, "Darshan", 320d));
        al.add(new Employee(3, "Johnson", 550d));

        /**
         * Employee Name wise sorting
         */
        System.out.println("Employee Name Comparator");
        Collections.sort(al, new EmployeeNameComparator());
        for (Employee emp : al) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());

        }

        System.out.println();
        /**
         * Employee Salary wise Sorting.
         */
        System.out.println("Employee Salary Comparator");
        Collections.sort(al, new EmployeeSalaryComparator());
        for (Employee emp : al) {
            System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());

        }

    }

}

