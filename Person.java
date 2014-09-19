public class Person
{

   private String name;
   private int age;
   
   public String getName()
   {
      return name;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public void setName(String newName)
   {
      name = newName;
   }
   
   public void setAge(int newAge)
   {
      age = newAge;
   }
   
   public Person(String newName, int newAge)
   {
      name = newName;
      age = newAge;
   }
   
   public boolean equals(Person otherPerson)
   {
      return(name.equalsIgnoreCase(otherPerson.name)) &&
            (age == otherPerson.age);
   }
   
   public boolean sameName(Person otherPerson)
   {
      return(name.equalsIgnoreCase(otherPerson.name));
   }
   
   public boolean sameAge(Person otherPerson)
   {
      return(age == otherPerson.age);
   }
   
   public boolean isOlder(Person otherPerson)
   {
      return(age > otherPerson.age);
   }
   
   public boolean isYounger(Person otherPerson)
   {
      return(age < otherPerson.age);
   }

}
