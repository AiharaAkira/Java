public class Main {
    public static void main(String[] args) {
        GradeCalculator gradeCalc = new GradeCalculator("±è½ÅÀÇ", 4.0, 100);

        gradeCalc.addCourse(new Course("OOP", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("½ÅÈ£¿Í½Ã½ºÅÛ", Course.CREDIT_MAJOR, "A"));
        gradeCalc.addCourse(new Course("ÇØ¼®ÇÐ", Course.CREDIT_MAJOR, "B+"));
        gradeCalc.addCourse(new Course("È®·ü", Course.CREDIT_MAJOR, "A+"));
        gradeCalc.addCourse(new Course("½ºÆ÷Ã÷´í½º", Course.CREDIT_GENERAL, "A"));

        gradeCalc.print();
    }
}