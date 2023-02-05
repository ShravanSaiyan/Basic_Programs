package test;

public class UnderGraduate extends Student {

    @Override
    public boolean isPassed(int grade) {
        return grade > 70;
    }
}
