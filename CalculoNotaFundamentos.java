import java.util.*;

public class CalculoNotaFundamentos
{
    public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    double T1=0;
    double T2=0;
    double T3=0;
    double P1=0;
    double P2=0;
    double TF=0;
    System.out.println("\fQuantas faltas voce possui na disciplina de Fundamentos de Programação?");
    double faltas=in.nextDouble();
    if(faltas>15){System.out.println("Voce está reprovado por falta.");
    int a=0;
    do{
    System.out.println("Se mesmo assim quiser ver usa nota, digite 1. Caso contrário, apenas encerre o programa.");
    a=in.nextInt();
    }while(a!=1);
    }
    System.out.println("Lembre-se de digitar valores de 0 a 10 para suas notas");
    do{
    System.out.println("Digite sua nota do Trabalho 1:");
    T1=in.nextDouble();
    }while(T1>10 || T1<0);
    do{
    System.out.println("Digite sua nota do Trabalho 2:");
    T2=in.nextDouble();
    }while(T2>10 || T2<0);
    do{
    System.out.println("Digite sua nota do Trabalho 3:");
    T3=in.nextDouble();
    }while(T3>10 || T3<0);
    System.out.println("Sua média 'E' dos trabalhos ficou: "+MediaT(T1,T2,T3));
    do{
    System.out.println("Digite sua nota da Prova 1:");
    P1=in.nextDouble();
    }while(P1>10 || P1<0);
    do{
    System.out.println("Digite sua nota da Prova 2:");
    P2=in.nextDouble();
    }while(P2>10 || P2<0);
    System.out.println("Sua média das provas ficou: "+MediaP(P1,P2));
    do{
    System.out.println("Digite sua nota do Trabalho Final:");
    TF=in.nextDouble();
    }while(TF>10 || TF<0);
    double Notaf=Notaf(P1,P2,MediaT(T1,T2,T3),TF);
    if(Notaf>=7){
        System.out.println("Sua nota final é :"+Notaf(P1,P2,MediaT(T1,T2,T3),TF)+" e voce está aprovado");
        }
    if(Notaf<7 && Notaf>=4){
        System.out.println("Sua nota final é :"+Notaf(P1,P2,MediaT(T1,T2,T3),TF)+" e voce deve realizar a prova G2");
        }
    if(Notaf<4 && Notaf>=0){
        System.out.println("Sua nota final é :"+Notaf(P1,P2,MediaT(T1,T2,T3),TF)+" e voce está reprovado.");
        }
    }
    
    public static double MediaT(double T1,double T2,double T3){
        return(T1+T2+T3)/3;
    }
    
    public static double MediaP(double P1,double P2){
        return(P1+P2*2)/3;
    }
    
    public static double Notaf(double P1,double P2,double MediaT, double TF){
        return(P1+2*P2+MediaT+2*TF)/6;
    }
}