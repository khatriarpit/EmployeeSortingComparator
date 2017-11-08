import java.util.*;


/**
 * Created by Arpit khatri on 10/01/17.
 */
public class EmployeeNameComparator implements  Comparator<Employee> {

    /**
     * Override method which compare object properties (first check with Name then check with salary if true)
     * @param empObject1
     * @param empObject2
     * @return integer
     */
    public int compare(Employee empObject1,Employee empObject2){
       return (empObject1.getName().compareTo(empObject2.getName()))==0?
               empObject2.getSalary().compareTo(empObject1.getSalary()):empObject1.getName().compareTo(empObject2.getName());
    }
}