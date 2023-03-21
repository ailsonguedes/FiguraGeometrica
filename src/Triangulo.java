
public class Triangulo extends FiguraGeometrica{
	
	private double base;
	private double altura;
	
	public String getNome(){
		return "Triangulo";
	}
	
	public String getDescricao(){
		return getNome() + ": Base= "+getBase()+ " e Altura="+getAltura() ;
	}
	
	public double getArea(){
		return getBase() * getAltura() / 2;
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
