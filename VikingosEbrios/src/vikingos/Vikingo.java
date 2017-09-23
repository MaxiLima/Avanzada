package vikingos;

public class Vikingo {
	private int salud;
	private EstadoVikingo estado;
	
	public Vikingo(){
		salud = 100;
		estado = new Normal();
	}
	
	public void atacar(Vikingo that){
		
		that.serAtacado(estado.getAtaque());
	}
	
	public void serAtacado(int valor){
		this.salud -= valor - estado.getDefensa(); 
	}
	
	public void beber(){
		estado = estado.beber();
	}
	
	public void sacudirVikingo(){
		estado = estado.sacudir();
	}
	
	public int getSalud() {
		return salud;
	}
	
	public String getEstado(){
		return estado.mostrarEstado();
	}
	

	public int getAtaque() {
		return estado.getAtaque();
	}


	public int getDefensa() {
		return estado.getDefensa();
	}


	
}
