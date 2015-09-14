/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;


public class School {

  
    public static void main(String[] args) {
       
      Person bob = Person.addPerson("Bob", Person.Gender.Male,110);
      Person joe = Person.addPerson("Joe", Person.Gender.Male,150);
      Person billy = Person.addPerson("Billy", Person.Gender.Male,180);
      Person nina = Person.addPerson("Nina", Person.Gender.Female,100);
      Person julia = Person.addPerson("Julia", Person.Gender.Female,105);
      Person olivia = Person.addPerson("Olivia", Person.Gender.Female,107);
      Person.printNames();
      Person.printNames(Person.Gender.Male);
      Person.printNames(Person.Gender.Female);
      System.out.println(bob);
      Person.printWeight();
      Person.printWeights(Person.Gender.Male);
      Person.printWeights(Person.Gender.Female);
    }
    
}
