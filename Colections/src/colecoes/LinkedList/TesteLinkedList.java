package colecoes.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import objetos.Conta;

public class TesteLinkedList {

	public static void testLinkedList() {
		List<Conta> contas = new LinkedList<Conta>();
		Set<Integer> size = new HashSet<Integer>();
		
		for (int i = 0; i < 100000; i++) {
			contas.add(new Conta(100 + i, 0 + i, "Banco N°" + i));
		}

		for (Integer integer : size) {
			System.out.println(integer);
		}
//		Collections.sort(contas);
	}

	public static void main(String[] args) {
		testLinkedList();
	}
}
