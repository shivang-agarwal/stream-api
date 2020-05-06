package com.zenon.util;

import com.zenon.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeUtil {

    private EmployeeUtil() { }

    public static BigDecimal getTotalSalary(List<Employee> employees){
        if(employees == null || employees.isEmpty()) return BigDecimal.ZERO;
        return employees.stream()
                .map(Employee::getSalary)
                .filter(Objects::nonNull)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO)
                .setScale(2, BigDecimal.ROUND_DOWN);
    }

    public static Map<LocalDate, List<Employee>> groupByJoiningDate(List<Employee> employees) {
        if(employees == null || employees.isEmpty()) return new HashMap<>();
        return employees.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Employee::getDateOfJoing));
    }
}
