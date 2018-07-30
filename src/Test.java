public class Test {
    public static void main(String[] args) {
        Car[] veh = new Car[2];
        veh[0] = new Car("Skoda", 45, 4.5, false);
        veh[1] = new Truck("Daf", 800, 33, false, 300);


        System.out.println(veh[0].toString());
        System.out.println(veh[1].toString());

        veh[0].zasieg();
        veh[1].zasieg();

        veh[0].klimON();
        veh[1].klimON();

        System.out.println(veh[0].toString());
        System.out.println(veh[1].toString());

        veh[0].zasieg();
        veh[1].zasieg();
    }
}

