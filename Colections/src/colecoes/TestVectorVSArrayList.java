package colecoes;

import java.util.ArrayList;
import java.util.Vector;

import objetos.Conta;

public class TestVectorVSArrayList {

	private static final int QUANTIDADE = 100000;

	public static void testar() {
		ArrayList<Conta> arrayList = new ArrayList<Conta>();
		Vector<Conta> vector = new Vector<Conta>();

		// ArrayList add
		long startTime = System.nanoTime();

		for (int i = 0; i < QUANTIDADE; i++) {
			 
			arrayList.add(new Conta(100+i, i));
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("ArrayList  add:" + duration);

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
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList  get:" + duration);

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
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList  remove:" + duration);

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
