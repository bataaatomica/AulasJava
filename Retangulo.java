public class Retangulo {
    double largura;
    double altura;

    double calcularArea() {
        return largura * altura;
    }

    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        ret.largura = 16;
        ret.altura = 33;
        System.out.println("Área do retângulo: " + ret.calcularArea());
    }
}
