import java.util.Scanner;

public class Guerritas {
    public static int[][] j1 = new int[8][8];
    public static int[][] j2 = new int[8][8];

    public static void main(String[] args) {
        int tanques = 0, misil = 0, S = 0, a = 0;
        int X, Y, posicion = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("bienvenido al juego de tanques");
        System.out.println("instrucciones");
        System.out.println("     ░░░░██ ]▄▄▄▄▄▄▃    el juego es de 2 personas (soldados");
        System.out.println("   ▂▄▅█████▅▄▃▂          el cual empieza por colocar los tanques en la posicion que se desea ( 4 tanques)");
        System.out.println("  I█████████████].          en campo es un cuadro de 8X8 ");
        System.out.println("  ◥⊙▲⊙▲⊙▲⊙▲⊙◤          despues se procede a disparar para dar en el blanco");
        System.out.println("el primero en eliminar alos tanque es el ganador");
        System.out.println("suerte y que gane el mejor :)");
        System.out.println("  X    1 2 3 4 5 6 7 8");
        System.out.println("Y    -------------------");
        System.out.println("   1 | 0 0 0 0 0 0 0 0 |");
        System.out.println("   2 | 0 0 0 0 0 0 0 0 |");
        System.out.println("   3 | 0 0 0 0 0 0 0 0 |");
        System.out.println("   4 | 0 0 0 0 0 0 0 0 |");
        System.out.println("   5 | 0 0 0 0 0 0 0 0 |");
        System.out.println("   6 | 0 0 0 0 0 0 0 0 |");
        System.out.println("   7 | 0 0 0 0 0 0 0 0 |");
        System.out.println("   8 | 0 0 0 0 0 0 0 0 |");
        System.out.println("     -------------------");
        do {
            System.out.println("indique en que posicion desea colocar el tanque");
            System.out.println("Soldado 1");
            System.out.println((tanques + 1) + "\n" + " Posicion X :");
            X = input.nextInt();
            System.out.println("indique en que posicion desea colocar el tanque");
            System.out.println((tanques + 1) + "\n" + "posicion y");
            Y = input.nextInt();
            tanques = misil(j1, X, Y);
        } while (tanques < 4);

        tanques = 0;

        do {
            System.out.println("indique en que posicion desea colocar el tanque");
            System.out.println("Soldado 2" + "\n");
            System.out.println("Posicion X :" + "\n" + (tanques + 1));
            X = input.nextInt();
            System.out.println(": Posicion Y :" + "\n" + (tanques + 1));
            Y = input.nextInt();

            tanques = misil(j2, X, Y);
        } while (tanques < 4);

        do {
            a = misil % 2;
            System.out.println("¿Listo para diparar soldado?");
            System.out.println("Misil listo para disparar" + (a + 1));

            System.out.println("Soldado Ataca " + "\n" + (a + 1) + "\n" + ": Posicion X:");
            X = input.nextInt();
            System.out.println("Soldado Ataca " + "\n" + (a + 1) + "\n" + ": Posicion Y:");
            Y = input.nextInt();
            int[][] turn;
            if (a == 0)
                turn = j2;
            else
                turn = j1;

            S = misil(turn, X, Y, a + 1);
            misil++;

        } while (S > 0);
        System.out.println("-------------------------------------------------");
        System.out.println("|                                                |");
        System.out.println("| Felicidades jugador " + "\n" + (a + 1) + "\n" + " has ganado|");
        System.out.println("|                                                |");
        System.out.println("-------------------------------------------------");
    }

    public static int misil(int[][] turn, int X, int Y) {
        int tanques = 0;
        turn[X][Y] = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (turn[i][j] != 0) {
                    tanques++;
                }
            }
        }
        return tanques;
    }

    public static int misil(int[][] turn, int X, int Y, int c) {
        int value = turn[X][Y];
        if (value != 0) {
            System.out.println("Misil dio en el blanco Bien echo soldado X:"+ "\n" + X + "\n" +" Y:"+ "\n" + Y + "\n" + " por el jugador " + "\n" + c);
            System.out.println("");
        } else {
            System.out.println("Apunte bien soldado" + "\n" + c);
            System.out.println("");
        }
        turn[X][Y] = 0;
        int d = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (turn[i][j] != 0) {
                    d++;
                }
            }
        }
        return d;
    }
}
