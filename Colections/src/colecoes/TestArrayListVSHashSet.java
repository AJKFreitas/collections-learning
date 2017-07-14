package colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import objetos.Conta;

public class TestArrayListVSHashSet {

	private static final int QUANTIDADE = 100000;

	public static void testar() {
		List<Conta> arrayList = new ArrayList<Conta>();
		Set<Conta> hashSet = new HashSet<Conta>(QUANTIDADE);

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
			hashSet.add(new Conta(100+i, i));
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("hashSet    add:" + duration);

		// ArrayList get
		startTime = System.nanoTime();

		for (int i = 0; i < QUANTIDADE; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList  get:" + duration);

		// HashSet get
		
		Iterator<Conta> it = hashSet.iterator(); 
		startTime = System.nanoTime();
		while (it.hasNext()) {
			it.next();
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("hashSet    get:" + duration);

		// ArrayList remove
		startTime = System.nanoTime();

		for (int i = QUANTIDADE -1; i >= 0; i--) {
			arrayList.remove(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList  remove:" + duration);

		// HashSet remove
		startTime = System.nanoTime();
		while (it.hasNext()) {
			it.remove();
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("hashSet    remove:" + duration);
		while (it.hasNext()) {
			System.out.println(it.next()+"a");
		}
	}
}
