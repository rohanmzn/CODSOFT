package GradeSheet;

import java.util.*;
public class GradeSheet {
    static String gradeFinder(float per){
        String grade;

        if(per>=93)         grade="A";
        else if(per>=90)    grade="A-";
        else if(per>=87)    grade="B+";
        else if(per>=83)    grade="B";
        else if(per>=80)    grade="B-";
        else if(per>=77)    grade="C+";
        else if(per>=73)    grade="C";
        else if(per>=70)    grade="C-";
        else if(per>=67)    grade="D+";
        else if(per>=63)    grade="D";
        else if(per>=60)    grade="D-";
        else                grade="F";

        return grade;

    }
    static void displayResult(float total, float per, String grade){
        System.out.println("******************************");
        System.out.println("Total Marks Obtained: "+total);
        System.out.println("Total Percentage: "+per+"%");
        System.out.println("Grade: "+grade);
        System.out.println("******************************");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a,b,c,d,e,total,per;

        System.out.println("Enter marks obtained in 5 subjects out of 100: ");
        System.out.print("For English: ");
        a = sc.nextFloat();
        System.out.print("For Nepali: ");
        b = sc.nextFloat();
        System.out.print("For Math: ");
        c = sc.nextFloat();
        System.out.print("For Science: ");
        d = sc.nextFloat();
        System.out.print("For Social: ");
        e = sc.nextFloat();

        total=a+b+c+d+e;
        per=(total/500)*100;

        displayResult(total,per,gradeFinder(per));
        sc.close();
    }
}
