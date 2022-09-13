package HW_2;

public class Student {
    private String NAME;
    private String FAMILIYA;
    private String GRUPPA;
    public double BALL;

    public Student(String NAME, String FAMILIYA, String GRUPPA, double BALL) {
        this.NAME = NAME;
        this.FAMILIYA = FAMILIYA;
        this.GRUPPA = GRUPPA;
        this.BALL = BALL;
    }

    int Stepuha() {
        return BALL == 5 ? 10000 : 8000;
    }
}
