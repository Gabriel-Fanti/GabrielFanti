import java.util.Scanner;
public class SignosDataNascimento
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("\fInforme o seu mês de nascimento: ");
        int mes=in.nextInt();
        System.out.println("Informe o seu dia de nascimento: ");
        int dia=in.nextInt();
        System.out.println("Informe o mes de hoje: ");
        int mesh=in.nextInt();
        System.out.println("Informe o dia de hoje: ");
        int diah=in.nextInt();
        if(mes>mesh){
            System.out.println("Voce ainda nao fez aniversario");  
        }
        if(mes<mesh){System.out.println("Voce ja fez aniversario");}
        if(mes==mesh)
        {
            if(diah>dia){System.out.println("Voce ja fez aniversario");}
            if(diah<dia){System.out.println("Voce ainda nao fez aniversario");}
            if(diah==dia){System.out.println("Parabens, voce esta de aniversario hoje");}
        }
        
        if(mes==1)//janeiro
        {
            if(dia<=20){System.out.println("Seu signo e capricórnio");}
            if(dia>20){System.out.println("Seu signo e aquario");}
        }
        if(mes==2)//fevereiro
        {
            if(dia<=19){System.out.println("Seu signo e aquario");}
            if(dia>19){System.out.println("Seu signo e peixes");}
        }
        if(mes==3)//março
        {
            if(dia<=20){System.out.println("Seu signo e peixes");}
            if(dia>20){System.out.println("Seu signo e aries");}
        }
        if(mes==4)//abril
        {
            if(dia<=20){System.out.println("Seu signo e aries");}
            if(dia>20){System.out.println("Seu signo e touro");}
        }
        if(mes==5)//maio
        {
            if(dia<=20){System.out.println("Seu signo e touro");}
            if(dia>20){System.out.println("Seu signo e gemeos");}
        }
        if(mes==6)//junho
        {
            if(dia<=20){System.out.println("Seu signo e gemeos");}
            if(dia>20){System.out.println("Seu signo e cancer");}
        }
        if(mes==7)//julho
        {
            if(dia<=21){System.out.println("Seu signo e cancer");}
            if(dia>21){System.out.println("Seu signo e leao");}
        }
        if(mes==8)//agosto
        {
            if(dia<=22){System.out.println("Seu signo e leao");}
            if(dia>22){System.out.println("Seu signo e virgem");}
        }
        if(mes==9)//setembro
        {
            if(dia<=21){System.out.println("Seu signo e virgem");}
            if(dia>21){System.out.println("Seu signo e libra");}
        }
        if(mes==10)//outubro
        {
            if(dia<=22){System.out.println("Seu signo e libra");}
            if(dia>22){System.out.println("Seu signo e escorpiao");}
        }
        if(mes==11)//novembro
        {
            if(dia<=21){System.out.println("Seu signo e escorpiao");}
            if(dia>21){System.out.println("Seu signo e sagitario");}
        }
        if(mes==12)//dezembro
        {
            if(dia<=21){System.out.println("Seu signo e sagitario");}
            if(dia>21){System.out.println("Seu signo e capricornio");}
        }
    }
}


    
