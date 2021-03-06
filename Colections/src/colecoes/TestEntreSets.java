package colecoes;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

import objetos.Conta;

public class TestEntreSets {

	public static void main(String[] args) {
		Random r = new Random();
		 
		HashSet<Conta> hashSet = new HashSet<Conta>();
		TreeSet<Conta> treeSet = new TreeSet<Conta>();
		Map<String,Conta> hashtable = new Hashtable<String,Conta>();
	 
		// start time
		
		long startTime = System.nanoTime();
	 
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			hashSet.add(new Conta(x,i,"Banco "+i));
		}
		// end time
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("HashSet:      " + duration);
	 
	 
	 
	 
		// start time
		startTime = System.nanoTime();
	 
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			treeSet.add(new Conta(x,i,"Banco "+i));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet:      " + duration);
	 
	 
	 
	 
		// start time
		startTime = System.nanoTime();
	 
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			hashtable.put("Banco "+i,new Conta(x,i,"Banco "+i));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("hashtable:    " + duration);
	 
	}
}
