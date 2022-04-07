
public class array3 {
	public static void main(String[] args) {
		int k = 0;
		int i = 0;
		int j = 0;

		int[][][] rapt = new  int [5][10][10];
		 
		for(k=0; k<5; k++){
			for(i=0; i<rapt[k].length;i++){
				for(j=0; j<rapt[k][i].length; j++){
					System.out.println(rapt[i][j][k]);
				}
			}
		}
	}
}
