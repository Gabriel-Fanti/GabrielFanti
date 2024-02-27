import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Day2 {
    public static void main(String[] args) {
        int somador = 0;
        try {
            Scanner leitor = new Scanner(new FileReader("input.txt"));
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] quebrainicial = linha.split(":");
                String[] quebrasecundaria = quebrainicial[1].split(";");
                boolean shouldAdd = true;
                for(int i=0;i<quebrasecundaria.length;i++){
                    String[] quebravirgula = quebrasecundaria[i].split(",");
                    for(int j=0;j<quebravirgula.length;j++){
                    String[] quebrafinal=quebravirgula[j].split(" ");
                        String color = quebrafinal[2];
                        if ((color.equalsIgnoreCase("blue") && Integer.valueOf((quebrafinal[1])) > 14) ||
                            (color.equalsIgnoreCase("green") && Integer.valueOf((quebrafinal[1])) > 13) ||
                            (color.equalsIgnoreCase("red") && Integer.valueOf((quebrafinal[1])) > 12)) {
                                shouldAdd = false;
                                break;
                        }
                    }
               } 
               if(shouldAdd){
                int numerofinal = Integer.valueOf(quebrainicial[0].split(" ")[1]);
                somador += numerofinal;
            }              
            }
            
            leitor.close();
            System.out.println(somador);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
