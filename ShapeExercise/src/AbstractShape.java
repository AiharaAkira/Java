public abstract class AbstractShape {
    // �׸��ǿ����� ��ġ
    protected double x;
    protected double y;

    // ������
    public AbstractShape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    

    
    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setter
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // ���� �����̱�
    public void move(double xDistance, double yDistance) {
        x += xDistance;
        y += yDistance;
    }
}