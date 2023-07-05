
public class Gerente extends Funcionario {

	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean IniciarSesion(String clave) {
		
		return clave == "Daniel-01";
	}
	
	public double getBonificacion() {
		System.out.println("Ejecutar desde gerente");
		return super.getSalario() +super.getBonificacion();
	}
	
	
	
	
	
}
