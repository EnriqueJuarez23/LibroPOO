import java.util.Scanner;

public class MainLibro {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingresa el titulo de un libro:");
        String titulo = obj.nextLine();
        System.out.println("Ingresa el autor del libro:");
        String autor = obj.nextLine();
        System.out.println("Ingresa el ISBN de un libro:");
        int isbn = obj.nextInt();
        System.out.println("Ingresa las paginas del libro:");
        int paginas = obj.nextInt();

        Libro opc = new Libro();
        opc.crearTitulo(titulo);
        opc.crearAutor(autor);
        opc.crearIsbn(isbn);
        opc.crearPaginas(paginas);
        opc.crearLibro();
    }
}