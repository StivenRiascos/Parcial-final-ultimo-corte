public class LibroFisico extends Libro {
    private int numeroPaginas;

    public LibroFisico(String titulo, String autor, int anioPublicacion, int numeroPaginas) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void imprimirInfo() {
        System.out.println("Libro Fisico");
        System.out.println("-------------");
        super.imprimirInfo();
        System.out.println("Número de Páginas: " + numeroPaginas);
    }
}

