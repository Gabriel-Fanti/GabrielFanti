public class ContadorDivisores {

    public static int contarDivisores(int numero) {
        int contagem = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contagem++;
            }
        }
        
        return contagem;
    }

    public static void main(String[] args) {
        int numero = 12;
        int quantidadeDeDivisores = contarDivisores(numero);
        System.out.println("O número " + numero + " tem " + quantidadeDeDivisores + " divisores.");
    }
}
