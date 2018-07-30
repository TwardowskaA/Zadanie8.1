public class Car extends Vehicle {

    private boolean klimatyzacja;

    public Car(String nazwa, double pojemnosc, double spalanie, boolean klimatyzacja) {
        super(nazwa, pojemnosc, spalanie);
        this.klimatyzacja = klimatyzacja;
    }

    public boolean isKlimatyzacja() {
        return klimatyzacja;
    }

    public void setKlimatyzacja(boolean klimatyzacja) {
        this.klimatyzacja = klimatyzacja;
    }

    public void klimON() {
        klimatyzacja = true;
    }

    public void klimOff() {
        klimatyzacja = false;
    }

    @Override
    public double spalanieCalkowite() {
        if (klimatyzacja) {
            return super.spalanieCalkowite() + 0.8;
        } else {
            return super.spalanieCalkowite();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Klimatyzacja:" + " " + klimatyzacja;

    }

    @Override
    public void zasieg() {
        super.zasieg();
    }
}

