public class testDistro
{

   public static void main(String [] args)
   {
   
   GradeDistro JacksClass = new GradeDistro(22, 3, 11, 7, 18);  
 
   JacksClass.drawGraph(JacksClass.getPercentages(JacksClass.getGrades()));
   
   
   }
   
}
