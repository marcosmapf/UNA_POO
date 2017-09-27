package custom.Objects;

public class Circulo implements FiguraGeometrica{

	double raio;
	
	public Circulo(double raio){
		setRaio(raio);
	}
	
	/*<--------------------------------------------------------------------------------------->*/

	@Override	
	public double getArea() {
		return Math.pow(this.raio, 2) * Math.PI;
	}
	
	public double getDiametro(){
		return this.raio * 2;		
	}
	
	public double getCircunferencia(){
		return 2 * Math.PI * this.raio;
	}
	
	/*<--------------------------------------------------------------------------------------->*/

	public double getRaio(){
		return this.raio;
	}
	
	public void setRaio(double raio){
		if (raio > 0)
			this.raio = raio;
		else raio = 1;		
	}
}