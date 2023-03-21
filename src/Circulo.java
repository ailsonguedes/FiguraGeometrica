public class Circulo extends FiguraGeometrica {
	
	private double pi = 3.14;
	private double raio;
	
	public String getNome(){
		return "Ciruclo";
	}
	
	public String getDescricao(){
		return getNome() + ": Pi= "+getPi()+ " e Raio="+getRaio() ;
	}
	
	public double getArea(){
		return getPi() * Math.pow(getRaio(), 2);
	}
	
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}

}
