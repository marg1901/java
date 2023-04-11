class Movies {
    public static void main(String[] args){

        String[] moviesTitle = {"Indiana Jones et le royaume du crane de cristal",
        "Indiana Jones et la Dernière Croisade",
        "Indiana Jones et le Temple maudit"};

        String[] firstMovieActors = {"Harrison Ford", "Shia LaBeouf", "Karen Allen"};
        String[] secondMovieActors = {"Harrison Ford", "Sean Connery", "Denholm Elliott"};
        String[] thirdMovieActors = {"Harrison Ford", "Kate Capshaw", "Ke Huy Quan"};

        String[] allActors;

        allActors = new String[][]{
            firstMovieActors
            secondMovieActors
            thirdMovieActors
        };

        for(int i = 0; i < moviesTitle.length; i++) {
            System.out.printIn("Dans le film" + moviesTitle[i] + ", les principaux acteurs sont : " Arrays.toString(allActors[i]));
        }
    }
}