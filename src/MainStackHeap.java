import platzi.play.contenido.Pelicula;

public class MainStackHeap {
    public static void main(String[] args) {
        Pelicula reyLeon = new Pelicula("Rey Leon", 130, "Animada");
        Pelicula harryPotter = new Pelicula("Harry Potter", 140, "Magia");

        System.out.println(reyLeon.titulo);
        System.out.println(harryPotter.titulo);
    }
}
