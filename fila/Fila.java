package fila;

public class Fila {

	public Nodo inicio;
	public int tama–o;
	
	public void agregar(String cadena){
		Nodo objeto=new Nodo();
		
		objeto.dato=cadena;
		
		if(inicio==null){
			inicio=objeto;
		}
		else{
			objeto.siguiente=inicio;
			inicio=objeto;
		}
	}
	
	public void listar(){
		Nodo apuntador=inicio;
		
		while(apuntador!=null){
			System.out.println(apuntador.dato);
			apuntador=apuntador.siguiente;
		}
	}
	public Nodo getNodo(int index){
		
		Nodo apuntador=inicio;
		
		int k=0;
		if(index>tama–o-1)
			return null;
		
		if(inicio==null)
			return null;
		
		if(index==0)
			return inicio;
		
		else{
			while(apuntador!=null){
				if(k==index){
					return apuntador;
				}
				apuntador=apuntador.siguiente;
				k++;
			}
			return null;
		}
		
	}
	public Nodo getNodo(String cadena){
		
		Nodo apuntador=inicio;
		
		int k=0;
		if(cadena.equals(""))
			return null;
		
		if(inicio==null)
			return null;
		
		if(inicio.dato.equals(cadena))
			return inicio;
		
		else{
			while(apuntador!=null){
				if(apuntador.dato.equals(cadena)){
					return apuntador;
				}
				apuntador=apuntador.siguiente;
				k++;
			}
			return null;
		}
		
	}
	public void eliminar (int index){
		Nodo apuntador=inicio;
		Nodo anterior=inicio;
		int k =0;
		
		while(apuntador!=null){
			if(k==index){
				anterior.siguiente=apuntador.siguiente;
				apuntador=null;
			}
			k++;
			anterior=apuntador;
			apuntador=apuntador.siguiente;
		}
	}
	
}

// firma de un metodo el lo que retorna, el tipo de dato y int o string 