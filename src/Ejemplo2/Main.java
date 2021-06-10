package Ejemplo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println("................Normal");
		printNames();
		
		System.out.println("................Stream 1");
		printNamesStream();
		
		System.out.println("................Stream 2");
		orderNames();
		
		System.out.println("................Filter");
		filter();
		
		System.out.println("................Count");
		count();
		
		System.out.println("................Distinct");
		distinct();
		
		System.out.println("................Limit 2");
		limit();
		
		System.out.println("................MaxAndMin");
		maxAndMin();
	}

	public static void printNames() {
		List<String> names = getEmployee();
		for (String name : names) {
			System.out.println(name);
		}
	}

	public static void printNamesStream() {
		List<String> names = getEmployee();
		names.stream().forEach(System.out::println);
	}
	
	public static void orderNames() {
		List<String> names = getEmployee();
		names.stream().sorted().forEach(System.out::println);
	}
	
	public static void filter() {
		List<String> names = getEmployee();
		names.stream().filter(name -> !name.startsWith("J")).forEach(System.out::println);
	}
	
	public static void count() {
		List<String> names = getEmployee();
		long count = names.stream().filter(name -> !name.startsWith("J")).count();
		System.out.println("# nombres que no empiezan con J: " + count);
	}
	
	public static void distinct() {
		List<String> names = getEmployee();
		long count = names.stream().distinct().count();
		System.out.println("# nombres distintos: " + count);
	}
	
	public static void limit() {
		List<String> names = getEmployee();
		names.stream().limit(2).forEach(System.out::println);
	}

	public static List<String> getEmployee() {
		List<String> list = new ArrayList<>();
		list.add("Oscar");
		list.add("Javier");
		list.add("Luis");
		list.add("Manuel");
		list.add("Ramón");
		list.add("Oscar");
		return list;
	}
	
	public static void maxAndMin() {
		List<Integer> numbers = getNumbers();
		numbers.stream().forEach(System.out::println);
		int max = numbers.stream().max((x, y) -> x.compareTo(y)).get();
		int min = numbers.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("Max = " + max + " | min = " + min);
	}
	
	public static List<Integer> getNumbers() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		list.add(1);
		list.add(20);
		return list;
	}
}
