package com.problem.SRP;

import com.common.Employee;

public class EmployeeStore implements IEmployeeStore{
    @Override
    public Employee getEmployee(int id) {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    //we see the SRP problem class should have one and only responsibility ,
    // i.e tomorrow if want to send this content as HTML again we need make code change on empstore and
    //if want send mail's using some different protoclos again we see the problem. Class is tightly coupled with
    //email change. So we may need to address this solution using SRP pricipal
    @Override
    public void sendEmail(Employee employee, String content) {

    }
}
