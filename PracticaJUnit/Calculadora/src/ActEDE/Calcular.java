package ActEDE;

public class Calcular {

	public static void main(String[] args){
		
		int elegir=0;
		double valor1=0;
		double valor2=0;
		
		System.out.println("------------CALCULADORA DE PACO------------");
		
		do{
			System.out.println("(1) Sumar\n(2) Restar\n(3) Multiplicar\n(4) Dividir\n(5) Salir");
			
			try{
				elegir=Entrada.entero();
			}
			catch(NumberFormatException ex){
				System.out.println("Tipo de dato inesperado. . .");
			}
		}
		while(elegir<=0||elegir>5);
		
		switch(elegir){
		
		case 1:
			
			System.out.print("Introduzca el valor 1: ");
			valor1=Entrada.real();
			
			System.out.print("\nIntroduzca el valor 2: ");
			valor2=Entrada.real();
			
			System.out.println("Resultado: "+Calculadora.sumar(valor1,valor2));
			
			break;
			
		case 2:
			
			System.out.print("Introduzca el valor 1: ");
			valor1=Entrada.real();
			
			System.out.print("\nIntroduzca el valor 2: ");
			valor2=Entrada.real();
			
			System.out.println("Resultado: "+Calculadora.restar(valor1,valor2));
			
			break;
	
		case 3:
			
			System.out.print("Introduzca el valor 1: ");
			valor1=Entrada.real();
			
			System.out.print("\nIntroduzca el valor 2: ");
			valor2=Entrada.real();
			
			System.out.println("Resultado: "+Calculadora.multiplicar(valor1,valor2));
			
			break;
			
		case 4:
			
			System.out.print("Introduzca el valor 1: ");
			valor1=Entrada.real();
			
			System.out.print("\nIntroduzca el valor 2: ");
			valor2=Entrada.real();
			
			System.out.println("\nResultado: "+Calculadora.dividir(valor1,valor2));
			
			break;
			
		case 5:
			
			System.out.println("Gracias por usar mi calculadora!");
			
			break;
		}
	}
}
