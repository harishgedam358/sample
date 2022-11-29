package sample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Sample{
	  public static void main(String[] args){
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(2,"Harish",3500));
		list.add(new Employee(3,"arish",1500));
		
		Stream<Employee> filter = list.stream().filter(i -> (i.getSalary()>1000));
		Stream<Employee> sorted = filter.sorted(null);
		sorted.forEach(x -> System.out.println(x.getSname() +" "+x.getSalary()));
		}
	}
