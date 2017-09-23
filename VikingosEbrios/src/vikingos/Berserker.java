package vikingos;

public class Berserker extends EstadoVikingo{

	public Berserker(){
		
		super();
		this.ataque = 50;
		this.defensa = -10;
	}
	
	
	@Override
	public EstadoVikingo beber() {
		return new Enfurecido();
	}

	@Override
	public EstadoVikingo sacudir() {
		return this;
	}

	@Override
	public String mostrarEstado() {
		return "Berserker";
	}

}
