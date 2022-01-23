
public class TesteSupervisor {
	public static void main(String[] args) {
		Supervisor s1 = new Supervisor();
		s1.setNome("Amanda");
		s1.setCpf("554466899");
		s1.setSalario(4000.0);
		
		System.out.println(s1.getNome());
		System.out.println(s1.getCpf());
		System.out.println(s1.getSalario());
		
		s1.setSenha(5555);
		boolean autenticou = s1.autentica(5555);
		
		System.out.println(autenticou);
//devolve false pq não informei senha nenhuma, então o java entende e inicializa como 0
	}
//construtor padrao
}
