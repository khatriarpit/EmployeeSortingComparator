import java.util.Comparator;

/**
 * Created by Arpit khatri on 10/01/17.
 */
public class EmployeeSalaryComparator implements Comparator<Employee>{
    /**
     * Override method which compare object properties (compare two objects)
     * @param empObject1
     * @param empObject2
     * @return
     */
    @Override
    public int compare(Employee empObject1, Employee empObject2) {
        return empObject2.getSalary().compareTo(empObject1.getSalary());
    }
}
