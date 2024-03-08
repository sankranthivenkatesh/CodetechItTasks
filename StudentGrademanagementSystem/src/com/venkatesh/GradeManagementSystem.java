package com.venkatesh;

import java.util.HashMap;
import java.util.Map;

 public class GradeManagementSystem {
	 
	 
	 
	 private Map<String, Student> students;

	    public GradeManagementSystem() {
	        this.students = new HashMap<>();
	    }

	    public void addStudent(Student student) {
	        students.put(student.getRollNumber(), student);
	    }
	    
	    
	    
	    public void updateStudent(String rollNumber, String subject, int marks) {
	        Student student = students.get(rollNumber);
	        if (student != null) {
	            student.addSubjectMark(subject, marks);
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    public void deleteStudent(String rollNumber) {
	        if (students.containsKey(rollNumber)) {
	            students.remove(rollNumber);
	            System.out.println("Student record deleted.");
	        } else {
	            System.out.println("Student not found.");
	        }
	    }
	    public void displayAllStudents() {
	        for (Student student : students.values()) {
	            student.displayInfo();
	        }
	    }

	    
public static void main(String args[]) {
	
	//creating a student object and insert data
	Student s=new Student("venky", "101");
	
	s.addSubjectMark("maths", 56);
	
	//creating a student2 object and insert data
    Student s1=new Student("kajal", "102");
	
	s1.addSubjectMark("english", 35);
	
	//creating a student3 object and insert data
	 Student s2=new Student("tiger", "103");
	s2.addSubjectMark("java", 67);
	
	
	//creating a gms object for add allstudents 
	GradeManagementSystem studentdetails=new GradeManagementSystem();
	
	studentdetails.addStudent(s);
	studentdetails.addStudent(s1);
	studentdetails.addStudent(s2);
	
	
	
	//delete a student based on rollnumber
	studentdetails.deleteStudent("101");
	
	
	//update a student 
	studentdetails.updateStudent("102", "hinhi", 90);
	
	
	
	//display all students
	studentdetails.displayAllStudents();
	
	
	
}
	 
 }