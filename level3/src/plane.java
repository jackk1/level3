import java.util.ArrayList;

public class plane {
	static int numOfPassengers=100;
	
	static ArrayList<Snakes>listOfSnakes;
	
	plane(){
		listOfSnakes=new ArrayList<Snakes>();
		double probOfDeath;
		int totalVenomousSnakes=0;
		int totalViciousness=0;
		for(int i=0; i<100; i++){
			Snakes s=new Snakes(randomness.boleanmethod(), randomness.num1through10());
			System.out.println(s.getviciousness()+" "+s.getvenomous() );
			listOfSnakes.add(s);
		}
		for(Snakes s:listOfSnakes){
			if (s.getvenomous()){
				totalVenomousSnakes++;
			}
			totalViciousness=totalViciousness+s.getviciousness();
			
		}
		probOfDeath=(totalVenomousSnakes*totalViciousness)/numOfPassengers;
		System.out.println("the total viciousness is: "+totalViciousness);
		System.out.println("the total ammount of venomous snakes is: "+totalVenomousSnakes);
		System.out.println("the probability of death is: "+probOfDeath);
	
	}
	public static void main(String[] args){
		plane plane=new plane();
	}

}
