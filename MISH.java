package HW_2;

public class MISH extends WIVOTNOE {
    String NAZVANIE;
    public MISH(String NAZVANIE, String EDA, String MESTOPOLOWENIE) {
        super(EDA, MESTOPOLOWENIE);
        this.NAZVANIE = NAZVANIE;
    }

    @Override
    public void WUMET() {
        System.out.println("Мышка пищит");
    }

    @Override
    public void KUWAT() {
        System.out.println("Мышка кушает ");
    }
}
