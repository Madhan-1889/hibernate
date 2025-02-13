package com.wipro.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
   @Id
   private int id;
   private String firstName;
   private String lastName;
   private int salary;
	   // Default constructor
	   public Employee() {}

	   // Parameterized constructor
	   public Employee(String fname, String lname, int salary) {
	      this.firstName = fname;
	      this.lastName = lname;
	      this.salary = salary;
	   }

	   // Getter and Setter methods
	   public int getId() {
	      return id;
	   }
	   public void setId(int id) {
	      this.id = id;
	   }
	   public String getFirstName() {
	      return firstName;
	   }
	   public void setFirstName(String firstName) {
	      this.firstName = firstName;
	   }
	   public String getLastName() {
	      return lastName;
	   }
	   public void setLastName(String lastName) {
	      this.lastName = lastName;
	   }
	   public int getSalary() {
	      return salary;
	   }
	   public void setSalary(int salary) {
	      this.salary = salary;
	   }
	}

