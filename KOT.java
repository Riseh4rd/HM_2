package HW_2;

public class KOT extends WIVOTNOE {
    String NAZVANIE;

    public KOT(String NAZVANIE, String EDA, String MESTOPOLOWENIE) {
        super(EDA, MESTOPOLOWENIE);
        this.NAZVANIE = NAZVANIE;
    }


    @Override
    public void WUMET() {
        System.out.println("Кот издает звуки и шумит, прямо как настоящий кот!");
    }

    @Override
    public void KUWAT() {
        System.out.println("Кот кушает ");
    }
}
