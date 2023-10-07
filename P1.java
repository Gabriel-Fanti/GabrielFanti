import java.util.*;

public class P1{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    System.out.println("\fQual o horario de início que o cliente alugou a quadra?");
    int horai=in.nextInt();
    System.out.println("Qual o horário final que o cliente alugou a quadra?");
    int horaf=in.nextInt();
    System.out.println("Qual horario o cliente saiu da quadra?");
    double horasaida=in.nextDouble();
    if(horasaida<=horaf){System.out.println("O valor total ficou "+valorfinal(horaf,horai)+" reais.");
        } else{System.out.println("O valor total ficou "+multa(valorfinal(horaf,horai))+" reais");}
    }
    
    public static int valorfinal(int horaf,int horai){
    return(horaf-horai)*50; 
    }

    public static double multa(double valorfinal){
    return (valorfinal*1.1);
    }
}