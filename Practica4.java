package ejercicio;            //1° Paquete
import java.util.Scanner;     //2° Importar
public class Practica4 {      //3° Clase pública
    public static void main(String[] args) {    //4° Método main
        Scanner leerMoneda = new Scanner(System.in);  //5° Declaro o le doy nombre a mi Scanner
        
        System.out.println("Ingrese cantidad en pesos mexicanos");
        double pesos = leerMoneda.nextDouble();
        leerMoneda.close();  //Ciero el Scanner
        
        //PODEMOS DECLARAR EUROS Y DOLARES COMO CONSTANTES
        final double precioEuro = 17.3;
        final double precioDolar =19;
        
        double Euro = pesos/precioEuro;      //Ahora convertimos los pesos a euros y dolares
        double Dolar = pesos/precioDolar;
        
        System.out.println("$" +pesos+" pesos mexicanos equivalen a "+Euro+" euros y a "+Dolar+" dolares");      
    }    
}
