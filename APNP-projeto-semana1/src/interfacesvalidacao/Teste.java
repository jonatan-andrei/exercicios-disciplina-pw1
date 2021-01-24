package interfacesvalidacao;

public class Teste {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		System.out.println(a1.toString());
		Aluno a2 = new Aluno("Fulano", 200);
		System.out.println(a2.toString());
	}
}
