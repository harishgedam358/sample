package sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {
	public static void main(String []args){
	String s = "welcome to code decode code decode welcome you";
	List<String> list = Arrays.asList(s.split(" "));
	Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	}
}