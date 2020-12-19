package com.mnu.steamsapi;

import com.mnu.common.beans.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Practice15 {
    @Test
    public void whenIncrementSalaryUsingPeek_thenApplyNewSalary() {
        Employee[] arrayOfEmps = {
                new Employee(1, "Jeff Bezos", 100000.0),
                new Employee(2, "Bill Gates", 200000.0),
                new Employee(3, "Mark Zuckerberg", 300000.0)
        };

        List<Employee> empList = Arrays.asList(arrayOfEmps);
        List<Employee> employeeList = empList.stream()
                .peek(e -> e.salaryIncrement(10))
                .peek(System.out::println)
                .collect(Collectors.toList());
        employeeList.forEach(System.out::println);
        //System.out.println(employeeList);

    }
}
