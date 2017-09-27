package custom.Objects;

public class TrianguloRetangulo implements FiguraGeometrica {

	double base;
	double altura;
	double hipotenusa;

	public TrianguloRetangulo(double base, double altura){
		setBase(base);
		setAltura(altura);
		setHipotenusa();
	}	

	@Override
	public double getArea() {
		return (base * altura) / 2;
	}

	public double getPerimetro(){
		return this.base + this.altura + this.hipotenusa;
	}

	/*<--------------------------------------------------------------------------------------->*/

	public double getBase() {
		return base;
	}

	public void setBase(double lado) {
		if (lado > 0)
			this.base = lado;
		else this.base = 1;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double lado) {
		if (lado > 0)
			this.altura = lado;
		else this.base = 1;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	private void setHipotenusa() {
		this.hipotenusa = Math.pow(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2), -2);
	}
}