public class testPerson
{

   public static void main(String [] args)
   {
   
      Person Jeff = new Person("Jeff", 20);
      Person Jack = new Person("Jack", 20);
      Person Jeff2 = new Person("Jeff", 35);
      
      if(Jeff.sameName(Jack))
      System.out.println("Jeff has the same name as Jack.");
      else System.out.println("Jeff does not have the same name as Jack.");
      
      if(Jeff.sameName(Jeff2))
      System.out.println("Jeff has the same name as Jeff 2.");
      else System.out.println("Jeff does not have the same name as Jeff 2.");

      if(Jeff.sameAge(Jeff2))
      System.out.println("Jeff is the same age as Jeff 2.");
      else System.out.println("Jeff does not have the same age as Jeff 2.");
      
      if(Jeff.sameAge(Jack))
      System.out.println("Jeff is the same age as Jack.");
      else System.out.println("Jeff does not have the same age as Jack.");
      
      if(Jeff.isOlder(Jeff2))
      System.out.println("Jeff is older than Jeff2.");
      else System.out.println("Jeff is not older than Jeff2.");
      
      if(Jeff2.isOlder(Jeff))
      System.out.println("Jeff2 is older than Jeff.");
      else System.out.println("Jeff2 is not older than Jeff.");
      
      if(Jeff.isYounger(Jeff2))
      System.out.println("Jeff is younger than Jeff2.");
      else System.out.println("Jeff is not younger than Jeff2."); 
      
      if(Jeff2.isYounger(Jeff))
      System.out.println("Jeff2 is younger than Jeff.");
      else System.out.println("Jeff2 is not younger than Jeff.");  
   }

}
