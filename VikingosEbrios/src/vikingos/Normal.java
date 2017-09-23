package vikingos;

public class Normal extends EstadoVikingo{
	
	public Normal(){
		
		super();
		this.ataque = 10;
		this.defensa = 5;
	}
	
	@Override
	public EstadoVikingo beber(){
		
		return new Ebrio();
	}

	@Override
	public EstadoVikingo sacudir() {
		return new Enfurecido();
	}

	@Override
	public String mostrarEstado() {
		return "Normal";
	}
}
