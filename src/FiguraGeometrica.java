public class FiguraGeometrica {
	
	private String nome;
	
	public double getArea(){
		return 0;		
	}
	
	public String getDescricao(){
		return getNome() + ": base= " + " altura= ";
	}
	
	public void setDescricao(String descricao){
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
