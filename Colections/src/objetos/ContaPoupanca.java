package objetos;

import utils.ClasseNaoExisteException;
import utils.SaldoInsuficienteException;

public class ContaPoupanca extends Conta implements Comparable<Conta> {

	private Integer numero;
	private String nome;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String string) {
		this.nome = string;
	}

	
	 @Override
	public void saca(int valor) throws SaldoInsuficienteException  {
		super.saca(valor);
			try {
				if (valor > 100)
				throw new ClasseNaoExisteException("Classe não existe");
			} catch (ClasseNaoExisteException e) {
				e.printStackTrace();
			}
		}


	public int compareTo(ContaPoupanca o) {
	
	 if( Integer.compare(this.numero, o.numero) < 0 && (String.CASE_INSENSITIVE_ORDER.compare(this.nome, o.nome) < 0)){
		 return -1;
	 }
	 if( Integer.compare(this.numero, o.numero) < 0 && (String.CASE_INSENSITIVE_ORDER.compare(this.nome, o.nome) > 0)){
		 return -1;
	 }
	 if( Integer.compare(this.numero, o.numero) < 0 && (String.CASE_INSENSITIVE_ORDER.compare(this.nome, o.nome) == 0)){
		 return -1;
	 }
	 
	 
	 if( Integer.compare(this.numero, o.numero) > 0 && (String.CASE_INSENSITIVE_ORDER.compare(this.nome, o.nome) > 0)){
		 return 1;
	 }
	 if( Integer.compare(this.numero, o.numero) > 0 && (String.CASE_INSENSITIVE_ORDER.compare(this.nome, o.nome) < 0)){
		 return 1;
	 }
	 if( Integer.compare(this.numero, o.numero) > 0 && (String.CASE_INSENSITIVE_ORDER.compare(this.nome, o.nome) == 0)){
		 return 1;
	 }
	 
	 
	 if( Integer.compare(this.numero, o.numero) == 0 && (String.CASE_INSENSITIVE_ORDER.compare(this.nome, o.nome) > 0)){
		 return 1;
	 }
	 if( Integer.compare(this.numero, o.numero) == 0 && (String.CASE_INSENSITIVE_ORDER.compare(this.nome, o.nome) < 0)){
		 return -1;
	 }
	 	 
	 return 0;
	 }



	@Override
	public String toString() {
		
		return "\n " + this.numero.toString() + " - " + this.nome ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaPoupanca other = (ContaPoupanca) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}
	
	

}
