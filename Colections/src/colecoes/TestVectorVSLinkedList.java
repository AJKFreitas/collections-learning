package colecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

import objetos.Conta;

public class TestVectorVSLinkedList {

	private static final int QUANTIDADE = 100000;
	
	public static void testar() {
		LinkedList<Conta> linkedList = new LinkedList<Conta>();
		Vector<Conta> vector = new Vector<Conta>();

		// ArrayList add
		long startTime = System.nanoTime();

		for (int i = 0; i < QUANTIDADE; i++) {
			 
			linkedList.add(new Conta(100+i, i));
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("linkedList add:" + duration);

		// LinkedList add
		startTime = System.nanoTime();

		for (int i = 0; i < QUANTIDADE; i++) {
			vector.add(new Conta(100+i, i));
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Vector     add:" + duration);

		// ArrayList get
		startTime = System.nanoTime();

		for (int i = 0; i < QUANTIDADE; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("linkedList get:" + duration);

		// LinkedList get
		startTime = System.nanoTime();

		for (int i = 0; i < QUANTIDADE; i++) {
			vector.get(i);
		}
		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Vector     get:" + duration);

		// ArrayList remove
		startTime = System.nanoTime();

		for (int i = QUANTIDADE -1; i >= 0; i--) {
			linkedList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("linkedList remove:" + duration);

		// LinkedList remove
		startTime = System.nanoTime();

		for (int i = QUANTIDADE-1; i >= 0; i--) {
			vector.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Vector     remove:" + duration);

	}
}
