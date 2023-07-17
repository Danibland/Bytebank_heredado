
public class SistemaInterno {
	
	private String clave = "12345";

	public boolean autentica(Autenticable gerente) {

		boolean PuedeIniciarSesion = gerente.IniciarSesion(clave);
		
		if(PuedeIniciarSesion) {
			System.out.println("hola");
			return true;
		}
		else {
			System.out.println("error");
			return false;
			
		}
		

	}

	
}
