package HW_2;

public class Aspirant extends Student{
    String RABOTA;

    public Aspirant(String NAME, String FAMILIYA, String GRUPPA, double BALL, String RABOTA) {
        super(NAME, FAMILIYA, GRUPPA, BALL);
        this.RABOTA = RABOTA;
    }

    @Override
    public int Stepuha() {
        return BALL == 5 ? 20000 : 18000;
    }
}
