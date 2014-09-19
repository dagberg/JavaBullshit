public class GradeDistro
{

   private int [] percents = new int[5];
   private int sum;
   private int[] grades = new int[5];
   
   public GradeDistro(int A, int B, int C, int D, int F)
   {
      int x;
      
      grades[0] = A;
      grades[1] = B;
      grades[2] = C;
      grades[3] = D;
      grades[4] = F;

      for(x = 0; x < 5; x++)
         sum = sum + grades[x];
   }
      
   public int[] getGrades()
   {
      return grades;
   }
   
   public int getTotal()
   {
      return sum;
   }
   
   public int[] getPercentages(int[] distro)
   {
      int x;
      
      for(x = 0; x < 5; x++)
      {
        percents[x] = (distro[x] * 100)/ sum;
      }
      return percents;
   }
   
   private void drawLine(int gradePercent)
   {
      int x;
      
      if(gradePercent % 2 == 1)
      gradePercent++;
      int gp = gradePercent/2;
      
      if(gp > 0)
      {  
         for(x = 0; x < gp; x++)
         System.out.print("*");
      }
      
   }
   
   public void drawGraph(int[] input)
   {
      System.out.println("|    |    |    |    |    |    |    |    |    |");
      System.out.println("**********************************************");
      drawLine(percents[0]);
      System.out.println(" A");
      drawLine(percents[1]);
      System.out.println(" B");
      drawLine(percents[2]);
      System.out.println(" C");
      drawLine(percents[3]);
      System.out.println(" D");
      drawLine(percents[4]);
      System.out.println(" F");
   }
}
