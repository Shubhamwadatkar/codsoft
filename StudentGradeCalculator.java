import java.util.*;
class gradeCalculate
{                                  
    public String grade(int avgPerctg)
    {
        float varGradeCal= ((float)avgPerctg / 10);
		String varGrade;
		if(varGradeCal >= 3.5 && varGradeCal <= 5){
            varGrade="C";
        }
		else if(varGradeCal > 5 && varGradeCal <= 7){
            varGrade="B";
        }
		else if(varGradeCal > 7 && varGradeCal <= 9){
            varGrade="A";
        }
		else if(varGradeCal > 9){
            varGrade="O";
        }
		else {
            varGrade="F";
        }
        return (varGrade);
    }
}

public class StudentGradeCalculator
{
    public static void main(String args[])
    {
        gradeCalculate g = new gradeCalculate();
        Scanner sc = new Scanner(System.in);
             
        System.out.println("Enter the Number of subjects :-"); //Taking Input from User
        int totSub = sc.nextInt();
        int totMarks = 0;

        // Looping Through all the Marks
        for (int i = 0; i < totSub; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1));
            int subMarks = sc.nextInt();
            totMarks += subMarks;
        }

        int avgPerctg = totMarks / totSub; // Percentage calculation

        // Calculate Grades
        String Grade = g.grade(avgPerctg);

        //Displaying all the Data
        System.out.println("Total marks :- " + totMarks);
        System.out.println("Percentage :- " + avgPerctg+"%");
        System.out.println("Grade :- " + Grade);
    }
}  

