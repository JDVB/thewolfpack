import com.realdolmen.wolfpack.entities.Employee;
import com.realdolmen.wolfpack.repositories.EmployeeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YDEAX41 on 22/09/2015.
 */
public class EmployeeRepositoryTest
{
    private EmployeeRepository employeeRepository;
    private List<Employee> employeeList;
    private Employee employee1;
    private Employee employee2;
    private Employee employee3;

    @Before
    public void before()
    {
        employee1 = new Employee();
        employee2 = new Employee();
        employee3 = new Employee();

        employeeList = new ArrayList<Employee>() {{
            add(employee1);
            add(employee2);
            add(employee3);
        }};

        employeeRepository = new EmployeeRepository(employeeList);
    }

    @Test
    public void testFindAll()
    {
        Assert.assertEquals(employeeRepository.findAll(), employeeList);
    }
}
