
public class Supervisor extends Colaborador{
		
		private int senha;
		
		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		public boolean autentica(int senha) {
			if(this.senha == senha) {
				return true;
			}else {
						

				
				return false;
			}
		}
//como preciso pegar esse metodo salario, e ele é privado
//nele substituirei o metodo private por protected
		
		public double getComissao() {
			return (this.salario * 0.1) + super.salario;
		}
//para indicar que o supervisor herda tudo de funcionario, vou adicionar o extends, pois o gerente é um funcionario
		
		
		
	}


