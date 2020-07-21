package epamtask10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ReferenceToStatic 
{
	public static void main(String[] args) 
	{
        List<String> arr = Arrays.asList("121121","12221","1234321","mom","dad","abcd","hello");
        List<String> palindromes = ReferenceToStatic.findPalindrome(arr, 
                (str) -> ReferenceToStatic.isPalindrome((String) str));
        System.out.println("Palindromes are " + palindromes);
    }
 
    public static boolean isPalindrome(String str) 
    {
    	StringBuffer str_new =new StringBuffer();
    	for(int i = str.length()-1; i >= 0 ; i--) 
    	{
    	str_new = str_new.append(str.charAt(i));
    	}
    	if(str.equalsIgnoreCase(str_new.toString())) 
    	{
    		return true;
    	} 
    	else 
    	{
    		return false;
    	}
    } 
    public static List<String> findPalindrome(List<String> list, Predicate<String> pred) 
    { 
    	List<String> pal = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (pred.test((String) i))).forEach((i) -> {
            pal.add((String) i);
        });
        return pal;
 
    }

}
