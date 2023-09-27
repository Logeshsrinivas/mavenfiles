package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesterStream {
	public static void main(String[] args) {
//		List<Integer> list =Stream.generate((x)-x+5).limit(10);
//		
//		Stream<String> list = Stream.generate(()->"element").limit(10);
//		list.forEach(x->System.out.println(x+" "));
//		
//		Stream.iterate(1,x->x+5)
//		.limit(5).filter(x->x%10==1)
//		.forEach(System.out::println);
//		
//		Integer[] array = {56,23,78,99,100,106,408,206,704};
//		Stream.of(array).filter(x->x%2==0).sorted()
//		.forEach(x->System.out.println(x));
		
//		Source will be a collections - list,set Map
		
		List<String> list = Arrays.asList("Cris","Stephen","Maria","Monica","Caroline");
		System.out.println(list);
		list.stream().filter(s->s.startsWith("M"))
		.sorted().collect(Collectors.toList())
		.forEach(x->System.out.println(x));
		ArrayList<Integer> al = new ArrayList();
		for (int i = 1; i <=10; i++) {
			al.add(i);
		}
		al.add(2);
		al.add(4);
//		 Integer value = al.stream()
//		.filter(x->x%2==0)
//		.map(x->x*x)
//		.reduce(0,(sum,i)->sum+i);
//		 System.out.println(value);
			Long count= al.stream()
			.filter(x->x%2==0).count();
//			.collect(Collectors.toSet())
//			.forEach(x->System.out.println(x));
			System.out.println(count);
		
	}

}
