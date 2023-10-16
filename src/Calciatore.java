public class Calciatore extends Persona{
    private String ruolo;
    private int nMaglia;
    private int nGoal;

    public Calciatore(String nome, int annoNascita, String sesso, String ruolo, int nMaglia, int nGoal) {
        super(nome, annoNascita, sesso);
        this.ruolo = ruolo;
        this.nMaglia = nMaglia;
        this.nGoal = nGoal;
    }

    public String getRuolo() {
        return ruolo;
    }

    public int getnMaglia() {
        return nMaglia;
    }

    public int getnGoal() {
        return nGoal;
    }

    public void addGoal(int nGoal){
        this.nGoal += nGoal;
    }

    @Override
    public Object clone() {
        Calciatore newCal = (Calciatore) super.clone();
        newCal.ruolo = this.ruolo;
        newCal.nMaglia = this.nMaglia;
        newCal.nGoal = this.nGoal;
        return newCal;
    }

    public String toString(){
        String str = "{";
        str += super.toStringInner();
        str += "\n\"ruolo\":\""+this.ruolo+"\",";
        str += "\n\"nMaglia\":"+this.nMaglia+",";
        str += "\n\"nGoal\":"+this.nGoal;
        str += "\n}";
        return str;
    }

    public String toStringInner(){
        String str = "";
        str += super.toStringInner();
        str += "\n\"ruolo\":\""+this.ruolo+"\",";
        str += "\n\"nMaglia\":"+this.nMaglia+",";
        str += "\n\"nGoal\":"+this.nGoal+", ";
        return str;
    }
}
