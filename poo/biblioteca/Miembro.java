package poo.biblioteca;

import java.util.ArrayList;



public class Miembro {

    String nombre;
    ArrayList<Libro> librosPrestados;

    public Miembro(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public void prestarLibros(Libro libro) {
        this.librosPrestados.add(libro);
        System.out.println(this.nombre + " se te ha prestado el libro: " + libro.titulo);

    }

    public void devolverLibro(Libro libro) {
        this.librosPrestados.remove(libro);
        System.out.println(this.nombre + " ha sido removido de la lista " + libro.titulo);
    }

    public void mostrarLibros() {
        System.out.println("\nEstos libros fueron prestados a: " + this.nombre);
        for(Libro libro : this.librosPrestados){
            System.out.println( libro.titulo + " es de " + libro.autor);
        }
    }

}
