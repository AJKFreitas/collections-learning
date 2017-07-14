package excecoes;

public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
		catchArithmeticException();
		metodo1();
	}
	
	public static void metodo2() {
		System.out.println("executando o metodo 2");
		catchArithmeticException();
		try {
			main(null);
		} catch (StackOverflowError e) {
			System.out.println("\n Stack Over Flow");
		}finally {
			System.out.println(metodo3());
			
		}
		
	}
	private static String metodo3() {
		String resposta = "erro!";
		return resposta;
	}

	public static void metodo1() {
		System.out.println("execultando o metodo 1");
		metodo2();
	}
	private static void catchArithmeticException() {
		try {
			int value = 15;
			int divideByZero = value / 0;
			System.out.println("Result of division by zero is: "+ divideByZero);
		} catch (ArithmeticException e) {
			System.out.println("Exception occurred is:"+e.getLocalizedMessage());
		}
	}

}
