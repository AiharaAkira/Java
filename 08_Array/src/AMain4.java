
public class AMain4 {

	public static void main(String[] args) {
		
		int aa[] = {100, 200, 300, 400};
		
		int bb[] = new int[] {100, 200, 300};
		
		int cc[];
		cc = new int[] {100, 200};
		
		int dd[] = new int[1];
		dd[0] = 100;
		
		
		// aa[0] = 100
		// aa[1] = 200
		// aa[2] = 300
		// aa[3] = 400
		
		for(int i = 0; i < aa.length; i++) {
			System.out.println("aa[" +i+ "]" + "=" + aa[i]);
		}
		
		for(int i = 0; i < bb.length; i++) {
			System.out.println("bb[" +i+ "]" + "=" + bb[i]);
		}
		
		for(int i = 0; i < cc.length; i++) {
			System.out.println("cc[" +i+ "]" + "=" + cc[i]);
		}
		
		for(int i = 0; i < dd.length; i++) {
			System.out.printf("dd[%d] = %d\n", i, dd[i]);
		}
		
		
		
		
	}

}
