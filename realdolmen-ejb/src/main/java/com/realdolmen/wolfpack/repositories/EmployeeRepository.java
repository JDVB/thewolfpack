package com.realdolmen.wolfpack.repositories;

import com.realdolmen.wolfpack.entities.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YDEAX41 on 22/09/2015.
 */
public class EmployeeRepository extends GenericRepository<Employee>{
    public EmployeeRepository() {

        super(new ArrayList<Employee>() {{
            add(new Employee());
            add(new Employee());
            add(new Employee());
        }});
    }

    public EmployeeRepository(List<Employee> entityList) {
        super(entityList);
    }
}
