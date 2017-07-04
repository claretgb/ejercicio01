package es.cic.taller.ejercicio01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	int x1 = -4;
    	int x2 = x1++;
    	int x3 = ++x2;
    	int resultado;
    	if(x2 < x3) {
    	} else {
    		x1++;
    	}
    	resultado = x1 + x2 + x3;
    	System.out.println( "Hello World!" + resultado );
    }
}
