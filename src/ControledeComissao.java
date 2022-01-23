
public class ControledeComissao {
 
	private double soma;
  
  public void registra(Supervisor s2) {
	  double comissao = s2.getComissao();
	  this.soma = this.soma + comissao;
  }
  
  public void registra (Colaborador c) {
	  double comissao = c.getComissao();
	  this.soma = this.soma + comissao;
  }
	  public void registra(EditordeVideo edv) {
		  double comissao = edv.getComissao();
		  this.soma = this.soma + comissao;
	  
  }
  
  public double getSoma() {
	  return soma;
  }
}
// classe para setor de controle de comissoes da empresa
//criar  objeto soma no teste ref.
//crie metodo para soma nesta classe
//faça imprimir 