
public class Snakes {
	 int viciousness;
     boolean venomous;
	
	Snakes(boolean v, int vi){
		venomous=v;
		viciousness=vi;
		
	}
	
	public void setvenomous(boolean v) {
		v=venomous;
	}
	
	public  boolean getvenomous(){
		return venomous;
	}
	
	public void setviciousness(int vi){
		vi=viciousness;
	}
	
	public  int getviciousness(){
		return viciousness;
	}

}
