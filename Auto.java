import java.util.Scanner;

public class Auto{
	public static void main(String[] args){
		int a,b;
		int suma;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Ingresa dos numeros: ");
		a=entrada.nextInt();
		b=entrada.nextInt();
		
		suma=a+b;
		System.out.printf("\nLa suma de los numeros es:%d\n",suma);
		
	}
}
