package validador;

import java.io.File;

public class Teste {

	public static void main(String[] args) throws Exception {
		Validador validador = new Validador();
		validador.valida(new File("pedido.xml"), new File("pedido.xsd"));
	}
}
