public class Wire {
	
	private int startX, endX,startY,endY = 0;
	private boolean isOn = false;
	private String color = "BLACK"; 
	
	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}
	
	public void flipSwitch(){
		isOn = !isOn;
		if(isOn){
			color = "YELLOW";
		}
		else{
			color = "BLACK";
		}
		
	}
	

}
