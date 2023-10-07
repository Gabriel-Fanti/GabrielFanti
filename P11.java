import java.util.*;

public class P11{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    System.out.println("\fQual o horario de início que o cliente alugou a quadra?");
    int horai=in.nextInt();
    int horaf=0;
    int atraso=15;
    do{
    System.out.println("Qual o horário final que o cliente alugou a quadra?");
    horaf=in.nextInt();
    }while(horaf<=horai);
    System.out.println("O cliente demorou para sair da quadra? Se sim, pressione 1, se não, pressione outro número.");
    atraso=in.nextInt();
        switch(atraso){
        case 1:
            {System.out.println("O valor total ficou "+multa(valorfinal(horaf,horai))+" reais");}
        break;
        default:
            {System.out.println("O valor total ficou "+valorfinal(horaf,horai)+" reais.");}
                  }
        }
    public static int valorfinal(int horaf,int horai){
    return(horaf-horai)*50; 
    }

    public static double multa(double valorfinal){
    return (valorfinal*1.1);
    }
}