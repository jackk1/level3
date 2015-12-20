import java.util.Random;

public class randomness {
	
	static Random randint = new Random();
	public static int num1through10;

	public static void main(String[] args){	
		num1through10();
		boleanmethod();
		
		
			
		
	}
	static boolean boleanmethod() {
		return randint.nextBoolean();
		// TODO Auto-generated method stub
		
	}
	static int num1through10() {
		return randint.nextInt(11);
		// TODO Auto-generated method stub
		
	}
		
	}

