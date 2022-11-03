package com.sda.fundamentals;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		System.out.println("hi, this is sorin");

		Car car = new Car(2001);
		Car car2 = new Car(2007);
		Car car3 = new Car(2018);

		Set<Car> cars = new TreeSet<>();

		cars.add(car);
		cars.add(car2);
		cars.add(car3);

		if(car.compareTo(car2) < 0){
			System.out.println("First car is older");
		}

		Movie movie =  new Movie("Avatar", (float) 3.1,2006);
		Movie movie2 =  new Movie("Cars", (float) 7.1,2010);
		Movie movie3 =  new Movie("Avengers", (float) 6.1,2013);

		Set<Movie> movies = new HashSet<>();

		movies.add(movie);
		movies.add(movie2);
		movies.add(movie3);

		CompareMovies compareMovies = new CompareMovies();
		System.out.println(compareMovies.compare(movie,movie2));
		//Set<Object> sortedCars = ( Car, (c1,c2) -> c1.getFabricationYear().compareTo(c2.getFabricationYear()));


		Map<String, String> countries = new HashMap<>();

		countries.put("ro", "romania");
		countries.put("en", "england");
		countries.put("fr", "france");


	}
}
