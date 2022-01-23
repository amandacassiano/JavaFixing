
public class TesteColaboradores {

	public static void main(String[] args) {
		Colaborador amanda = new Supervisor();
		amanda.setNome("Amanda Cassiano");
		amanda.setCpf("334455669-4");
		amanda.setSalario(1000.00);
		
		System.out.println(amanda.getNome());
		System.out.println(amanda.getComissao());
		
		//amanda.salario = 1000.0;
	}

}
