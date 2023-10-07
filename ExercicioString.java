import java.util.*;

public class ExercicioString{
    public static void main(String[]args){
        System.out.print("\f");
        String teste ="sexta";
        int tamanho=teste.length();
        for(int posicao=0;posicao<tamanho;posicao++)
            {for(int letra=0;letra<=posicao;letra++)
            {System.out.print(teste.charAt(letra));}
        System.out.println();
    }
       for(int posicao=tamanho-1;posicao>=0;posicao--)
            {for(int letra=0;letra<=posicao;letra++)
            {System.out.print(teste.charAt(letra));}
        System.out.println();
    }
    }
}


/* import java.util.*;

public class ExercicioString{
    public static void main(String[]args){
        System.out.print("\f");
        String teste ="sexta";
        int tamanho=teste.length();
        for(int posicao=0;posicao<tamanho;posicao++)
        {for(int letra=0;letra<=posicao;letra++)
        {System.out.print(teste.charAt(letra));}
        System.out.println();
        }
    }
}
*/