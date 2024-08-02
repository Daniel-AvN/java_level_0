
public class Asterisks {
    // public static void main(String[] args) {

    //     System.out.println();
    //     quadrilateral(3, 6);
    //     trianguloRectangulo(3);
    //     diagonal(5,false);   
    //     diagonal(5,true);    
    //     quadrilateral(6);
    //     square(2);

    //     boardedQuadrilateral(3,4);
    //     boardedQuadrilateral(57);

    // }

    public static void boardedQuadrilateral(int higth, int width){
        if (higth<=0 || higth>50) {
            throw new IllegalArgumentException("higth must be greater than 0 and less than 50");
        }
        if (width<=0 || width>50) {
            throw new IllegalArgumentException("width must be greater than 0 and less than 50");
        }
        char matriz[][]= new char[higth][width];
        for (int i = 0; i < higth; i++) {
            for (int j = 0; j < width; j++) {
                if( (i==0||i==higth-1) || (j==0||j==width-1) ){
                    matriz[i][j] ='*';   
                }else{
                    matriz[i][j] =' ';   
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void boardedQuadrilateral(int side){
        if (side<=0 || side>50) {
            throw new IllegalArgumentException("side must be greater than 0 and less than 50");
        }
        char matriz[][]= new char[side][side];
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if( (i==0||i==side-1) || (j==0||j==side-1) ){
                    matriz[i][j] ='*';   
                }else{
                    matriz[i][j] =' ';   
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void quadrilateral(int higth, int width){
        if (higth<=0 || higth>100) {
            throw new IllegalArgumentException("higth must be greater than 0 and less than 101");
        }
        if (width<=0 || width>100) {
            throw new IllegalArgumentException("width must be greater than 0 and less than 101");
        }
        for (int i = 0; i < higth; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void quadrilateral(int higth){
        if (higth<=0 || higth>100) {
            throw new IllegalArgumentException("higth must be greater than 0 and less than 101");
        }
        for (int i = 0; i < higth; i++) {
            for (int j = 0; j < higth; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    
    public static void square(int side){
        if (side<=0 || side>100) {
            throw new IllegalArgumentException("side must be greater than 0 and less than 101");
        }
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void trianguloRectangulo(int higth){
        if (higth<=0 || higth>100) 
            throw new IllegalArgumentException("higth must be greater than 0 and less than 101");

        for (int i = 0; i <= higth; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
    }

    
    /**
     * @param higth
     * @param dir the direction, true if you want the diagonal on the right, false on the left 
     */
    public static void diagonal(int higth, boolean dir){
        if (higth<=0 || higth>100) 
            throw new IllegalArgumentException("higth must be greater than 0 and less than 101");

        if (dir) {
            for (int i = 0; i < higth; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }else{
            for (int i = 0; i < higth; i++) {
                for (int j = 0; j < higth; j++) {
                    // Imprimir asterisco si la suma de la posición de la fila y la posición de la columna es igual al tamaño - 1
                    if (i + j == higth - 1) {
                        System.out.print("* ");
                    } else {
                        // Imprimir espacio en blanco en otras posiciones
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        
        System.out.println();
    }
}
