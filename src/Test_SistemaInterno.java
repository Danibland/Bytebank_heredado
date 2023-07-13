
public class Test_SistemaInterno {

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		
		Gerente daniel = new Gerente();
		Administrador adriana = new Administrador();
		
		sistema.autentica(daniel);
		sistema.autentica(adriana);

	}

}
