package com.automobile;

import com.automobile.twowheeler.hero;
import com.automobile.twowheeler.Honda;

public class Test{

	public static void main(String[] args) {
		hero hero = new hero("Hero", "M9060", "WIPRO", 100);
		System.out.println(hero.getModelName());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getSpeed()+" kmph");
		
		System.out.println();
		
		Honda honda = new Honda("Honda", "M5101", "REVA UNIVERSITY", 130);
		System.out.println(honda.getModelName());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getSpeed()+" kmph");
	}

}
