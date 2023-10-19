/**
 * Essa classe tem como objetivo criptografar frases. Seu princípio é realizar a troca com o
 * método "switch" de cada letra com o uso do "charAt()". Cada "char" recebeu um outro caracter
 * respectivo e totalmente aleatório, promovendo maior segurança na mensagem.
 * 
 * @author (Gabriel Fanti e Vitor Morari) 
 * @version (outubro de 2023)
 */

import java.util.*;//para importar o scanner do java e seus outros utilitarios

public class Criptografia
{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);//Criado um objeto para o teclado para o usuário poder digitar sua frase.
        Scanner in2=new Scanner(System.in);//Foi necessario criar outro objeto do tipo teclado, pois estava dando conflito entre String seguido de Int.
        System.out.println("\fBem vindo ao sistema de Criptografia!");//utilizado para limpar a tela e dar boas vindas ao usuario.
        int valor = 0;//utilizado para um "do..while" depois
        System.out.println("Para que a sua criptografia ocorra bem, utiliza somente algarismos, letras sem acento e expressoes numericas.");//devido a grande variedade de caracteres na classe char, decidimos delimitar um pouco eles
        System.out.println("Digite a sua primeira frase a ser criptografa:");//solicita o usuario a primeira frase
        String frase1=in.nextLine().toLowerCase();//recebe a String da primeira frase, o .toLowerCase() transforma toda a frase em minuscula, para possibiltar o uso correto do metodo que esta escrito todo em caixa baixa
        System.out.println("Digite a sua segunda frase a ser criptografa:");//solicita o usuario a segunda frase
        String frase2=in.nextLine().toLowerCase();//recebe a String da segunda frase, o .toLowerCase() transforma toda a frase em minuscula, para possibiltar o uso correto do metodo que esta escrito todo em caixa baixa
        System.out.println("Digite a sua terceira frase a ser criptografa:");//solicita o usuario a terceira frase
        String frase3=in.nextLine().toLowerCase();//recebe a String da terceira frase, o .toLowerCase() transforma toda a frase em minuscula, para possibiltar o uso correto do metodo que esta escrito todo em caixa baixa
        
        System.out.println("Sua frase final 1 ficou: ");
        for(int i=0;i<frase1.length();i++){//com o contador começando em 0, vai de indice em indice da String   
            criptografia(frase1,i);
        }
        
        System.out.println("\nSua frase final 2 ficou: ");
        for(int i=0;i<frase2.length();i++){//com o contador começando em 0, vai de indice em indice da String.    
            criptografia(frase2,i);
        }

        System.out.println("\nSua frase final 3 ficou: ");
        for(int i=0;i<frase3.length();i++){//com o contador começando em 0, vai de indice em indice da String.    
            criptografia(frase3,i);
        }
        
        System.out.println("\nVoce entendeu a criptografia? Se sim digite 1, se nao digite 0 e tente outra frase.");//criado para que o usuario consiga entender melhor a criptografia.
        valor=in2.nextInt();//armazena o valor para validar o do..while.
        System.out.println("\f");
        
        do{
            System.out.println("Digite sua proxima frase:");
            String frase4=in.nextLine().toLowerCase();        
            System.out.println("\nSua nova frase ficou: ");
            for(int i=0;i<frase4.length();i++){//com o contador começando em 0, vai de indice em indice da String    
                criptografia(frase4,i);
            }
            System.out.println("\n\nVocẽ entendeu a criptografia? Se sim digite 1 e responda as perguntas, se nao digite 0 e tente outra frase.");
            valor=in2.nextInt();    
        }while(valor==0);
        int resposta=0;
        do{//esse do..while possibilita o teste da pergunta de multipla escolha
            System.out.println("Como ficaria a palavra mineral criptografada?");
            System.out.println("1.v2ekow`");
            System.out.println("2.v8zpkwj");
            System.out.println("3.v10m2nb");
            System.out.println("4.a2plqsn");
            System.out.println("5.e8mtnwb");
            resposta=in.nextInt();
                
            if(resposta!=2){//quando a reposta é diferente de 2, a correta, é realizada o a pergunta novamente
                System.out.println("\fVoce errou, tente novamente.");
            } else {
                System.out.println("\fVoce acertou. Parabens, proxima pergunta!");
            }    
        }while(resposta!=2);
        
        do{//esse do..while possibilita o teste da pergunta de multipla escolha
            System.out.println("Como ficaria a palavra quadriculado criptografada?");
            System.out.println("1.!lw-k8qljw-y");
            System.out.println("2.@mewk34lc910");
            System.out.println("3.!mw2l1pdkem2");
            System.out.println("4.@mskql17bzvw");
            System.out.println("5.@lem2kqpsk{ª");
            resposta=in.nextInt();
                
            if(resposta!=1){
                System.out.println("\fVoce errou, tente novamente.");
            } else {
                System.out.println("\fVoce acertou. Parabens!!");
            }    
        }while(resposta!=1);
        
        System.out.println("Parabens por ter concluido a criptografia! Volte sempre!");//despedida do usuario
    
    }
    private static void criptografia(String frase, int i){//metodo para realizar a criptografia.
        switch(frase.charAt(i)){//ocorrerá o teste de todos os caracteres da frase, se "true" ocorrera a troca pela letra criptografada
            case 'a':
                System.out.print("w");
                break;
            case 'b':
                System.out.print("i");
                break;
            case 'c':
                System.out.print("q");
                break;
            case 'd':
                System.out.print("-");
                break;
            case 'e':
                System.out.print("p");
                break;
            case 'f':
                System.out.print("7");
                break;
            case 'g':
                System.out.print("0");
                break;
            case 'h':
                System.out.print("3");
                break;
            case 'i':
                System.out.print("8");
                break;
            case 'j':
                System.out.print("l");
                break;
            case 'k':
                System.out.print("r");
                break;
            case 'l':
                System.out.print("j");
                break;
            case 'm':
                System.out.print("v");
                break;
            case 'n':
                System.out.print("z");
                break;
            case 'o':
                System.out.print("y");
                break;
            case 'p':
                System.out.print(",");
                break;
            case 'q':
                System.out.print("!");
                break;
            case 'r':
                System.out.print("k");
                break;
            case 's':
                System.out.print("1");
                break;
            case 't':
                System.out.print("d");
                break;
            case 'u':
                System.out.print("l");
                break;
            case 'v':
                System.out.print("f");
                break;
            case 'w':
                System.out.print("+");
                break;
            case 'x':
                System.out.print("?");
                break;
            case 'y':
                System.out.print("×");
                break;
            case 'z':
                System.out.print("=");
                break;
            case '0':
                System.out.print("x");
                break;
            case '1':
                System.out.print("e");
                break;
            case '2' :
                System.out.print("h");
                break;
            case '3':
                System.out.print("n");
                break;
            case '4':
                System.out.print("c");
                break;
            case '5':
                System.out.print("g");
                break;
            case '6':
                System.out.print("2");
                break;
            case '7':
                System.out.print("m");
                break;
            case '8':
                System.out.print("*");
                break;
            case '9':
                System.out.print("t");
                break;
            case '?':
                System.out.print("5");
                break;
            case '!':
                System.out.print("9");
                break;
            case '.':
                System.out.print("o");
                break;
            case ',':
                System.out.print("4");
                break;
            case '*':
                System.out.print("u");
                break;
            case '+':
                System.out.print("6");
                break;
            case '-':
                System.out.print("°");
                break;
            case '×':
                System.out.print("'");
                break;
            case '=':
                System.out.print("s");
                break;
            case '/':
                System.out.print(")");
                break;
            case '_':
                System.out.print("&");
                break;
            case '@':
                System.out.print("#");
                break;
            case '#':
                System.out.print("/");
                break;
            case '$':
                System.out.print("^");
                break;
            case '&':
                System.out.print("$");
                break;
            case '^':
                System.out.print("a");
                break;
            case ' ':
                System.out.print("¬");
                break;
            default:
                System.out.print("(O caractere nessa posicao nao pode ser usado.)");
                } 
        } 
}
    