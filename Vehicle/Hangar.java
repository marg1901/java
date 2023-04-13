public class Hangar {
    public static void main(String[] args) {

        Car frv = new Car("Honda", 180000);
        Car niro = new Car("Kia", 64000);
        Boat voilier = new Boat("Mercury", 2000);
        Boat yacht = new Boat("Azimut", 10);

        System.out.println(frv.doStuff());
        System.out.println(niro.doStuff());
        System.out.println(voilier.doStuff());
        System.out.println(yacht.doStuff());
    }
}