
public class Gerente extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;
	
	public Gerente() {
		this.util = new AutenticacionUtil();
	}

	public double getBonificacion() {
		System.out.println("Ejecutar desde gerente");
		return 2000;
	}

	@Override
	public void setClave(String clave) {
		this.setClave(clave);

	}

	@Override
	public boolean IniciarSesion(String clave) {
		return this.util.IniciarSesion(clave);

	}

}
