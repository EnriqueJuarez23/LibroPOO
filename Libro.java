public class Libro {
    String titulo, autor;
    int isbn, paginas;

    public void crearLibro() {
        System.out.println("Titulo:"+this.titulo);
        System.out.println("Autor:"+this.autor);
        System.out.println("ISBN:"+this.isbn);
        System.out.println("Paginas:"+this.paginas);
    }
    public void crearTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void crearAutor(String autor) {
        this.autor = autor;
    }
    public void crearIsbn(int isbn) {
        this.isbn = isbn;
    }
    public void crearPaginas(int paginas) {
        this.paginas = paginas;
    }
}
