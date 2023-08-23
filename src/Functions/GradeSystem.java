//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
package Functions;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Marks: ");
        int marks = in.nextInt();
        System.out.println("Your Grade Based on your marks is: "+ YourGrade(marks));

    }

    static String YourGrade(int marks){
        String grade;
        if(marks>=91 && marks<=100){
            grade = "AA";
            return grade;
        } else if(marks>=81 && marks<=90){
            grade = "AB";
            return grade;
        }else if(marks>=71 && marks<=80){
            grade = "BB";
            return grade;
        }else if(marks>=61 && marks<=50){
            grade = "BC";
            return grade;
        }else if(marks>=51 && marks<=60){
            grade = "CD";
            return grade;
        }else if(marks>=40 && marks<=50){
            grade = "DD";
            return grade;
        }else if(marks<40){
            grade = "Fail";
            return grade;
        }else {
            System.out.println("Please Enter Valid Marks");
            return null;
        }

    }
}


//    Marks        Grade
//91-100         AA
//        81-90          AB
//        71-80          BB
//        61-70          BC
//        <=40          Fail
//        51-60          CD
//        41-50          DD
