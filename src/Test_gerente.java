
public class Test_gerente {

	public static void main(String[] args) {

		Funcionario gerente1 = new Gerente();
		Gerente gerente2 = new Gerente();
		
		gerente2.setNombre("Adriana");
		gerente2.setDocumento("1152446019");
		gerente2.setSalario(5000000);
		gerente2.setTipo(1);
		gerente2.setClave("Daniel-01");
		
		gerente1.setNombre("Daniel");
		gerente1.setDocumento("1035865589");
		gerente1.setSalario(5000000);
		gerente1.setTipo(0);
		
		//System.out.println(gerente2.getNombre());
		System.out.println(gerente2.getBonificacion());
		System.out.println(gerente2.IniciarSesion("Daniel-01"));
		
		
		

	}

}
 