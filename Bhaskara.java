import java.util.*;
public class Bhaskara
{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in); 
        System.out.println("\fDigite o valor do a:");
        double a = in.nextDouble();
        System.out.println("Digite o valor do b:");
        double b = in.nextDouble();
        System.out.println("Digite o valor do c:");
        double c = in.nextDouble();
        double delta= (b*b)-(4*a*c);
        
        if(a==0){
            if(b==0){
                System.out.println("É uma reta");
            }else{
                System.out.println("É uma constante");
            }
        } 
        if(delta<0){
            System.out.println("Nao existe raiz real");
        }
        if(delta==0){
            System.out.println("Existe apenas uma raiz, sendo ela: "+(-b/(2*a)));
        }
        if(delta>0)
        {
            double x=((-b+Math.sqrt(delta))/(2*a));
            double y=((-b-Math.sqrt(delta))/(2*a));
            {System.out.println("A raiz 1 é: "+x);}
            {System.out.println("A raiz 2 é: "+y);}
        }
    }
}
    