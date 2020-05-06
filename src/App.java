import com.zenon.model.Employee;
import com.zenon.util.EmployeeUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "A", new BigDecimal(1000.50), LocalDate.of(2020, 2, 27)));
        employees.add(new Employee(2, "B", new BigDecimal(965.206), LocalDate.of(2020, 2, 27)));
        employees.add(new Employee(3, "C", new BigDecimal(9726.349), LocalDate.of(2020, 10, 11)));
        employees.add(new Employee(4, "D", new BigDecimal(6353.74), LocalDate.of(2019, 10, 12)));

        BigDecimal totalSalay = EmployeeUtil.getTotalSalary(employees);
        System.out.println("Total salary of all employees : "+totalSalay);
        Map<LocalDate, List<Employee>> employeeMap = EmployeeUtil.groupByJoiningDate(employees);
        System.out.println("*************** List of Employees based on joining Date *********************");
        employeeMap.forEach((key, value) -> System.out.println(key+":"+value));
    }
}
