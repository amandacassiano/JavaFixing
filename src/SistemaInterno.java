
public class SistemaInterno {
private int senha = 2222;

public void autentica (Supervisor s) {
	boolean autenticou = s.autentica(this.senha);
	if(autenticou) {
		System.out.println("Pode entrar no sis");
	}else {
		System.out.println("Não pode entrar no sis");
	}
}
}
