public class Classroom {
    public static void main(String[] args) {
        Wilder Margaux = new Wilder("Margaux", false);
        System.out.println(Margaux.whoAmI());

        Wilder Joseph = new Wilder("Joseph", true);
        Joseph.setAware(true);
            System.out.println(Joseph.whoAmI());
    }
}