package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;
import platzi.play.utils.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY 🍿";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        System.out.println(NOMBRE_PLATAFORMA + " v" +  VERSION);

        String nombre = ScannerUtils.capturarText("Nombre del contenido");
        String genero = ScannerUtils.capturarText("Genero del contenido");
        int duracion = ScannerUtils.capturarNumero("Duracion del contenido");
        double calificacion =  ScannerUtils.capturarDecimal("Calificacion del contenido");

        Pelicula pelicula = new Pelicula(nombre, duracion, genero);
        pelicula.titulo = nombre;
        pelicula.fechaEstreno = LocalDate.of(2018, 10, 15);
        pelicula.genero = genero    ;
        pelicula.calificar(calificacion);
        pelicula.duracion = duracion;

        System.out.println(pelicula.obtenerFichaTecnica());

        Usuario usuario = new Usuario();
        usuario.nombre = "Oscar";
        usuario.registroUsuario = LocalDateTime.now();


        //System.out.println("El usuario se ha registrado: " +  usuario.registroUsuario);

        usuario.ver(pelicula);
    }
}
