package excecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import objetos.Conta;
import utils.SaldoInsuficienteException;
import utils.ValorAcimaDoLimiteException;

public class Excecoes {

	public static void realizaOperação(Conta conta, int valorSaque){
		try {
			conta.saca(valorSaque);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}catch(ValorAcimaDoLimiteException v){
			System.out.println(v.getMessage());
		}
		System.out.println("Saldo disponivél R$" + conta.getSaldo() );
	}
	
	public static void main(String[] args) {
		Conta conta = new Conta();

		conta.depositar(4000);
		conta.setLimite(500);
		realizaOperação(conta, 3000);

	}

	public static class TestandoADivisao {

		public static void main(String args[]) {
			int i = 5571;
			i = i / 0;
			System.out.println("O resultado  " + i);
		}
	}

	public static class TestandoReferenciaNula {
		public static void main(String args[]) {
			Conta c = null;
			System.out.println("Saldo atual " + c.getSaldo());
		}
	}

	public static class TesteFile {
		public static void metodo() throws FileNotFoundException {
			try {
				FileInputStream fileInputStream = new java.io.FileInputStream("arquivo.txt");
				fileInputStream.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Nao foi possível abrir o arquivo para leitura");
			}
		}

		public static void main(String[] args) throws FileNotFoundException {
			metodo();
		}
	}
}
