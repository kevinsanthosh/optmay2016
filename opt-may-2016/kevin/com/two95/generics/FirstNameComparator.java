package com.two95.generics;
import java.util.*;
public class FirstNameComparator implements Comparator {
	public int compare(Object o1,Object o2){
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		int index=s1.getFirstName().compareTo(s2.getFirstName());
		return index;

}
}
