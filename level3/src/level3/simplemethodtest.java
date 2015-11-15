package level3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class simplemethodtest {

	@Test
	public void test() {
		
	
	ArrayList<Integer> a1 = new ArrayList();
	ArrayList<Integer> a2 = new ArrayList();
	
	a1.add(7);
	a1.add(3);
	a1.add(26);
	a2.add(7);
	a2.add(26);
	a2.add(-7);
	
	assertEquals(2, getmatching(a1, a2));
	}
	public int getmatching(ArrayList <Integer> a1, ArrayList <Integer> a2){
		int numofs;
		numofs=0;
		for(Integer i : a1){
			System.out.println(i);
		
			for(Integer n : a2){
				System.out.println(n);
				if (i==n){
					numofs=numofs+1;
				}
		
		}
		}
	
		
		
		return numofs;
	}
}

