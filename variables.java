public class variables {
    
    public static void main(String[] args) {
/*         byte age=20;
        long viewsCount=3_123_456_789L; //ponemos la L para q java sepa q es un long, si no esta piensa q es un int, el _ es para q nosotros podamos leer mejor el numero, es como cuando separamos los decimales y centenas con comas 123_456_789=123,456,789. la L puede ser mayuscula o minuscula

        float price= 10.99f;//se indica q es double, para java, todos

        char letter = 'a';
        boolean isEligible = false;
 */
        // STRING:
        String message = "hello beach";
        
        System.out.println(message.endsWith("h") );
        System.out.println(message.length() );
        System.out.println(message.indexOf("h") );
        System.out.println(message.indexOf("beach") );
        System.out.println(message.indexOf("sky") );//-1 si no aparece
        System.out.println(message.replace("h","*") );//no modifica el String, sino q devuelve otro. ESTO PASA CON TODOS LOS METODOS DE STRING
        System.out.println(message.toLowerCase() );
        System.out.println(message.toUpperCase() );
        message = "   hello beach       ";
        System.out.println(message );
        System.out.println(message.trim() );

        System.out.println();
        // PONER CARACTERES ESPECIALES AL STRING
        message = "hello \"beach\" ";//poner ".."

        message = "c:\\Windows\\... ";//c:\Windows\...
        message = "c:\nWindows\n... ";//salto de linea
        message = "c:\tWindows\t... ";//tabular        

        System.out.println(message);

        // CONSTANSTS:

        final float gravity = 9.81f;
        System.out.println(gravity);

    }
}
