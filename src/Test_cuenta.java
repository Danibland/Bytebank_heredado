
public class Test_cuenta {

	public static void main(String[] args) {

		Cuenta cc = new Cuenta_corriente(1, 1);
		Cuenta ca = new Cuenta_ahorros(2, 3);

		try {

			cc.depositar(5000);
			ca.depositar(5000);
			ca.transferir(4000, cc);
			// ca.retirar(1000);
			// cc.retirar(4000);

		} catch (SaldoinsuficienteEx e) {

			e.printStackTrace();
		}

		// ca.retirar(1000);
		// cc.retirar(4000);

		System.out.println("corriente: " + cc.Getsaldo());
		System.out.println("Ahorros: " + ca.Getsaldo());

	}

}
