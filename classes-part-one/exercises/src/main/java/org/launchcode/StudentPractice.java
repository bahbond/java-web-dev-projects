package org.launchcode;

public class StudentPractice {
    public static void main(String[] args){
        //insantiate your org.launchcode.Student class below
        Student abond = new Student("Andrew Bond", 8888718, 1, 4.0);
        System.out.println(abond.getName());
        System.out.println(abond.getStudentId());
        System.out.println(abond.getNumberOfCredits());
        System.out.println(abond.getGpa());
        System.out.println(abond);
    }
}
