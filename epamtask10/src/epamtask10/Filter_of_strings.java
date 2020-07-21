package epamtask10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_of_strings {

	public static List<String> searchlist(List<String> list) 
	{
		return list
				.stream()
				.filter(s -> s.startsWith("a") && s.length()==3)
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) 
	{
		List<String> arrlist = new ArrayList<String>();
		arrlist.add("abcd"); 
	    arrlist.add("aba"); 
	    arrlist.add("bab");
	    arrlist.add("aaa");
	    List<String> sl = searchlist(arrlist); 
	    System.out.println(sl);
	}
}