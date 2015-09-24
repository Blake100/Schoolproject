/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.ArrayList;
import java.util.Calendar;

public class Person {

  enum Gender{
      Male,Female
  }
  
  protected static  ArrayList<Person> people = new ArrayList<Person>();
  private Gender gender;
  private String name;
  private int weight;
  
  private int birthDay;
  private int birthMonth;
  private int birthYear;
  
  private int ageDay;
  private int ageMonth;
  private int ageYear;
  
  
 
  public static Person addPerson(String _name,
           Gender _gender, int _weight)
  {
     Person temp = new Person(_name, _gender, _weight);
     people.add(temp);
     return(temp);
  }
  public static void addPerson(Person _person)
  {
      people.add(_person);
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
   public void setBirthdate(int _day, int _month, int _year)
  {
      birthDay = _day;
      birthMonth = _month;
      birthYear = _year;
  }
  public int getAge()
  {
     Calendar now = Calendar.getInstance();
     int day = now.get(Calendar.DAY_OF_MONTH);
     int month = now.get(Calendar.MONTH) + 1;
     int year = now.get(Calendar.YEAR);
     ageDay = day - birthDay;
     ageMonth = month - birthMonth;
     ageYear= year - birthYear;
     if(birthMonth < month && birthDay < day || birthMonth < month && birthDay > day || birthMonth == month && birthDay < day)
         ageYear = ageYear;
     else if (birthMonth > month && birthDay > day || birthMonth > month && birthDay < day || birthMonth == month && birthDay > day)
         ageYear-=1;
     return ageYear;
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
   public static void printAge()
  {
      System.out.println("===printAge===");
      for(Person temp: people)
      {
        System.out.println(temp.getName()+ " = " + temp.ageYear + " " + "years old");
      }
   }
  
}
