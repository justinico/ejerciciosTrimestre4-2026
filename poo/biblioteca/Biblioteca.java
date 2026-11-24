package poo.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {

        Libro libro1 = new Libro("El Señor de los Anillos","Tolkien");
        Libro libro2 = new Libro("La Divina Comedia","Dante Alighieri");
        System.out.println("Bienvenido a la Biblioteca! Libros disponibles:");
        System.out.println("- " + libro1.titulo + " - " + libro1.autor);
        System.out.println("- " + libro2.titulo + " - " + libro2.autor);

        Miembro henry = new Miembro("Henry");
        System.out.println("\nEl usuario " + henry.nombre + "ha entrado al sistema\n");

        henry.prestarLibros(libro1);
        henry.prestarLibros(libro2);

        henry.mostrarLibros();
    }
}
