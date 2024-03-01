import java.io.*;
import java.util.ArrayList;

public class ArrayListDemo{
public static void main(String[] args){


	ArrayList<Integer> arrlist = new ArrayList<Integer>(9);

	arrlist.add(18);
	arrlist.add(27);
	arrlist.add(36);

	for(Integer number : arrlist){
		System.out.println("Number = " + number);
	}
    }
}