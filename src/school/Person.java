/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;

public class Person {

  enum Gender{
      Male,Female
  }
  private Gender gender;
  private String name;
  private int weight;
  private static  ArrayList<Person> people = new ArrayList<Person>();
  
  public static Person addPerson(String _name,
           Gender _gender, int _weight)
  {
     Person temp = new Person(_name, _gender, _weight);
     people.add(temp);
     return(temp);
  }
  Person()
  {
     name = "Blank";
     gender = Gender.Male;
     weight = 0;
  }
  Person(String _name, Gender _gender,int _weight)
  {
     name = _name;
     gender = _gender;
     weight = _weight;
  }
  public void setWeight(int _weight)
  {
      weight = _weight;
  }
   public void setName(String _name)
  {
      name = _name;
  }
  public String getName()
  {
      return(name);
  }
  public void setGender(Gender _gender)
  {
      gender = _gender;
  }
  public Gender getGender()
  {
      return(gender);
  }
  public int getWeight()
  {
      return(weight);
  }
   public static void printNames()
  {
      System.out.println("===AllNames===");
      for(Person temp: people)
      {
             System.out.println(temp.getName());
      }
  }
  public static void printNames(Gender _gender)
  {
      System.out.println("===printNames===" +" " + _gender);
      for(Person temp: people)
      {
        if(temp.gender == _gender)
        {
             System.out.println(temp.getName());
        }
      }
  }
  public String toString()
  {
      return("Hello my name is" + " " + name);
  }
   public static void printWeight()
  {
      System.out.println("===AllWeight===");
      for(Person temp: people)
      {
          System.out.println(temp.getName()+ "'s weight = " + temp.getWeight());
      }
  }
  public static void printWeights(Gender _gender)
  {
      System.out.println("===printWeights===" +" " + _gender);
      for(Person temp: people)
      {
        if(temp.gender == _gender)
        {
            System.out.println(temp.getName()+ "'s weight = " + temp.getWeight());
        }
      }
  }
}
