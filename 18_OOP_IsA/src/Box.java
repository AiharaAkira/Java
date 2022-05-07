import java.util.Random;

public class Box extends Random{
	
	public Box() {
		
	}
	
	// Â¦¼ö¸¸
	@Override
	public int nextInt(int value) {
		int temp = super.nextInt(value);
		
		if(temp % 2 == 0) {
			return temp;
		}
		
		return nextInt(value);
	}
	
}
