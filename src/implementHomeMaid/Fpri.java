package implementHomeMaid;


public class Fpri<T> {

	private Elem<T> first = null;
	private static int time = 0;

	public Fpri() {
		
		System.out.println("Création de la file de priorité effectuée avec succès");
	}

	public boolean estVide() {
		return (this.first  == null) ? true : false ;
	}

	public void retire() {
		this.first = this.first.getNext();
	}

	public void ajoute(T valeur, int priority) {
		time++;
		Elem newElem = new Elem<T>(valeur, priority);
		if (this.first == null) {
			this.first = newElem;
			this.first.setNext(null);
		} else {
			Elem previous = findPrevious(newElem);
			newElem.setNext(previous.getNext());
			previous.setNext(newElem);
		}
	}

	private Elem<T> findPrevious(Elem process) {
		Elem<T> result = this.first;
		do
		{
			result = result.getNext();
			if (result.getNext().getPriority() <= process.getPriority()) 
			{
				if (result.getNext().getPriority() == process.getPriority())
				{
						if(result.getNext().getTime() > process.getTime()) 
						{
							return result;
						}
				}
				else
				{
					return result;
				}
			}
			
		}while (result.getNext() != null);
		return result;
	}

	public Elem<T> maxElem() {
		return this.first;
	}

	public int maxPri() {
		if(this.first != null)
		{
			return this.first.getPriority();
		}
		else
		{
			return 0;
		}
	}

	public void fusionne(Fpri<T> fille) {
		Elem<T> cursor = fille.getFirst();
		int i = 0;
		while(cursor != null)
		{
			System.out.println("Fusion element "+cursor.getValue());
			Elem<T> previous = this.findPrevious(cursor);
			cursor.setNext(previous.getNext());
			previous.setNext(cursor);
			cursor = cursor.getNext();
			i++;
		}
	}


	public void afficherFile() {
		Elem<T> cursor = this.first;
		System.out.println("Affichage de la file : ");
		while(cursor != null)
		{
			cursor.afficher();
			cursor = cursor.getNext();
		}
	}

	public static int getTime() {
		return time;
	}

	public Elem<T> getFirst() {
		return first;
	}

}
