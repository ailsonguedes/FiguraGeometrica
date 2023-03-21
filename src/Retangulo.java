
public class Retangulo extends FiguraGeometrica{
	
	private double base;
	private double altura;
	
	public String getNome(){
		return "Retangulo";
	}
	
	public String getDescricao(){
		return getNome() + ": Base= "+getBase()+ " e Altura="+getAltura() ;
	}
	
	public double getArea(){
		return getBase() * getAltura();
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
