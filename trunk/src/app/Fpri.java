package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Fpri<T> {
	
	private List<Process> file;
	
	public Fpri()
	{
		this.file = new ArrayList<Process>();
		System.out.println("Création de la file de priorité effectuée avec succès");
	}
	
	public boolean estVide()
	{
		return file.isEmpty();
	}
	
	public void retire()
	{
		
	}
	
	public Process maxElem()
	{
		ListIterator<Process> listeProcess = this.file.listIterator();
		Process max = null;
		while(listeProcess.hasNext())
		{
			Process process = listeProcess.next();
			if(process.getPriority() >= max.getPriority())
			{
				if(process.getTime() < max.getTime())
				{
					max = process;
				}
			}
		}
		
		return max;
	}
	
}
