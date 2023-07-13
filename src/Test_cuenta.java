
public class Test_cuenta {

	public static void main(String[] args) {

		Cuenta cc = new Cuenta_corriente(1, 1);
		Cuenta ca = new Cuenta_ahorros(2, 3);

		cc.depositar(6000);
		ca.depositar(5000);
		cc.transferir(2000, ca);
		// cc.retirar(1000);
		// ca.retirar(1000);

		// aun no debita la comision

		System.out.println("corriente: " + cc.Getsaldo());
		System.out.println("Ahorros: " + ca.Getsaldo());

	}

}
