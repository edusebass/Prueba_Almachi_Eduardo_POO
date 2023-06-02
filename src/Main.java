//prueba1 Eduardo Almachi POO


//videojuegos impares 5 instancias
public class Main {
    public static void main(String[] args) {
        //Creacion de las instancias a partir de los atributos
        Videojuegos GTA = new Videojuegos("gta5", "accion", 60, "rockstargames", 8);
        Videojuegos FIFA = new Videojuegos("fifa2023", "deportes", 80, "EASPORTS", 10);
        Videojuegos Boll = new Videojuegos("boll 2", "aventura", 30, "sony", 7);
        Videojuegos Paintball = new Videojuegos("paintball 2", "deportes", 25, "VLXS", 6);
        Videojuegos scrash = new Videojuegos("scrash 3", "estrategia", 45, "SSRT COMPANY", 9);

        //con un sout espcificamos el juego
        System.out.println("Juego 1");
        GTA.imprimirDatos(); // espceificando el objeto y llamando al metodo
        //se puede imprimir todos las variables de ese objeto

        System.out.println("\nJuego 2");
        FIFA.imprimirDatos();

        System.out.println("\nJuego 3");
        Boll.imprimirDatos();

        System.out.println("\nJuego 4");
        Paintball.imprimirDatos();

        System.out.println("\nJuego 5");
        scrash.imprimirDatos();

    }
}