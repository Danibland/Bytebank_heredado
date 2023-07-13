
public class Test_controlBonificacion {
	public static void main(String[] args) {

		Funcionario daniel = new Gerente();

		daniel.setSalario(2000);

		Gerente adriana = new Gerente();

		adriana.setSalario(10000);
		
		Contador contador1 = new Contador();
		contador1.setSalario(5000);

		Control_bonificaciones controlB = new Control_bonificaciones();

		controlB.registrarSalario(daniel);
		controlB.registrarSalario(adriana);
		controlB.registrarSalario(contador1);
		
		

	}
}
