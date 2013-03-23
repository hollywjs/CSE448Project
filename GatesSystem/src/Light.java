public class Light extends Gate{
	private boolean isOn = false;
	
	public Light(){
		myIcon = "src/LIGHTOFF.png";
		setIcon();
	}
	
	public void flipSwitch(){
		isOn = !isOn;
		if(isOn){
			myIcon = "src/LIGHTON.png";
			setIcon();
		}
		else{
			myIcon = "src/LIGHTOFF.png";
			setIcon();
		}
	}
}