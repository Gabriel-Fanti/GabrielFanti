import java.util.*;
public class If_Else
{
   public static void main(String [] Args){
   Scanner in=new Scanner(System.in);
   System.out.println("\f");
   System.out.println("Digite o valor de a: ");
   double a=in.nextDouble();
   System.out.println("Digite o valor de b: ");
   double b=in.nextDouble();
   System.out.println("Digite o valor de c: ");
   double c=in.nextDouble(); //a 20 b 15 c 30   
   if(a>b) {
       if(a>c){
           System.out.println("A e o maior");
       } else {
           System.out.println("C e o maior");
       }
   } else if(b>c) {
       if(b>a){
           System.out.println("B e o maior");
       } else {
           System.out.println("A e o maior");
       }
   } else if(c>a){
       System.out.println("C e o maior");
   } else{
       System.out.println("Os valores sao iguais");
   }
}
}

