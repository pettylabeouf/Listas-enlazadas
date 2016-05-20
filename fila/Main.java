package fila;
import java.util.Scanner;

import listadoble.ListaDoble;

public class Main {

	public static void main(String[] args){
		Fila fila=new Fila();
		
		fila.agregar("Hola");
		fila.agregar("como");
		fila.agregar("estas");
		fila.agregar("");
		fila.agregar(null);
		
		fila.listar();
		
		Nodo n=fila.getNodo(2);
		
		System.out.println(n);
		
		Nodo m=fila.getNodo(10);
		
		System.out.println(m);
		
		Nodo l=fila.getNodo(0);
		
		System.out.println(l);
		
		Nodo k=fila.getNodo(1);
		
		System.out.println(k);
		
		ListaDoble lista=new ListaDoble();
		lista.agregar("Michel");
		lista.agregar("Daniela");
		lista.agregar("Areli");
		
		lista.listar();
		
		Scanner sc=new Scanner(System.in);
		String entrada="";
		
		listadoble.Nodo  apuntador=lista.inicio;
		System.out.println("Inicio: "+ apuntador);
		
		while(!sc.equals("x")){
			entrada=sc.nextLine();
			
			listadoble.Nodo inicio = null;
			if(entrada.equals("a")){
				
				if(apuntador.anterior==null){
					inicio=apuntador.anterior;
					System.out.println("Nodo: "+ apuntador+ " es el inicio de la lista");
				}
				else{
					apuntador=apuntador.anterior;
					System.out.println("el anterior es: " + apuntador);
				}
			}
			else if(entrada.equals("s")){
				
				if(apuntador.siguiente==null){
					System.out.println("Nodo: "+ apuntador+ " es el fin de la lista");
					//apuntador.siguiente=inicio;
				}
				else{
					apuntador=apuntador.siguiente;
					System.out.println("el siguiente es: " + apuntador);
				
				}
					
				
			}
		}
	}
	
	
}
