package vikingos;

public abstract class EstadoVikingo{
	
	protected int ataque;
	protected int defensa;
		
	public abstract EstadoVikingo beber();
	
	public abstract EstadoVikingo sacudir();

	public int getAtaque() {
		return ataque;
	}

	public int getDefensa() {
		return defensa;
	}
	
	public abstract String mostrarEstado();
}
