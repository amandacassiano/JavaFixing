//n�o pode instanciar essa classe, visto que � abstrata
public abstract class Colaborador {
		private String nome;
		private String cpf;
		protected double salario;
		
		
		public abstract double getComissao();//metodo sem corpo
//Podemos criar getters sem um atributo" 
		
		public String getNome() {			
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getCpf() {
			return cpf;
		}
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		public double getSalario() {
			return salario;
		}
		
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
	}


