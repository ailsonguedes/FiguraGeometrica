import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner ln = new Scanner(System.in);
		
		double rbase;
		double raltura;
		double tbase;
		double taltura;
		double craio;
		
		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();
		Circulo circulo = new Circulo();
		
		System.out.println("Dados do Retangulo:");
		
		System.out.print("Digite o valor da base do Retangulo: ");
		rbase = ln.nextDouble();
		System.out.print("Digite o valor da altura do Retangulo: ");
		raltura = ln.nextDouble();
		
		retangulo.setBase(rbase);
		retangulo.setAltura(raltura);
		
		retangulo.setBase(rbase);
		retangulo.setAltura(raltura);
		
		System.out.println("");
		System.out.println("Dados do Triangulo:");
		
		System.out.print("Digite o valor da base do triangulo: ");
		tbase = ln.nextDouble();
		System.out.print("Digite o valor da altura do triangulo: ");
		taltura = ln.nextDouble();
		
		triangulo.setBase(tbase);
		triangulo.setAltura(taltura);
		
		System.out.println("");
		System.out.println("Dados do Circulo:");
		
		System.out.print("Digite o valor da raio do circulo: ");
		craio = ln.nextDouble();
		
		circulo.setRaio(craio);
		
		
		System.out.println("");
		System.out.println("Resultados");
	    // Adiciona as figuras geometricas em uma lista
	    List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>() ;
	    listaFigurasGeometricas.add( retangulo );   
	    listaFigurasGeometricas.add( triangulo );
	    listaFigurasGeometricas.add( circulo );
	    
	    // Mostra dados das figuras geometricas
	    for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
	        System.out.println( figuraGeometrica.getDescricao() );
	        System.out.printf( "Area da figura: %.2f \n", figuraGeometrica.getArea() );
	    }
		
	}

}
