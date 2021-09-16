import java.util.ArrayList;

public class GradeCalculator {
	public final String name;
	public final double currentScore;
	public final int currentCredit;
	private final ArrayList<Course> courses = new ArrayList<>();
	public GradeCalculator(String name, double currentScore, int currentCredit) {
		
		this.name = name;
		this.currentScore = currentScore;
		this.currentCredit = currentCredit;
	}

	public void addCourse(Course course) {
		// ���� �߰��� addCourse ����, print���� ���� ��� ���
		courses.add(course);
	}

	public void print() {
		System.out.println("���� �б� ����: " + currentScore + "(�� " + currentCredit + "����)");
		
			double scoreSum = 0;
			int creditSum = 0;
			for (Course c : courses) {
				scoreSum += c.getScore() * c.credit;
				creditSum += c.credit;
			}
		
		System.out.println("�̹� �б� ����: " +(scoreSum/creditSum) + "(�� " + creditSum + "����)");
		
		double totalScore = currentScore * currentCredit + scoreSum;
		int totalCredit = currentCredit + creditSum;
		
		System.out.println("��ü �б� ����: " +(totalScore/totalCredit) + "(�� " + totalCredit + "����)");
	}

}
