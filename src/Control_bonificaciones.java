
public class Control_bonificaciones {

	private double suma;

	
	public double registrarSalario(Funcionario funcionario) {
		this.suma = funcionario.getBonificacion() + this.suma;
		
		System.out.println(this.suma);
		
		return this.suma;
	}
	
	

}
