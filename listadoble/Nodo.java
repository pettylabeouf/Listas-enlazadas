package listadoble;

public class Nodo {	
		
		public String dato;
		public Nodo siguiente;
		public Nodo anterior;
		
		public Nodo (String dato){
			this.dato=dato;
			
		}
		public String toString(){
			return dato;
		}

}
