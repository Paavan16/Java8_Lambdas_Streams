package epamtask10;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AvgofIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9};
        IntStream stream = IntStream.of(arr); 
        OptionalDouble obj = stream.average(); 
        if (obj.isPresent()) { 
            System.out.println(obj.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 

	}

}
