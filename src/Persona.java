public class Persona {
    private String nome;
    private int annoNascita;
    private String sesso;

    public Persona(String nome, int annoNascita, String sesso){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
    }

    public String toString(){
        String str = "{";
        str+= "\n\"nome\" : \""+this.nome+"\",";
        str+= "\n\"annoNascita\" : "+this.annoNascita+",";
        str+= "\n\"sesso\" : \""+this.sesso+"\",";
        return str;
    }
}
