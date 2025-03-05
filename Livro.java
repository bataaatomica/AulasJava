public class Livro {
    String titulo;
    String autor;

    void detalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "O Guia do mochileiro das galáxias";
        livro1.autor = "Douglas Adams";
        livro1.detalhes();
    }
}
