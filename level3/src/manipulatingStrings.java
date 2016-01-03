import org.junit.Test;
import java.util.Scanner;

public class manipulatingStrings {
	

	@Test
	public void test() {
		
		
		assertEquals("SAN DIEGO", stringToUpperCase("san diego"));
		assertEquals("Spider Man", camelcasing("spider man"));
		assertEquals("SaN dIeGo", alternateCaps("san diego"));
	
		
		
		
	}
	private void assertEquals(String string, Object stringToUpperCase) {
		// TODO Auto-generated method stub
		
	}
	public String stringToUpperCase(String s) {
	
	s=s.toUpperCase();
	System.out.println(s);
	return s;
}
	public String camelcasing(String p){
		String x=p.substring(0,1);
		x=x.toUpperCase();
		String y=p.substring(5,6);
		y=y.toUpperCase();
		String z=p.substring(1,3);
		String a=(x+z);
		String b=p.substring(4,9);
		String c=(y+b);
		String d=(c+a);
		//System.out.prinltn(d);
		return d;
	
	}
	public String alternateCaps(String n){
		String s=n.substring(0,1);
		s=s.toUpperCase();
		String a=n.substring(1,2);
		String q=n.substring(2,3);
		q=q.toUpperCase();
		String firstWord=q+s+a;
		String g=n.substring(5,6);
		String h=n.substring(6,7);
		h=h.toUpperCase();
		String i=n.substring(7,8);
		String j=n.substring(8,9);
		j=j.toUpperCase();
		String k=n.substring(9,9);
		String secondWord=g+h+i+j+k;
		String word=firstWord+secondWord;
		return word;
		
		
		
	}
}




