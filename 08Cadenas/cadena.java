import java.util.Scanner;

public class cadena {
Scanner entrada = new Scanner(System.in);
public void cadenas(){
    String s1 = " habia una vez un gatito que hacia miau miau que se llamaba tito el gatito mas bonito";
    System.out.println(" el tamaño de la cadena es: " + s1.length());
    System.out.println("la cadena inicia con v o f con hola...." + s1.startsWith( "hola"));
    System.out.println(" la cadena termina con gato v o f" + s1.endsWith("gato"));


    System.out.println("ingrese una palabra:");
    String s2 = entrada.nextLine();
    System.out.println("palabra es:" + s2);

    System.out.println("parte de una subcadena de s1" + s1.indexOf("tito"));

    System.out.println("primera parte:" + s1.substring(7, 20));
    System.out.println("primera parte:" + s1.substring(12));
    



}

}
