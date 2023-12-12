public class Principal {
    public static void main(String[] args) {

        System.out.println(" ");
// LibrosFisicos

        LibroFisico libroFisico1 = new LibroFisico("Aventuras en el Bosque Encantado", "Laura Aventurera", 2020, 300);
        LibroFisico libroFisico2 = new LibroFisico("El Secreto del Laberinto", "Carlos Intrigante", 2015, 500);
        LibroFisico libroFisico3 = new LibroFisico("El Misterio del Colibrí Dorado", "Isabel Misteriosa", 1999, 250);
        LibroFisico libroFisico4 = new LibroFisico("Viaje a las Estrellas Perdidas", "Alberto Viajero", 2010, 400);
        LibroFisico libroFisico5 = new LibroFisico("El Enigma del Reloj Cósmico", "Elena Curiosa", 2022, 600);

// LibrosElectronico

        LibroElectronico libroElectronico1 = new LibroElectronico("Romance en la Ciudad Virtual", "Laura Aventurera", 2018, "MOBI");
        LibroElectronico libroElectronico2 = new LibroElectronico("El Misterioso Código Binario", "Carlos Intrigante", 2005, "PDF");
        LibroElectronico libroElectronico3 = new LibroElectronico("El Último Bit Perdido", "Isabel Misteriosa", 1990, "EPUB");
        LibroElectronico libroElectronico4 = new LibroElectronico("Viaje a la Dimensión Digital", "Alberto Viajero", 2012, "PDF");
        LibroElectronico libroElectronico5 = new LibroElectronico("Crónicas del Ciberespacio", "Elena Curiosa", 2021, "EPUB");

        //Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // libros
        biblioteca.agregarLibro(libroFisico1);
        biblioteca.agregarLibro(libroFisico2);
        biblioteca.agregarLibro(libroFisico3);
        biblioteca.agregarLibro(libroFisico4);
        biblioteca.agregarLibro(libroFisico5);
        biblioteca.agregarLibro(libroElectronico1);
        biblioteca.agregarLibro(libroElectronico2);
        biblioteca.agregarLibro(libroElectronico3);
        biblioteca.agregarLibro(libroElectronico4);
        biblioteca.agregarLibro(libroElectronico5);


        biblioteca.imprimirLibros();
    }
}



