package org.webskey.gittest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableReview {
	public static void main(String[] main) {
		List<Nbp> list = new ArrayList<>();
		list.add(new Nbp("Jan", "Kilinski",2));
		list.add(new Nbp("Bartosz", "Kalinski", 4));
		list.add(new Nbp("Bogumi³", "Kijanski", 1));
		list.add(new Nbp("Norbert", "Bob", 9));
		System.out.println(list.toString());
		
		Collections.sort(list);
		System.out.println(list.toString());
		
		Comparato comparator = new Comparato();
		Collections.sort(list, comparator);
		System.out.println(list.toString());
	}
}
