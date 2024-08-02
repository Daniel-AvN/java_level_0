/* 
 * PRIMITIVE    VS   REFERENCE TYPES OR "NO PRIMITIVE"
 * almacenar            almacenar
 * valores               objetos complejos
 * simples          
 */

// import java.util.Date;
import java.awt.*;

public class referenceTypes {
    public static void main(String[] args) {
        // byte x=1;//primitive
        // byte y=x;//
        // x and y are independent, if I change someone the other won't change

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);
        // en este caso el point1 y point2 hacen referencia al mismo espacio en memoria, son dependientes, si cambio una la otra cambia

        // Date now = new Date();//no primitive

        // System.out.println(now.getTime());
    }
}
