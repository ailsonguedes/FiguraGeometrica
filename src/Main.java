import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		
		Retangulo retangulo = new Retangulo();
		Triangulo triangulo = new Triangulo();
		Circulo circulo = new Circulo();
		
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
