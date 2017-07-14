package colecoes.TreeMap;

import java.util.Map;
import java.util.TreeMap;

import objetos.Conta;

public class TesteTreeMap {

	public static void testArrayList() {
		Map<String, Conta> contas = new TreeMap<String, Conta>();
		for (int i = 0; i < 100000; i++) {
			contas.put("Alguém-" + i, new Conta(100 + i, 0 + i, "Banco N°" + i));
		}
	}

	public static void main(String[] args) {
		testArrayList();
	}
}
