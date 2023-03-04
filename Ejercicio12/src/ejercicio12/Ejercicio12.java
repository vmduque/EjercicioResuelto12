package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        double HorasTrabajadas,ValorHora,retencion,SalarioBruto,SalarioNeto;
        Scanner leerporteclado = new Scanner(System.in);
        
        System.out.println("Ingrese las horas trabajadadas:");
        HorasTrabajadas = leerporteclado.nextDouble();
        
        System.out.println("Ingrese el valor de la hora:");
        ValorHora = leerporteclado.nextDouble();
        
        retencion = 0.125;
        SalarioBruto = HorasTrabajadas * ValorHora;
        SalarioNeto = SalarioBruto - (SalarioBruto * retencion);
        System.out.println("El salario bruto es: " + SalarioBruto);
        System.out.println("El salario neto es: " + SalarioNeto);
        
        
       
                
                
        
    }
    
}
