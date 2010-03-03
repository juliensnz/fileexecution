package app;

public class Process<T> {
	private T value;
	private int priority;
	private int time;
	private static int id = 0;
	
	public Process()
	{
		System.out.println("salut Alex");
		this.value = null;
		this.priority = 0;
		this.time = 0;
		System.out.println("Création du processus n°"+id+" effectuée avec succès");
		Process.id++;
	}
	
	public Process(T value)
	{
		System.out.println("Tu es une grosse salope");
		this.value = value;
		this.priority = 0;
		this.time = 0;
		System.out.println("Création du processus n°"+id+" effectuée avec succès");
		Process.id++;
	}
	
	public Process(T value, int priority, int time)
	{
		this.value = value;
		this.priority = priority;
		this.time = time;
		System.out.println("Création du processus n°"+id+" effectuée avec succès");
		Process.id++;
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

	public static int getId() {
		return id;
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

	public static void setId(int id) {
		Process.id = id;
	}
	
	
	
}
