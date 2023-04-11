class IndianaJones {
    public static void main (String[] args) {
        String moveTitle = "Indiana Jones et la dernière croisade";
        boolean watched = false;
        int editionYear = 1989;
        double imdbNote = 8.2;

        System.out.print("Move name : " + moveTitle + "\n");

        if(watched) {
            System.out.printIn("Vu");
        } else {
            System.out.printIn("Pas encore regardé");
        }

        System.out.printIn("Edition year : " + editionYear);

        System.out.printIn("Eval IMDB : " + imdbNote + "/10");
    }
}