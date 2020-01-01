package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CustomOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Author> al= new ArrayList<Author>();
		al.add(new Author("kids","child",10,5000));
		al.add(new Author("zoozo","toy",1,1000));
		al.add(new Author("comfort","girl",18,10000));
		al.add(new Author("mazaka","boy",14,3000));
		
		System.out.println("Before sorting customorder"+al);
		
		Collections.sort(al);
		for(Author l:al){
			System.out.println(l.getLname()+"   "+l.getFname()+"   "+l.getAge()+"     "+l.getSalary());
		}

	}

}
