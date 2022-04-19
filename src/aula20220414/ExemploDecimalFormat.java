package aula20220414;

import java.text.DecimalFormat;
import java.util.Locale;

public class ExemploDecimalFormat {
 
    public static void main(String[] args) {
 
    	Locale.setDefault(new Locale("pt", "BR"));  // mudança global
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("R$ #,##0.00");
 
 
        double numero = 15000.09;
 
        System.out.println(df.format(numero));
 
    }
}