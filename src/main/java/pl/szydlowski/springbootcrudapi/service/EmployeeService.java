package pl.szydlowski.springbootcrudapi.service;

import pl.szydlowski.springbootcrudapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees(int page);
    Employee getEmployeeById(int id);
    void saveEmployee(Employee employee);
    void deleteEmployee(int id);
    Employee editEmployee(Employee employee);
}
