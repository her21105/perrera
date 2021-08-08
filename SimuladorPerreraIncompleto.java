/******************************************************************
SimuladorPerreraIncompleto.java
Autor: Tomás Gálvez P.
Última modificación: 2020-07-14

Driver program que implementa el menú de opciones para el simulador
que entrenará voluntari@s.
******************************************************************/
/******************************************************************
SimuladorPerreraIncompleto.java
estado: completo
Autor: Joab Hernandez G.
Última modificación: 2021-08-07

Driver completo con las opciones de persona y perro
******************************************************************/
import java.util.Scanner;

class SimuladorPerrera{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//Crear perro y persona
		Perro miPerro = new Perro();
		Persona p = new Persona();
		//psicologia de perro con nueva persona p
		miPerro.psican(p);

		//default opción
		int opcion = 0;
		
		//repetir hasta que salga opcion == 6
		while (opcion != 6){
		
			//menu de opciones
			System.out.println("\n\nBienvenido al simulador de entrenamiento de voluntari@s. ¿Qué hará?");
			System.out.println("1. Nueva persona");
			System.out.println("2. Nuevo perro");
			System.out.println("3. Sacar galleta");
			System.out.println("4. Interactuar");
			System.out.println("5.adoptar");
			System.out.println("6. Salir\n\n");
			
			
			//sccaner
			opcion = scan.nextInt();

			//switch opciones
			if (opcion == 1){
				//Nueva persona
				p = new Persona();
				miPerro.psican(p);
			} else if (opcion == 2){
				//Nuevo perro
				miPerro = new Perro();
			} else if (opcion == 3){
				//Sacar galleta
				miPerro.galleta(p);
			} else if (opcion == 4){
				//Interactuar
				//variante 1, perro adoptable
				if(miPerro.getEstadoanimo()> miPerro.getumbral() || p.getgalleta() == false){
					miPerro.cola = true;
					System.out.println("el perro mueve la cola cuando el humano se acerca");

				}
				//variante 2
				else if(miPerro.getEstadoanimo()<miPerro.getumbral() || p.getgalleta()== false){
					System.out.println("el perro gruñe y ladra violentamente, no puedes hacercarte, no tiene caso, el perro no es compatible contigo");
				}
				//variante 3
				else if(miPerro.getEstadoanimo()>miPerro.getumbral() || p.getgalleta() == true){
					miPerro.cola = true;
					System.out.println("el perro mueve la cola con solo verte, no le has dado la galleta, tienen una gran compatibilidad");
				}
				//variante 4
				else if(miPerro.getEstadoanimo()<miPerro.getEstadoanimo()|| p.getgalleta() == true){
					System.out.println("el perro tiene la cola entre las patas cuando te acercas, intenta darle la galleta a ver si mejora su estado de animo");
				}
				//variante 5
				else{
					System.out.println("el perro no se inmuta ante tu presencia");
				}
			} else if (opcion == 5){
				//La persona adopta al perro
				if(miPerro.getcola() == true){
					System.out.println("el perro fue adoptado por ti :D");
					System.out.println("se generaran un nuevo perro y una persona nueva para seguir con la simulación");
					miPerro = new Perro();
					p = new Persona();
					miPerro.psican(p);
				}
			} else if (opcion == 6){
				//Salir
			}
		
		
		} System.exit(0);
	}
}