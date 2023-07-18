
public class AutenticacionUtil implements Autenticable{
	
	private String clave;
	
	@Override
	public void setClave(String clave) {
		
		this.clave = clave;
	}
	
	public boolean IniciarSesion(String clave) {
		
		return this.clave == clave;
		
		
	}

	

}
