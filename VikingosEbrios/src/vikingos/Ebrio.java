package vikingos;

public class Ebrio extends EstadoVikingo{

	public Ebrio(){
		
		super();
		this.ataque = 7;
		this.defensa = 2;
	}

	@Override
	public EstadoVikingo beber() {
		return this;
	}

	@Override
	public EstadoVikingo sacudir() {
		return new Normal();
	}

	@Override
	public String mostrarEstado() {
		return "Ebrio";
	}

}
