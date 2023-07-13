
public class FuncionarioLog {

	private String clave;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean IniciarSesion(String clave) {

		return clave == "12345";
	}

}
