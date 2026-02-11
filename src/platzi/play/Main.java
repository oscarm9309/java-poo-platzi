package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.utils.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY 🍿";
    public static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA + " v" +  VERSION);

        while (true) {
            int opcionElegida = ScannerUtils.capturarNumero("""
                        Ingrese una de las siguientes opciones:
                        1. Agregar contenido
                        2. Mostra todo
                        3. Buscar por titulo
                        4. Eliminar
                        5. Salir
                    """);

            System.out.println("La opcion elegida es: " +  opcionElegida);

            if (opcionElegida  == 5) {
                System.exit(0);
            }
        }


//        String nombre = ScannerUtils.capturarText("Nombre del contenido");
//        String genero = ScannerUtils.capturarText("Genero del contenido");
//        int duracion = ScannerUtils.capturarNumero("Duracion del contenido");
//        double calificacion =  ScannerUtils.capturarDecimal("Calificacion del contenido");
//
//        Pelicula pelicula = new Pelicula(nombre, duracion, genero, calificacion);
//        Pelicula pelicula1 =  new Pelicula("F1 The Movie", 220, "Accion");
//
//
//        plataforma.agregar(pelicula);
//        plataforma.agregar(pelicula1);
//        System.out.println("Número de elementos: " + plataforma.getContenido().size());
//        plataforma.eliminar(pelicula1);
//
//        plataforma.mostrarTitulo();
//
//        Usuario usuario = new Usuario("Oscar", "oscar@correo.com");


        //System.out.println("El usuario se ha registrado: " +  usuario.registroUsuario);

//        usuario.ver(pelicula);
    }
}
