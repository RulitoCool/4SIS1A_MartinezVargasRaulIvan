import java.util.Scanner;

public class mascadenas {
    Scanner entrada = new Scanner(System.in);
    public void masFunciones(){
        String s1 = new String("hola porque hay que pagar tanto por un gansito T_T ");
        String s2 = "harry popote tiene un ajedrez ";
        String s3 = "Feliz no cumpleaños";
        String s4 = "Feliz no cumpleaños";

        String salida = "cadenas: " + s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" ;

        if(s1=="hola porque hay que pagar tanto por un gansito"){
            salida += "si es igaul a la cadena";
            System.out.println(salida);
        }else{
            salida += "no es la misma cadena";
            System.out.println(salida);
        }
        if(s3.equalsIgnoreCase(s4)){
            salida += "si es igual a la cadena \n ";
            System.out.println(salida);
        }else{
            salida += "no es la misma cadena \n";
            System.out.println();
        }

        salida +="\n si compareto (s2):"+ s1.compareTo(s2)+
        "\n si compareto (s1):"+ s1.compareTo(s1)+
        "\n si compareto (s4):"+ s1.compareTo(s4)+
        "\n si compareto (s3):"+ s1.compareTo(s3);
        System.out.println(salida);


        String s5 = "patito patito color cafe";
        int pos = 0;
        pos = s5.indexOf('t', pos+1);
        System.out.println("la segunda aparcion de la t es:");


        

    }
    
}
