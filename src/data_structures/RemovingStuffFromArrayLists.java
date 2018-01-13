package data_structures;

import java.util.ArrayList;

/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 3 Two ArrayList
 * Cleaning Exercises Duration=.00 Platform=Eclipse Type=Recipe Objectives=
 */

public class RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		class Stuff {
		}
		class Worm extends Stuff {
		}
		class Dirt extends Stuff {
		}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		System.out.println(stuffIFoundInTheYard.size());

		for (int i = 0; i < stuffIFoundInTheYard.size(); i++) {
			if(stuffIFoundInTheYard.get(i) instanceof Dirt) {
				stuffIFoundInTheYard.remove(i);
				i-=1;
			}
			
		}

		System.out.println(stuffIFoundInTheYard.size()); // should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('s');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('#');
		truth.add('o');
		truth.add('u');
		truth.add('#');
		truth.add('t');
		truth.add('#');
		truth.add(' ');
		truth.add('g');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add('#');
		truth.add(' ');
		truth.add('o');
		truth.add('#');
		truth.add('u');
		truth.add('t');

		for (int i = 0; i < truth.size(); i++) {
			if(truth.get(i)=='#') {
				truth.remove(truth.get(i));
				i-=1;
				
			}
		}
		String list = "";
		for (int i = 0; i < truth.size(); i++) {
			list+=truth.get(i);
		}
		System.out.println(list);
	}
}
