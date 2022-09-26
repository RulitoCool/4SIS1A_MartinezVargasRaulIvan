import java.util.Scanner;

class EstructuraDatos {

    public static void main(String[] args){
        try (//objetos
        Scanner entrada = new Scanner(System.in)) {
            //aqui van a ir las variables
            int opcion, numbinario, edad, numf, a, b, c, v;
            char letra,art;
            String binario = "";
            double cen;
            float num = 0, cos = 0, can = 0, total = 0, acum = 0, ss = 0, toc = 0, vala, valb, res = 0;
            int ne = 0, po = 0, nu = 0, verga = 0, fac = 1;

            do{
                System.out.println("elija la opcion deseada: ");
                System.out.println("1.- Cinemex");
                System.out.println("2.- Convertir numero decimal a binario ");
                System.out.println("3.- Conversiones de temperatura ");
                System.out.println("4.- Numeros Positivos y Negativos ");
                System.out.println("5.- Tienda ");
                System.out.println("6.- Area y Perimetro ");
                System.out.println("7.- Tabla ");
                System.out.println("8.- Factorial ");
                System.out.println("9.- Dibujos de codigo ");
                System.out.println("10.- Figura Hueca ");
                System.out.println("11.- Patrones de Codigo ");
                System.out.println("12.- Diamante ");
                System.out.println("13.- Calculadora ");
                System.out.println("14.- Salir ");

                //obtener la respuesta del usuario
                opcion = entrada.nextInt();

                //menu
                switch(opcion){
                    case 1:
                
                        System.out.println("bienvenido a cinemex");
                        System.out.println("ingrese la edad del cliente");
                        System.out.println("*****************************");
                        edad = entrada.nextInt();
                        if(edad > 65){
                        System.out.println("se le aplica un descuento del 40%");
                        }else{
                            System.out.println("no se aplica ningun descuento");
                        
                        }if(edad <= 21){
                            System.out.println("¿sus padres son socios?");
                            System.out.println("1 para si / 2 para no");
                            verga = entrada.nextInt();
                        }if(verga == 2){
                            System.out.println("¿su descuento es del 25%");
                         }if(verga == 1){
                        System.out.println("se le aplica un descuento del 45%");
                        }
                    
                    break;
                    case 2:
                        //convertir numero a binario
                        System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                        numbinario = entrada.nextInt();

                        //tenemos que saber si es positivo
                        if(numbinario > 0){
                            //realizar el algotimo con el mod 2 
                            while(numbinario > 0){
                                if(numbinario%2 == 0){
                                    binario ="0" + binario;
                                }else{
                                    binario ="1" + binario;
                                }
                                numbinario = (int)numbinario/2;
                            }
                        }else if(numbinario == 0){
                            binario = "0";
                        }else{
                            binario = "No se pudo convertir el numero, ingrese solo positivos";
                        }
                        System.out.println("El numero convertido a binario es: " + binario);
                        break;
                    case 3:
                        System.out.println("ingrese la occion de temperatura");
                        System.out.println("1.-fahrenheit");
                        System.out.println("2.-centigrados");
                        System.out.println("3.-kelvine");
                        System.out.println("4.-rankine");
                        opcion = entrada.nextInt();
                        switch(opcion){
                            case 1:
                            System.out.println("fahrenheit");
                            System.out.println("ingrese los grados a convertir");
                            cen = entrada.nextDouble();
                            cen = ((cen*9/5)+32);
                            System.out.println("los grados convertidos a fahrenheit son: " + cen);
                            break;
                            case 2:
                            System.out.println("centrigados");
                            System.out.println("ingrese los grados a convertir");
                            cen = entrada.nextDouble();
                            cen = (cen-32)*5/9;
                            System.out.println("los grados convertidos a centrigados son: " + cen);
                            break;
                            case 3:
                            System.out.println("kelvine");
                            System.out.println("ingrese los grados a convertir");
                            cen = entrada.nextDouble();
                            cen = cen+273.15;
                            System.out.println("los grados convertidos a centrigados son: " + cen);
                            break;
                            case 4:
                            System.out.println("rankine");
                            System.out.println("ingrese los grados a convertir");
                            cen = entrada.nextDouble();
                            cen = cen*9/5+491.67;
                            System.out.println("los grados convertidos a centrigados son: " + cen);
                            break;
                        }
                        break;
                    case 4:
                    System.out.println("numeros positivos o negativos");
                            for(int n = 1; n<=10; n++){
                                System.out.println("dame un numero");
                                num = entrada.nextFloat();
                            
                            if(num > 0){
                                po++;
                        }else if(num == 0){
                            nu++;
                        }if(num < 0){
                            ne++;
                            
                        }
                    }
                    System.out.println();
                    System.out.println("numeros positivos: " + po);
                    System.out.println("numeros neutros neutro: " + nu);
                    System.out.println("numeros negativo: " + ne);


                        break;    
                    case 5:
                    System.out.println("Tienda la cuca");
                    do{
                                System.out.println("descripcion de los articulos");
                                art = entrada.next().charAt(0);
                                System.out.println("costo del articulo");
                                cos = entrada.nextFloat();
                                System.out.println("cantidad de los articulos");
                                can = entrada.nextFloat(); 
                                acum = cos*can;
                                ss = ss+acum;
                                toc = toc+can;

                                System.out.println("desea seguir comprando mas articulos 1 si/2 no");
                                num = entrada.nextFloat();
                
                    }while(num == 1);
                
                    
                    System.out.println();
                    System.out.println("*********************************");
                    System.out.println("numero de articulos comprados: " + toc);
                    System.out.println("costo en total: " + ss);
                    System.out.println("*********************************");
                        break;
                    case 6:
                        break;
                    case 7:
                        for(int n = 1; n<=10; n++){
                            System.out.println(n + " " +(n*10) + " " + (n*100) + " " +(n*1000) );
                        }
                        break;
                        case 8:
                        System.out.println("dame un valor entero: ");
                    numf = entrada.nextInt();
                    while(numf != 0){
                        fac *= numf;
                        numf --;
                    }
                    System.out.println("El facotorial es: "+fac);

                    
                        break;
                        case 12:
                        System.out.println("diamante");
                        System.out.println("ingrese en tamaño del diamante");
                        a = entrada.nextInt();
                        v = a-1;
                        for(b=1;b<=a;b++){
                            for(c=1;c<=v;c++){
                                System.out.println("");
                            }
                            v--;
                            for(c=1;c<=2*b-1;c++){
                                System.out.println("R");
                            }
                            System.out.println("" + "\n");
                        }
                        v = 1;
                        for(b=1;b<=a-1;b++){
                            for(c=1;c<=v;c++){
                                System.out.println(" ");
                            }
                            v++;
                            for(c=1;c<=2*(a-b)-1;c++){
                              System.out.println("R");
                            }
                            System.out.println("");
                        }
                        
                    break;
                    case 13:
                    System.out.println("calculadora");
                    System.out.println("seleccione una opcion");
                    System.out.println("suma");
                    System.out.println("resta");
                    System.out.println("multiplicacion");
                    System.out.println("division");
                    opcion = entrada.nextInt();
                    switch(opcion){
                        case 1:
                        System.out.println("suma");
                        System.out.println("dame un valor");
                        vala = entrada.nextFloat();
                        System.out.println("dame otro valor");
                        valb = entrada.nextFloat();
                        res = vala+valb;
                        System.out.println("el resultado de la operacion es: "+ res);
                        case 2:
                        System.out.println("resta");
                        System.out.println("dame un valor");
                        vala = entrada.nextFloat();
                        System.out.println("dame otro valor");
                        valb = entrada.nextFloat();
                        res = vala-valb;
                        System.out.println("el resultado de la operacion es: "+ res);
                        case 3:
                        System.out.println("multiplicacion");
                        System.out.println("dame un valor");
                        vala = entrada.nextFloat();
                        System.out.println("dame otro valor");
                        valb = entrada.nextFloat();
                        res = vala*valb;
                        System.out.println("el resultado de la operacion es: "+ res);
                        case 1:
                        System.out.println("division");
                        System.out.println("dame un valor");
                        vala = entrada.nextFloat();
                        System.out.println("dame otro valor");
                        valb = entrada.nextFloat();
                        res = vala/valb;
                        System.out.println("el resultado de la operacion es: "+ res);
                    
                    }
                    }         
                System.out.println("Deseas repetir el programa, escribe s para si");
                letra = entrada.next().charAt(0);



            }while(letra == 's' || letra == 'S' );
        }

    }
    
}