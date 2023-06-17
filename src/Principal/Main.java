package Principal;

public class Main {

	public static void main(String[] args) {
		
		int contador = 0; 
		
		while(contador<=10) {
			System.out.println(contador);
			//contador = contador + 1;
			contador++;
			//contador+=1;
		}
		
		for(int i=0; i<=10; i++) {
			System.out.println("i: "+i);
		}
		
		
		for(int y=0; y<=10; y++) {
			if(y==7) {
				break;
			}else {
				System.out.println("y: "+y);
			}
			
		}
		
		int contador1 = 0; 
		
		while(contador1<=10) {
			System.out.println("Contador 1:" + contador1);
			if(contador1==5) {
				break;
			}
			contador1++;
		}
		
		
		for(int filas=1;filas<=10;filas++) {
			for(int columnas=1;columnas<=4;columnas++) {
				System.out.println("Fila "+filas+" Columna "+columnas);
			}
		}
		
		for(int filas=1;filas<=10;filas++) {
			for(int columnas=1;columnas<=10;columnas++) {
				System.out.println(""+filas+" x "+columnas+":"+(filas*columnas));
			}
		}
		
		

	}

}
