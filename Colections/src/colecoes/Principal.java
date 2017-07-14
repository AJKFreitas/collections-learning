package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import colecoes.LinkedList.TesteLinkedList;
import objetos.Conta;

public class Principal {

	public static List<Conta> listaDeContas(){
		List<Conta> listaContas = new ArrayList<>();
		return listaContas;
		
	}
	 public static Set<Conta> criaListaConta(){
		 
		 Set<Conta> setContas = new HashSet<Conta>();
		 for (int i = 1000; i >=0  ; i--) {
			setContas.add(new Conta(100+i,i+1));
		}
		 
		return setContas;
	 }
	
	
	public static void main(String[] args) {
		
		HashMap<Conta,Object> mapa = new HashMap<Conta,Object>();
		mapa.put(null, "kkk");
		mapa.put(null, 123);
		
		
			TesteLinkedList.testLinkedList();
		System.out.println("---------------------------");
			TestVectorVSArrayList.testar();
			TestVectorVSLinkedList.testar();
			TestArrayListVSHashSet.testar();
			
			Set<Conta> contas = new TreeSet<>();
			contas.addAll(criaListaConta());
			Iterator<Conta> iterator = contas.iterator();
			
			while (iterator.hasNext()) {
				Conta conta = (Conta) iterator.next();
				if(conta.getDigito() % 2 == 0 ){
					iterator.remove();
				}
				if(conta.getDigito() % 3 == 0 ){
					conta.setNomeBanco("Banco multiplo de 3");
					
				}else{
					conta.setNomeBanco("Banco Qualquer Um");
				}
			}
			for (Conta c : contas) {
				
				System.out.println(c);
			}
	}

}
