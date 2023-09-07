package org.launchcode;

public class Student {
        private static int nextStudentId;
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;
        private String gradeLevel;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
//return "Student Name: " +name+ "Student ID: " +studentId+ "Number of Credits: " +numberOfCredits+
 //       "Grade Point Average: " +gpa;
        }

        public Student(String name, int studentId) {
                //also can be written
                this(name,studentId,0,0);
               /*
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = 0;
                this.gpa = 0.0;*/
        }
        public Student (String name){
                this(name, nextStudentId);
                nextStudentId++;
        }

        public String studentInfo(){
                return (this.name + "has a gpa of " + this.gpa);
        }

        public void addGrade(int courseCredits, double grade){
                double totalQualityScore = this.gpa*numberOfCredits;
                totalQualityScore += courseCredits*grade;
                this.numberOfCredits+=courseCredits;
                this.gpa = totalQualityScore/this.numberOfCredits;
        }
        public String getGradeLevel(int numberOfCredits){
                if (numberOfCredits <= 29){
                        return "Freshman";
                } else if (numberOfCredits <=59) {
                        return "Sophomore";
                } else if (numberOfCredits <=89) {
                        return "Junior";
                }else {
                        return "Senior";
                }
        }

        public String toString() {
                String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
                return studentReport;

        }
        // Drop your getters and setters below for the org.launchcode.Student class.
        // To instantiate the org.launchcode.Student class, add your code to the main in the file, SchoolPractice.
        public void setName(String aName) {
                name = aName;
        }
        public void setStudentId(int aStudentId) {
                studentId = aStudentId;
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
