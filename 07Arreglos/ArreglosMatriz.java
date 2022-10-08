import java.util.*;
public class ArreglosMatriz {
    public static void main(String[]args){
    int arreglo[] = new int[10];
    int valor;
    Scanner entrada = new Scanner(System.in);
    for(int j = 0; j < arreglo.length; j++){
        System.out.println("ingresa el valor de la posicion del arreglo");
        arreglo[j] = entrada.nextInt();
    }
    for(int i = 0; i < arreglo.length; i++){
        System.out.println("La magia: " + arreglo[i] );
        
    }
}
}
