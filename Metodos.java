import java.util.Scanner;

public class Metodos {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("\fDigite um numero natural:");
        int numero = in.nextInt();
        int quantidadeDeDivisores = contarDivisores(numero);
        if(quantidadeDeDivisores==2){System.out.println("O " + numero + " é um numero primo e possui somente 2 divisores");}
            else{System.out.println("O " + numero + " possui " + quantidadeDeDivisores + " divisores.");}
    }
    public static int contarDivisores(int numero) {
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
        }
        return cont;
    }
}
