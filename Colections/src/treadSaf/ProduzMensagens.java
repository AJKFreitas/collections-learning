package treadSaf;

import java.util.Collection;

public class ProduzMensagens implements Runnable{
	
	private int inicio;
	  private int fim;
	  private Collection<String> mensagens;

	  public ProduzMensagens(int inicio, int fim, Collection<String> mensagens) {
	    this.inicio = inicio;
	    this.fim = fim;
	    this.mensagens = mensagens;
	  }

	  public void run() {
	    for (int i = inicio; i < fim; i++) {
	      mensagens.add("Mensagem " + i);
	    }
	  }
	  
//	  public void run() {
//		  for (int i = inicio; i < fim; i++) {
//		    synchronized (mensagens) {
//		      mensagens.add("Mensagem " + i);
//		    }
//		  }
//		}

}
