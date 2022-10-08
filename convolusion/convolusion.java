public class convolusion {
     public static void main(String[] args) {
            for (int a = 0; (a < ));
            int[] m1 = new int[] {-3,-2,1,4};
            int[] m2 = new int[] {-2,-1,0};
            int Total = 0;
            for (int i = 0; (i < m1.length); i++) {
                int m1Value = m1[i];
                int vectorSum = 0;
                for (int j = 0; (j < m2.length); j++) {
                    int m2Value = m2[j];
                    System.out.println("Vector:("+ m1Value + ")("+ m2Value +")");
                    vectorSum = (vectorSum + (m1Value * m2Value));
                }
                Total = (Total + vectorSum);
                System.out.println("Vector V("+(i + 1)+") Result: "+vectorSum);
            }
            System.out.println("el total del resultado es: "+ Total);
        }
    }