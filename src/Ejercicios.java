import java.util.ArrayList;


class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
};

public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{try{//usamos try para intentar una accion
	return a/b;//si no existe ningun error devuelve la division entre a y b 
	}catch(ArithmeticException e){//usamos catch para capturar el error si se divide entre cero 
		e.printStackTrace();
	}
		return b; 
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{try{//usamos try para intentar una accion 
		return arreglo[pos];//si no existe ningun error devuelve arreglo en la posision pos 
	}catch (ArrayIndexOutOfBoundsException e){//usamos catch para capturar el error si se sale de los limites 
		e.printStackTrace();//imprimimos el error
	}
	 return 0;//devuelve cero 
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{ try{//usamos try para intentar una accion
		return mi_clase.x;//si no existe ningun error devuelve la variable x
	}catch(NullPointerException e){//usamos catch para capturar el error si es null
		 e.printStackTrace();
	}
	return 0;
	}
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
		return -1;
	}
	
	//Devuelve el numero mayor almacenado en 'mi_lista'
	static int getMayor(ArrayList<Integer> mi_lista)
	{
	 
		return -1; 
 
	}
	
	//Devuelve true si 'mi_lista' contiene 'str' de lo contrario devuelve false
	static boolean existe(ArrayList<String> mi_lista, String str)
	{
		if(mi_lista.contains(str))//evaluamos si el arraylist contiene str 
			   return true;//devuelve true si existe
			 else//sino 
			   return false;//devuelve false 

	//obtuve ayuda de la pagina http://curso-programacion.com/clase-arraylist/	
	}
	
	public static void main(String[] args)
	{ 
	}

}
