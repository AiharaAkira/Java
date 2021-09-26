public class Seat {
    
	private String name;
	
	public String getName() {
		return	name;
	}
	
	public void reserve(String name) {
		this.name = name;
	}
	
	public void cancel() {
		this.name = null;
	}
	
	 public boolean isOccupied() {
		 if(this.name == null) {
			 return false;
		 }
		 return true;
	 }
	 
	 public boolean match(String checkName) {
		
		 if(this.name.equals(checkName)) {
			 return true;
		 }
		 return false;
	 }
	
}