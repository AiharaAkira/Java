public class Main {
    public static void main(String[] args) {
        GradeCalculator gradeCalc = new GradeCalculator("�����", 4.0, 100);

        gradeCalc.addCourse(new Course("OOP", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("��ȣ�ͽý���", Course.CREDIT_MAJOR, "A"));
        gradeCalc.addCourse(new Course("�ؼ���", Course.CREDIT_MAJOR, "B+"));
        gradeCalc.addCourse(new Course("Ȯ��", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("��������", Course.CREDIT_GENERAL, "A"));

        gradeCalc.print();
    }
}