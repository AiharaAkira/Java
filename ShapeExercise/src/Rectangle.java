public class Rectangle extends AbstractShape implements Printable{
    // ����
    double side1; // ����
    double side2; // ����

    // ������
    public Rectangle(double side1, double side2) {
        super(0, 0);
        this.side1 = side1;
        this.side2 = side2;
    }
    
@Override
    public void print() {
    	for(int i = 0; i < side1; i++) {
    		String Line = "";
    		for(int j = 0; j < side2; j++) {
    			Line += "*";
    		}
    		System.out.println(Line);
    	}
    	
    }
    
    // ����
    public double getArea() {
        return side1 * side2;
    }

    // �ѷ�
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }
}