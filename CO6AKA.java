package HW_2;

public class CO6AKA extends WIVOTNOE {
    String NAZVANIE;

    public CO6AKA(String NAZVANIE, String EDA, String MESTOPOLOWENIE) {
        super(EDA, MESTOPOLOWENIE);
        this.NAZVANIE = NAZVANIE;
    }

    @Override
    public void WUMET() {
        System.out.println("Собак говорит по собачьи");
    }

    @Override
    public void KUWAT() {
        System.out.println("Собака кушает");
    }
}
