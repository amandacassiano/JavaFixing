
public class TetseSistema {
	
	public static void main(String[] args) {
		Supervisor s = new Supervisor();
		s.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(s);
	}

}
