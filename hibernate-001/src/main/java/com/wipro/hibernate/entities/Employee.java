package com.wipro.hibernate.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Column(name = "emp_name")  // Optional: Maps to column 'emp_name' in DB
    private String empName;

    public Employee() {}

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    // ✅ Ensure proper getters and setters

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {  // ✅ Ensure this method exists
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
