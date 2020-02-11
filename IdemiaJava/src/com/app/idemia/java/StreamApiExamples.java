package com.app.idemia.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class StreamApiExamples {



	/**
	 * @param args
	 */
	public static void main(String[] args) {



		List<Person>  javaProgrammer= new ArrayList<Person>() {

			{
				add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
				add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
				add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
				add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
				add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
				add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
				add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
				add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
				add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
				add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));

			}

		};

		System.out.println(javaProgrammer);
		
		
		
		 List<Person> phpProgrammers = new ArrayList<Person>() {
	            {
	                add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
	                add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
	                add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
	                add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
	                add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
	                add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
	                add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
	                add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
	                add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
	                add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
	            }
	        };
	        
	       System.out.println(phpProgrammers);
	       
	       //Let’s now use the forEach method to iterate the above lists:
	       
		/*
		 * System.out.println("Show programmers names:"); javaProgrammer.forEach((p) ->
		 * System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));
		 * phpProgrammers.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(),
		 * p.getLastName()));
		 */
	       
	       
	       //We will now use the same forEach method and try to increase programmer’s salary by 5%:
	       
	       System.out.println("Increase salary by 5% to programmers:");
	       Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() / 100 * 5 + e.getSalary());
	       
	        
	       javaProgrammer.forEach(giveRaise);
	       phpProgrammers.forEach(giveRaise);
	       
	       
	}
}