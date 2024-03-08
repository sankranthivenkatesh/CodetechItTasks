package com.venkatesh;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private String rollNumber;
    private Map<String, Integer> subjectMarks;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Map<String, Integer> getSubjectMarks() {
		return subjectMarks;
	}

	public void setSubjectMarks(Map<String, Integer> subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

	public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjectMarks = new HashMap<>();
    }

    public void addSubjectMark(String subject, int marks) {
        subjectMarks.put(subject, marks);
    }

    public double calculatePercentage() {
        int totalMarks = subjectMarks.values().stream().mapToInt(Integer::intValue).sum();
        return (double) totalMarks / subjectMarks.size();
    }

    public char calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 75) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 65) {
            return 'C';
        } else if (percentage >= 35) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\nRoll Number: " + rollNumber);
        for (Map.Entry<String, Integer> entry : subjectMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.printf("Overall Percentage: %.2f%%\nGrade: %c\n", calculatePercentage(), calculateGrade());
    }

}
