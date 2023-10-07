import java.util.*;
public class A1Recuperação
{
  public static void main(String[]args){
    Scanner in=new Scanner(System.in);
    
    System.out.println("\fDigite as medidas solicitas a seguir. \nMedida do lado do quadrado da construção:");//medida 4
    double ladoqua=in.nextDouble();
    System.out.println("Digite a medida da base do triângulo da construção:");//medida 6
    double basetri=in.nextDouble();
    System.out.println("Digite a medida da altura do triângulo da construção:");//medida 4
    double alturatri=in.nextDouble();
    System.out.println("Digite a medida de um lado do retângulo da construção:");//medida 3
    double lado1ret=in.nextDouble();
    System.out.println("Digite a medida do outro lado do retângulo da construção:");//medida 6
    double lado2ret=in.nextDouble();
    System.out.println("Digite a medida do raio do círculo da construção:");//medida 2
    double raiocir=in.nextDouble();
    System.out.println("Digite a medida da altura do cilindro");//medida 8
    double alturacil=in.nextDouble();
    System.out.println("Digite a medida de um lado do terreno:");//medida 30
    double ladoterreno1=in.nextDouble();
    System.out.println("Digite a medida do outro lado do terreno:");//medida 40 
    double ladoterreno2=in.nextDouble();
    
    double terreno=(areaterreno(ladoterreno1,ladoterreno2)-(areaquadrado(ladoqua)+areatriangulo(basetri,alturatri)+areacirculo(raiocir)+arearetangulo(lado1ret,lado2ret)));//colocar o que resta do terreno
    
    double marcax = (terreno/0.8)*48.50;
    double marcay = (terreno/0.8)*85.10;
    
    System.out.println("Sera gasto "+marcax+" reais utilizando a marca x");//resposta:69199.4
    System.out.println("Sera gasto "+marcay+" reais utilizando a marca y");//resposta:121420.0
    System.out.println("O orçamento y é "+porcentagemorcamento(marcax,marcay)+" vezes mais caro que o x");//resposta:1.75
    System.out.println("Será necessario pintar "+superficiecilindro(raiocir,alturacil)+" m² do Cilíndro");//resposta:113.097
    double superficiecilindro=superficiecilindro(raiocir,alturacil);
    System.out.println("Quantos m² uma lata de tinta consegue pintar?");//medida 10
    double lataspintar=in.nextDouble();
    System.out.println("Será necessária "+latasdetinta(lataspintar,superficiecilindro)+" para pintar o cilindro");//resposta:0.088
    }
    
    public static double areaquadrado(double ladoqua)
    {
        return ladoqua*ladoqua;
    }
    
    public static double areatriangulo(double base,double altura)
    {
        return (base*altura)/2;
    }
    
    public static double areacirculo(double raiocir)
    {
        return Math.PI*raiocir*raiocir;
    }
    
    public static double arearetangulo(double lado1ret,double lado2ret)
    {
        return lado1ret*lado2ret;
    }
    
    public static double areaterreno(double ladoterreno1, double ladoterreno2)
    {
        return ladoterreno1*ladoterreno2;
    }
    
    public static double porcentagemorcamento(double marcax,double marcay)
    {
        return marcay/marcax;
    }

    public static double superficiecilindro(double raio,double altura)
    {
        return(2*Math.PI*Math.pow(raio,2)+2*Math.PI*raio*altura)-Math.PI*raio*raio;
    }
    
    public static double latasdetinta(double lataspintar,double superficiecilindro)
    {
        return(lataspintar/superficiecilindro);
    }
    
}