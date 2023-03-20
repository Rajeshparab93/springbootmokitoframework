package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {


    @Autowired
    EmployeeRepository employeeRepositoryImpl;

    public Employee saveData(Employee employee) {
        return employeeRepositoryImpl.save(employee);
    }

    public List<Employee> getAllData() {

        return employeeRepositoryImpl.findAll();
    }

    public Employee updateData(Employee employee) {
        return employeeRepositoryImpl.save(employee);
    }

    public void deleteDataById( int empId) {

        employeeRepositoryImpl.deleteById(empId);
    }






}



// save getall update delete
