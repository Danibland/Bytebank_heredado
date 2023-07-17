
public class Gerente extends Funcionario implements  Autenticable {

	
	
	public double getBonificacion() {
		System.out.println("Ejecutar desde gerente");
		return 2000;//super.getSalario() +(this.getSalario()*0.05);
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean IniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
