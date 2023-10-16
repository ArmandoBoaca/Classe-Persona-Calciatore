public class Persona {
    private String nome;
    private int annoNascita;
    private String sesso;

    public Persona(String nome, int annoNascita, String sesso){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
    }

    public void setSesso(String newSesso){
        this.sesso = newSesso;
    }
    public String toString(){
        String str = "{";
        str += "\n\"nome\" : \""+this.nome+"\",";
        str += "\n\"annoNascita\" : "+this.annoNascita+",";
        str += "\n\"sesso\" : \""+this.sesso+"\"";
        str += "\n}";
        return str;
    }
}
