package custom.Objects;

public class Retangulo implements FiguraGeometrica {

	private double base;	
	private double altura;
	
	public Retangulo(double base, double altura){
		setBase(base);
		setAltura(altura);
	}
	
	/*<--------------------------------------------------------------------------------------->*/
	
	@Override
	public double getArea() {
		return this.base * this.altura;
	}
	
	public double getPerimetro(){
		return (2 * this.base) + (2* this.altura);
	}
	
	public double getDiagonal(){
		return Math.pow(Math.pow(this.base,2) + Math.pow(this.altura, 2), -2);
	}

	/*<--------------------------------------------------------------------------------------->*/
		
	public double getBase() {
		return this.base;
	}

	public void setBase(double base) {
		if (base > 0)
			this.base = base;
		else this.base = 1;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura > 0)
			this.altura = altura;
		else this.base = 1;
	}
}