package vikingos;

public class Enfurecido extends EstadoVikingo{
	
	public Enfurecido(){
		
		super();
		this.ataque = 30;
		this.defensa = 0;
	}
	
	@Override
	public EstadoVikingo beber() {
		return new Normal();
	}

	@Override
	public EstadoVikingo sacudir() {
		return new Berserker();
	}
	
	@Override
	public String mostrarEstado() {
		return "Enfurecido";
	}

}
