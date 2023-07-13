
public class Gerente extends  FuncionarioLog {

	
	
	public double getBonificacion() {
		System.out.println("Ejecutar desde gerente");
		return 2000;//super.getSalario() +(this.getSalario()*0.05);
	}
	
	
	
	
	
}
