package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Plataforma {
    private String titulo;
    private List<Pelicula> contenido;

    public Plataforma(String titulo) {
        this.titulo = titulo;
        this.contenido = new ArrayList();
    }

    public void agregar(Pelicula elemento) {
        this.contenido.add(elemento);
    }

    public void mostrarTitulo() {
        for (Pelicula pelicula : contenido) {
            System.out.println(pelicula.getTitulo());
        }
    }

    public void eliminar(Pelicula elemento) {
        this.contenido.remove(elemento);
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Pelicula> getContenido() {
        return contenido;
    }
}
