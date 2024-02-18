import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1{
    public static void main(String[]args){
        int somador = 0;
        try {
            File arquivo = new File("input.txt");
            Scanner leitorArquivo = new Scanner(arquivo);
            while (leitorArquivo.hasNextLine()) {
                String data = leitorArquivo.nextLine();
                String digito = data.replaceAll("[^0-9]","");
                if(digito.length()==2){
                    somador += Integer.valueOf(digito);
                }else if(digito.length()==1){
                    somador += Integer.valueOf(digito)*11;
                }else{
                    String digitofinal=digito.substring(0,1)+digito.substring(digito.length()-1,digito.length());
                    somador += Integer.valueOf(digitofinal);
                }
            }

            leitorArquivo.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println(somador);
    }
}