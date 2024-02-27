import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Day2Part2 {
    public static void main(String[] args) {
        int somador = 0;
        try {
            Scanner leitor = new Scanner(new FileReader("input.txt"));
            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] quebrainicial = linha.split(":");
                String[] quebrasecundaria = quebrainicial[1].split(";");
                int maiorvermelho = 0;
                int maiorverde = 0;
                int maiorazul = 0;
                int[] multiplicavalores = new int[3];
                for(int i=0;i<quebrasecundaria.length;i++){
                    String[] quebravirgula = quebrasecundaria[i].split(","); 
                    for(int j=0;j<quebravirgula.length;j++){
                    String[] quebrafinal=quebravirgula[j].split(" ");
                    String color = quebrafinal[2];
                    if(multiplicavalores[0]==0){
                        if(color.equalsIgnoreCase("red")){
                        maiorvermelho = Integer.valueOf(quebrafinal[1]);
                        }
                    }
                    if(color.equalsIgnoreCase("red")){
                            if(maiorvermelho < Integer.valueOf(quebrafinal[1])){
                            maiorvermelho = Integer.valueOf(quebrafinal[1]);
                            }
                        }
                    if(multiplicavalores[1]==0){
                        if(color.equalsIgnoreCase("green")){
                        maiorverde = Integer.valueOf(quebrafinal[1]);
                        }
                    }
                    if(color.equalsIgnoreCase("green")){
                        if(maiorverde < Integer.valueOf(quebrafinal[1])){
                        maiorverde = Integer.valueOf(quebrafinal[1]);
                        }
                    }
                    if(multiplicavalores[2]==0){
                        if(color.equalsIgnoreCase("blue")){
                        maiorazul = Integer.valueOf(quebrafinal[1]);
                        }
                    }
                    if(color.equalsIgnoreCase("blue")){
                        if(maiorazul < Integer.valueOf(quebrafinal[1])){
                        maiorazul = Integer.valueOf(quebrafinal[1]);
                        }
                    }
                    multiplicavalores[0] = maiorvermelho;
                    multiplicavalores[1] = maiorverde;
                    multiplicavalores[2] = maiorazul;                         
                    }
               }
               somador += multiplicavalores[0]*multiplicavalores[1]*multiplicavalores[2]; 
            }              

            leitor.close();
            System.out.println(somador);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
