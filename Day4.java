import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Day4 {
    public static void main(String[] args) {
        int somador = 0;
        try {
            Scanner leitor = new Scanner(new FileReader("input.txt"));
            while (leitor.hasNextLine()) {
                int somadorfinal = 0;
                String linha = leitor.nextLine();
                System.out.println(linha);
                String[] quebrainicial = linha.split(":");
                System.out.println(Arrays.toString(quebrainicial));
                String[] quebrasecundaria = quebrainicial[1].split("\\|");
                System.out.println(Arrays.toString(quebrasecundaria));
                String[] meusnumeros = quebrasecundaria[0].split("\\s+");
                String[] sorteados = quebrasecundaria[1].split("\\s+");
                System.out.println(Arrays.toString(meusnumeros));
                System.out.println("ACABOU MEUS NUMEROS");
                System.out.println(Arrays.toString(sorteados));

                for (int i = 1; i < meusnumeros.length; i++) {
                    for (int j = 1; j < sorteados.length; j++) {
                        if (meusnumeros[i].equals(sorteados[j])) {
                            somadorfinal++;
                        }
                    }
                }
                if (somadorfinal > 0) {
                    somador += Math.pow(2, somadorfinal - 1);
                }
            }

            leitor.close();
            System.out.println(somador);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}