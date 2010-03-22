package implementHomeMaid;

import implementHomeMaid.Elem;
import implementHomeMaid.Fpri;

public class Elem<T> {
	
	private T value;
	private int priority;
	private int time;
	private Elem<T> next = null;
	private static int id = 0;
	
	
	public Elem(T value)
	{
		this.value = value;
		this.priority = 0;
		this.time = Fpri.getTime();
		System.out.println("Création du processus n°"+id+" effectuée avec succès");
		Elem.id++;
	}
	
	public Elem(T value, int priority)
	{
		this.value = value;
		this.priority = priority;
		this.time = Fpri.getTime();
		System.out.println("Création du processus n°"+id+" effectuée avec succès");
		Elem.id++;
	}

	public void afficher()
	{
		System.out.print("[ "+this.getValue()+" | "+this.getPriority()+" | "+this.getTime()+" ] ");
	}
	
	public T getValue() {
		return value;
	}

	public int getPriority() {
		return priority;
	}

	public int getTime() {
		return time;
	}

	public Elem<T> getNext() {
		
		return next;
	}

	

	public void setValue(T value) {
		this.value = value;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public void setNext(Elem<T> next) {
		this.next = next;
	}

	
	
}
