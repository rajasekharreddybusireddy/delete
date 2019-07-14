package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Employee> list1 = new ArrayList<Employee>();
		list1.add(new Employee(2, "b", 1002d));
		list1.add(new Employee(3, "d", 1003d));
		list1.add(new Employee(1, "a", 1001d));
		//list1.forEach(e -> System.out.println(e.getEid()));
		Collections.sort(list1, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEid().compareTo(o2.getEid());
			}
		});
		System.out.println("==========================");
		//list1.forEach(e -> System.out.println(e.getEid()));

		List<Employee> list2 = new ArrayList<Employee>();
		list2.add(new Employee(1, "a", 1001d));
		list2.add(new Employee(2, "c", 1002d));
		Collections.sort(list2, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEid().compareTo(o2.getEid());
			}
		});
		List<Employee> d1 = new ArrayList<Employee>(list1);
		List<Employee> d2 = new ArrayList<Employee>(list2);
		d1.removeAll(list2);
		d2.removeAll(list1);
		d1.forEach(e->System.out.println(e.getEid()+" d1"));
		d2.forEach(e->System.out.println(e.getEid()));
		list2.addAll(d1);
		list1.addAll(d2);
		list2.forEach(e->System.out.println(e.getEid()+ e.getName()+ e.getSalary()));
		System.out.println("==========================");

		list1.forEach(e->System.out.println(e.getEid()+ e.getName()+ e.getSalary()));

		boolean equalLists = equalLists(list1, list2);
System.out.println(equalLists);

	}

	public static boolean equalLists(List<Employee> one, List<Employee> two) {
		if (one == null && two == null) {
			return true;
		}

		if ((one == null && two != null) || one != null && two == null || one.size() != two.size()) {
			return false;
		}

		// to avoid messing the order of the lists we will use a copy
		// as noted in comments by A. R. S.
		one = new ArrayList<Employee>(one);
		two = new ArrayList<Employee>(two);

		// Collections.sort(one);
		// Collections.sort(two);
		Collections.sort(two, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEid().compareTo(o2.getEid());
			}
		});
		Collections.sort(one, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEid().compareTo(o2.getEid());
			}
		});
		return one.equals(two);
	}

	private static void compareLists(List<Employee> list1, List<Employee> list2) {

		int size = list1.size() > list2.size() ? list1.size() : list2.size();
		for (int i = 0; i <= size; i++) {
			if (list1.get(i).getEid().equals(list2.get(i).getEid())) {

			} 
		}
	}
}
