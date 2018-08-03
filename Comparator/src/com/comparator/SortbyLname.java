package com.comparator;

import java.util.Comparator;

public class SortbyLname implements Comparator<Author> {
@Override
public int compare(Author o1, Author o2) {
	// TODO Auto-generated method stub
	if(o1.age==o2.age)
		return 0;
	
	else if(o1.age > o2.age)
		return 1;
	else
	return 0;
}
}
