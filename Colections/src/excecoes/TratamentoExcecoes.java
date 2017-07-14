package excecoes;

public class TratamentoExcecoes {
	public static void main(String[] args) {
		try {
			Class<?> objClass = Class.forName("java.lang.Integer");
			System.out.println("Simple Name: " + objClass.getSimpleName());
			System.out.println("Class Name: " + objClass.getName());
			System.out.println("Class Package: " + objClass.getPackage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
