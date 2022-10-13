import java.util.Scanner;

public class cadena {
    Scanner entrada = new Scanner(System.in);

    public void cadenas() {
        String s1 = " habia una vez un gatito que hacia miau miau que se llamaba tito el gatito mas bonito";
        System.out.println(" el tamaño de la cadena es: " + s1.length());
        System.out.println("la cadena inicia con v o f con hola...." + s1.startsWith("hola"));
        System.out.println(" la cadena termina con gato v o f" + s1.endsWith("gato"));

        System.out.println("ingrese una palabra:");
        String s2 = entrada.nextLine();
        System.out.println("palabra es:" + s2);

        System.out.println("parte de una subcadena de s1" + s1.indexOf("tito"));

        System.out.println("primera parte:" + s1.substring(7, 20));
        System.out.println("primera parte:" + s1.substring(12));

        // convertir una variable de la cadena//

        int valor = 24;
        String s3 = String.valueOf(valor);
        System.out.println("el valor es de:" + s3 + "como cadena");

        String s4 = "20";
        int numero = Integer.parseInt(s4);

        System.out.println("El valor:" + numero + "ahora es un numero");

        String s5 = "20.89";
        double numero1 = Double.parseDouble(s5);
        System.out.println(" El valor de" + numero + "ahora es un decimal");
        numero1 = numero1 + numero;
        System.out.println("El resultado es: " + numero1); 

        //convertir un entero a una cadena

        Integer x=5;
        System.out.println("El valor de:" + x.toString() + "ahora es una cadena");

        System.out.println("el valor de: " + Integer.toString(12) + "ahora es una cadena");
        

    }

}
