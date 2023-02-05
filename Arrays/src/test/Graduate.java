package test;

public class Graduate extends Student {

    @Override
    public boolean isPassed(int grade) {
        return grade > 80;
    }
}
