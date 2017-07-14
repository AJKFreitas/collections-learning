package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import objetos.ContaPoupanca;

public class TesteOrdenacao {

	public static List ordenarLista( List lista){
		Collections.sort(lista);
		return lista;
	}
	
	public static void testarOrdenacao(){
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNome("joao");
		c1.setNumero(1);
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNome("Angelo");
		c2.setNumero(3);
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNome("Karla");
		c3.setNumero(3);
		ContaPoupanca c4 = new ContaPoupanca();
		c4.setNome("Angelo");
		c4.setNumero(2);
		
		ContaPoupanca c5 = new ContaPoupanca();
		c5.setNome("Angelo");
		c5.setNumero(1);
		
		ContaPoupanca c6 = new ContaPoupanca();
		c6.setNome("Karla");
		c6.setNumero(2);
		
		ContaPoupanca c7 = new ContaPoupanca();
		c7.setNome("Karla");
		c7.setNumero(1);
		
		ContaPoupanca c8 = new ContaPoupanca();
		c8.setNome("joao");
		c8.setNumero(2);
		
		ContaPoupanca c9 = new ContaPoupanca();
		c9.setNome("joao");
		c9.setNumero(3);
		
		Collection<ContaPoupanca> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		lista.add(c3);
		lista.add(c4);
		lista.add(c5);
		lista.add(c6);
		lista.add(c7);
		lista.add(c8);
		lista.add(c9);
		
	
		System.out.println("- lista orden de inserção");
		System.out.println(lista);
		
		System.out.println("- lista ordenada");
		ordenarLista((List) lista);
		System.out.println(lista);
		
		System.out.println("- lista embaralhada");
		Collections.shuffle((List<?>) lista);
		System.out.println(lista);
		
		System.out.println("- lista ordem inversa");
		Collections.reverse((List<?>) lista);
		System.out.println(lista);
		
		System.out.println("- lista ordem Rotacionada");
		Collections.rotate((List<?>) lista,1);
		System.out.println(lista);
		
		System.out.println("- Menor elemento da lista");
		System.out.println(Collections.min(lista));
		
		System.out.println("- Maior elemento da lista");
		System.out.println(Collections.max(lista));
		
//		for (ContaPoupanca contaPoupanca : lista) {
//			System.out.println(contaPoupanca.getNumero()+" - "+contaPoupanca.getNome());
//		}
		
		Set<ContaPoupanca> lista2 = new TreeSet<ContaPoupanca>();
		
				lista2.add(c1);
				lista2.add(c2);
				lista2.add(c3);
				lista2.add(c4);
				lista2.add(c5);
				lista2.add(c6);
				lista2.add(c7);
				lista2.add(c8);
				lista2.add(c9);
				
				
		
//		System.out.println(lista2);
//		System.out.println("-");
//		
//		lista2.stream().sorted();
//		
//		for (ContaPoupanca contaPoupanca : lista2) {
//			System.out.println(contaPoupanca.getNumero()+" - "+contaPoupanca.getNome());
//		}
	}
}
