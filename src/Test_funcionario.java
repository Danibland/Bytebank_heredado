
public class Test_funcionario {

	public static void main(String[] args) {
		
		Funcionario daniel = new Funcionario();
		daniel.setNombre("Daniel");
		daniel.setDocumento("1035865589");
		daniel.setSalario(5000000);
		daniel.setTipo(0);
		
		System.out.println(daniel.getNombre());
		System.out.println(daniel.getBonificacion());
		System.out.println(daniel.getSalario()+ daniel.getBonificacion());
		

	}

}
