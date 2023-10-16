public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona("Gianni", 2000, "Maschio");
        System.out.println(p1.toString());

        Persona p2 = (Persona) p1.clone();
        p1.setSesso("Pansessuale");
        System.out.println(p2.toString());


    }
}
