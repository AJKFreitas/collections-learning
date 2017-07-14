package colecoes.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import objetos.Conta;

public class TesteArrayList {

	public static void testArrayList() {
		int x = 16;
		Set<Conta> contas = new TreeSet<Conta>();
		for (int i = 0; i < 100000; i++) {
			contas.add(new Conta(100+i,0+i,"Banco N°"+i));
			if(contas.size() == x+1){
				System.out.println(contas.size());
				x = x + x/2;
			}
		}
		System.out.println("------------------");
	}
	
	public static void main(String[] args) {
		testArrayList();
	}
}
