package com.comparator;

import java.util.Comparator;

public class SortbyAge implements Comparator<Author> {
@Override
public int compare(Author o1, Author o2) {
	// TODO Auto-generated method stub
	
	return o1.fname.compareTo(o2.fname);
}
}
