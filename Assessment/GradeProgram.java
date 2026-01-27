package com.techouts.Assessment;

public class GradeProgram {
    public static void main(String[] args) {
        int marks = 50;
        GradeProgram g = new GradeProgram();
        g.ifCondition(marks);
        g.switchCase(marks);
    }
    void ifCondition(int marks) {

        if(marks > 85) System.out.println("O Grade");
        else if(marks >= 80 && marks < 85) System.out.println(" A+ Grade");
        else if(marks >= 70 && marks < 80) System.out.println(" A Grade");
        else if(marks >= 60 && marks < 70) System.out.println(" B+ Grade");
        else if(marks >= 50 && marks < 60) System.out.println(" B Grade");
        else if(marks >= 30 && marks < 50) System.out.println(" C+ Grade");
        else if(marks >= 21 && marks < 30) System.out.println(" c Grade");
        else {
            System.out.println("FAIL");
        }
    }
    void switchCase(int marks) {
        switch(marks /10) {
            case 1 -> System.out.println("O GRADE");
            case 9 -> System.out.println("A+ Grade");
            case 8 -> System.out.println("A Grade");
            case 7 -> System.out.println("B+ Grade");
            case 6 -> System.out.println("B Grade");
            case 5 -> System.out.println("C+ Grade");
            default -> System.out.println("Fail");
        }
    }
}
