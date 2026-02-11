package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario {
    public String nombre;
    public String email;
    public LocalDateTime registroUsuario;

    public Usuario(String nombre, String  email) {
        this.nombre = nombre;
        this.email = email;
        this.registroUsuario = LocalDateTime.now();
    }

    public void ver(Pelicula pelicula)
    {
        System.out.println(nombre + " esta viendo...");
        pelicula.reproducir();
    }

}


