package colecoes;

import java.util.List;
import java.util.Vector;

import objetos.Conta;

public class ImplementacaoVector  {

	List conta = new Vector<Conta>();
	
	public void testVector(){
		conta.add(0, new Conta(100, 0));
		System.out.println(conta.hashCode());
	}
}
