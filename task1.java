import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total number of Subjects");
        int totalSubjects= scan.nextInt();
        int totalMarks=0;
        List<Integer> GradeCalculation=new ArrayList<>();

        for(int i=0;i<totalSubjects;i++)
        {
            System.out.println("enter the marks obtained in subject " + (i+1) + ": ");
            int marks=scan.nextInt();
            GradeCalculation.add(marks);
            totalMarks=totalMarks + marks;
        }

        double averagePercentage=  (double) totalMarks / totalSubjects;
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage : " + averagePercentage);

        if(averagePercentage >= 90)
        {
            System.out.println("Grade A");
        }
        else if(averagePercentage>=80)
        {
            System.out.println("Grade B");
        }
        else if(averagePercentage>=70){
            System.out.println("Grade C");
        
        }
        else if (averagePercentage>=60)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Grade F");
        }


    }
}
