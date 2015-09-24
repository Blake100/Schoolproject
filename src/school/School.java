/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;


public class School {

  
    public static void main(String[] args) {
       
      Student bob = Student.addStudent("Bob", Person.Gender.Male,110,11);
      Student joe = Student.addStudent("Joe", Person.Gender.Male,150,11);
      Student billy = Student.addStudent("Billy", Person.Gender.Male,180,11);
      Student nina = Student.addStudent("Nina", Person.Gender.Female,100,11);
      Student julia = Student.addStudent("Julia", Person.Gender.Female,105,11);
      Student olivia = Student.addStudent("Olivia", Person.Gender.Female,107,11);
      Student bobbyjoe = Student.addStudent("Bobbyjoe" , Person.Gender.Male ,168,11);
      Student boby = Student.addStudent("Boby" , Person.Gender.Male ,168,11);
      Student bill = Student.addStudent("Bill" , Person.Gender.Male ,168,11);
      Student nate = Student.addStudent("Nate" , Person.Gender.Male ,168,11);
      Student brandon = Student.addStudent("Brandon" , Person.Gender.Male ,168,11);
      Student race = Student.addStudent("Race" , Person.Gender.Male ,168,11); 
      Student bobby = Student.addStudent("Bobby" , Person.Gender.Male ,168,11);
      
      Student.printNames();
      Student.printNames(Person.Gender.Male);
      Student.printNames(Person.Gender.Female);
      System.out.println(bob);
      Student.printWeight();
      Student.printWeights(Person.Gender.Male);
      Student.printWeights(Person.Gender.Female);
      Course eng = Course.addCourse("English", Course.Type.English, 1);
      Course cs2 = Course.addCourse("Computer Science", Course.Type.Elective, 2);
      Course science = Course.addCourse("Science", Course.Type.Science, 3);
      Course pe = Course.addCourse("PE", Course.Type.PE, 4);
      Course geom = Course.addCourse("Geometry", Course.Type.Math, 5);
      Course.printNames();
      bob.setBirthdate(06, 07, 2000);
      bob.getAge();
      Student.printAge();
      geom.addStudent(bobby);
      Student.printNames();
      
    }
    
}
