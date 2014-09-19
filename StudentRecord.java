import java.util.Scanner;
public class StudentRecord
{

   private int quiz1 = 0;
   private int quiz2 = 0;
   private int midterm = 0;
   private int finalexam = 0;
   private int grade = 0;
   private String letterGrade = "No grade yet";
   
   public void readInput()
   {
      Scanner kbd = new Scanner(System.in);
      System.out.println("What's the score for quiz 1?");
      quiz1 = kbd.nextInt();
      System.out.println("What's the score for quiz 2?");
      quiz2 = kbd.nextInt();
      System.out.println("What's the score for the mid-term exam?");
      midterm = kbd.nextInt();
      System.out.println("What's the score for the final?");
      finalexam = kbd.nextInt();
      
   }
   
   public void calcGrade(int a, int b, int c, int d)
   {
         
      grade = ((d * 100 / 2) + (c * 100 /4) + ((a + b) * 100 * 5 / 4))/100;
      
   }
   
   public void letter(int x)
   {
      if(x > 90)
      letterGrade = "A";
      if(x > 80)
      letterGrade = "B";
      if(x > 70)
      letterGrade = "C";
      if(x > 60)
      letterGrade = "D";
      else letterGrade = "F";
   }
   
   public void writeOutput()
   {
   
      System.out.println("The total grade for your student is " + grade + ".");
      System.out.println("The letter grade is: " + letterGrade);
      
   }
}
