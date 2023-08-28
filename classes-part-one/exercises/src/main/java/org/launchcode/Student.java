package org.launchcode;

public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
//return "Student Name: " +name+ "Student ID: " +studentId+ "Number of Credits: " +numberOfCredits+
 //       "Grade Point Average: " +gpa;
        }

        public Student(String name, int studentId) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = 0;
                this.gpa = 0.0;
        }
        // Drop your getters and setters below for the org.launchcode.Student class.
        // To instantiate the org.launchcode.Student class, add your code to the main in the file, SchoolPractice.
        public void setName(String name) {
                this.name = name;
}
        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }
        public void setGpa(double gpa) {
                this.gpa = gpa;
        }
        private void setNumberOfCredits (int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }
        public String getName() {
                return name;
        }
        public int getStudentId() {
                return studentId;
        }
        public int getNumberOfCredits(){
                return numberOfCredits;
        }
        public double getGpa() {
                return gpa;
        }
}