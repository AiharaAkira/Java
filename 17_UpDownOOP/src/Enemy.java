import java.util.Random;

public class Enemy extends Random{

	public int ChoosN() {
		
		return super.nextInt(99) + 1;
		
	}

}
