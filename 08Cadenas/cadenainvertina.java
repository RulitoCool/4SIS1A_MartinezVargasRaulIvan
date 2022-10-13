import java.util.Scanner;

public class cadenainvertina {
    Scanner entrada = new Scanner(System.in);
    public void cadenainvertidapalabras(){
        String cadena ="";
        System.out.println("ingresa una oracion que quiera invertir");
        cadena = entrada.nextLine();
        String invertida = "";
        for( int i = cadena.length()-1; i >=0; i++){
            char car =cadena.charAt(i);
            invertida += car;
        }
        System.out.println("cadena invertida es:" + invertida);
    }

    
}
