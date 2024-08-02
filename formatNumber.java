import java.text.NumberFormat;

public class formatNumber {
    public static void main(String[] args) {
        // NumberFormat currecy = new NumberFormat();// NO SE PUEDE PORQUE ESTA ES UNA CLASE ABSTRACTA
        String result;
        NumberFormat currecy = NumberFormat.getCurrencyInstance();
        result=currecy.format(123456.891);
        System.out.println(result);//123,456.89

        NumberFormat percent = NumberFormat.getPercentInstance();
        result=percent.format(0.1);
        System.out.println(result);//123,456.89
        
        // sin necesidad de crear el objeto NumberFormat
        result= NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);//123,456.89
        
    }
}
