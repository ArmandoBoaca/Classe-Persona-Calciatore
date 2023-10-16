import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona("Gianni", 2000, "Maschio");
        System.out.println(p1.toString());

        Persona p2 = (Persona) p1.clone();
        p2.setSesso("Pansessuale");
        System.out.println(p2.toString());

        Calciatore c1 = new Calciatore("Giacomo", 2000, "Maschio", "Centrocampista", 17, 32);
        System.out.println(c1.toString());
        c1.addGoal(5);
        Calciatore c2 = (Calciatore)c1.clone();
        System.out.println(c2.toString());



    }
}
