import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.FileReader;

public class exceptions {

    public static void main(String[] args) {
        // CHECKED EXCEPTION
        
        // try {
        //     var reader = new FileReader("file.txt");
        //     reader.getEncoding();
        //     System.out.println("file opened");
        //     // reader.close();

        // } catch (FileNotFoundException ex) {
        //     System.out.println(ex.getMessage());

        //     ex.printStackTrace();

        // }

        // CATCHING MULTIPLE TYPE OF EXCEPTIONS
        // solo ejecuta un catch, y su orden si importa
        // hasta abajo se ponen los catch q son clase padre y debajo de estos los catch de clase hijos q heredan de la superior 

        FileReader reader=null;
        try {
            reader = new FileReader("file.txt");
            reader.getEncoding();
            System.out.println("file opened");
            // var value = reader.read();
            reader.close();

            new SimpleDateFormat().parse("");

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        // error al abrir el archivo
        }catch (IOException  | ParseException e) {
            System.out.println("could not read data");
        } finally {

            if (reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }                
            }
        }

        // EL BLOCK DE FINALLY SIEMPRE SE VA A EJECUTAR

        // catch (ParseException e) {
        //     e.printStackTrace();
        // }

        // UNCHECKED EXCEPTION: se previenen haciendo testing
        // show();

        // ERROR:error externo de la app, como falta de espacio de memoria,...

        


    }
    public static void show() {
        sayHello(null);
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase() );
    }

}
