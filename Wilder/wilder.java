public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname) {
        this.firstname = firstname;
        this.aware = false;
    }

    public Wilder(String firstname, boolean false) {
        this.firstname = firstname;
        this.aware = false;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware(){
        return this.aware;
    }

    public void setFirstname (String firstname) {
        this.firstname = firstname;
    }

    public void setAware (boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if(this.isAware() == false)
        return "JE M'APPELLE" + this.getFirstname() + "ET JE NE SUIS PAS AWARE.";
        else {
            return "JE M'APPELLE" + this.getFirstname() + "ET JE SUIS AWARE.";
        }
    }
}