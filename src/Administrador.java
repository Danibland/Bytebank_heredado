
public class Administrador extends Funcionario implements Autenticable {

	private AutenticacionUtil util;

	public Administrador() {
		this.util = new AutenticacionUtil();
	}

	@Override
	public double getBonificacion() {
		return this.getSalario();

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
