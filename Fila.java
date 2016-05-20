package fila;

public class Fila {

	public Nodo inicio;
	
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
					returns apuntador;
				}
				apuntador=apuntador.siguiente;
				k++;
			}
			return null;
		}
		
	}
}
