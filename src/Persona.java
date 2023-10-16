public class Persona {
    private String nome;
    private int annoNascita;
    private String sesso;
    private int nScarpe;

    public Persona(String nome, int annoNascita, String sesso, int nScarpe){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
        this.nScarpe = nScarpe;
    }

    public Persona(Persona persona){
        this.nome = persona.nome;
        this.annoNascita = persona.annoNascita;
        this.sesso = persona.sesso;
        this.nScarpe = persona.nScarpe;
    }

    public String getNome() {
        return nome;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public String getSesso() {
        return sesso;
    }

    public int getnScarpe() {
        return nScarpe;
    }

    public void setnScarpe(int nScarpe) {
        this.nScarpe = nScarpe;
    }

    public void setSesso(String newSesso){
        this.sesso = newSesso;
    }

    public Object clone(){
        return new Persona(this.nome, this.annoNascita,this.sesso, this.nScarpe);
    }
    public String toString(){
        String str = "{";
        str += "\n\"nome\" : \""+this.nome+"\",";
        str += "\n\"annoNascita\" : "+this.annoNascita+",";
        str += "\n\"sesso\" : \""+this.sesso+"\", ";
        str += "\n\"nScarpe\" : "+this.nScarpe+"";
        str += "\n}";
        return str;
    }

    public String toStringInner(){
        String str = "";
        str += "\n\"nome\" : \""+this.nome+"\",";
        str += "\n\"annoNascita\" : "+this.annoNascita+",";
        str += "\n\"sesso\" : \""+this.sesso+"\", ";
        str += "\n\"nScarpe\" : "+this.nScarpe;
        return str;
    }
}
