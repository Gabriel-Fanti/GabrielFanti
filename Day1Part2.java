import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1Part2{
    public static void main(String[]args){
        int somador = 0;
        try {
            File arquivo = new File("input.txt");
            Scanner leitorArquivo = new Scanner(arquivo);
            while (leitorArquivo.hasNextLine()) {
                String data = leitorArquivo.nextLine();
                data = transformastring(data);
                data = data.replaceAll("[^0-9]","");
                
                if(data.length()==2){
                    somador += Integer.valueOf(data);    
                }else if(data.length()==1){
                    somador += Integer.valueOf(data)*11;
                }else{
                    String digitofinal=data.substring(0,1)+data.substring(data.length()-1,data.length());
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
    public static String transformastring(String data){
        String retorno = data;

        if(data.contains("one")) retorno = retorno.replaceAll("one", "one1one");
        if(data.contains("two")) retorno = retorno.replaceAll("two", "two2two");
        if(data.contains("three")) retorno = retorno.replaceAll("three", "three3three");
        if(data.contains("four")) retorno = retorno.replaceAll("four", "four4four");
        if(data.contains("five")) retorno = retorno.replaceAll("five", "five5five");
        if(data.contains("six")) retorno = retorno.replaceAll("six", "six6six");
        if(data.contains("seven")) retorno = retorno.replaceAll("seven", "seven7seven");
        if(data.contains("eight")) retorno = retorno.replaceAll("eight", "eight8eight");
        if(data.contains("nine")) retorno = retorno.replaceAll("nine", "nine9nine");
        return retorno;
    }
}