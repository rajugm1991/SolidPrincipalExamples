package com.problem.SRP.example.one;

import com.common.Employee;

public interface IEmployeeStore {

    Employee getEmployee(int id);

    void addEmployee(Employee employee);

    void sendEmail(Employee employee,String content);

}
