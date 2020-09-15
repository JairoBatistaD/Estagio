
public class Funcionario extends Pessoa {
	private float salarioInicial = 1000;
	private float salarioFinal;
	private float parcial;
	
	public Funcionario() {
		this.salarioInicial(salarioInicial);
		this.calculo(salarioInicial);
		System.out.print("Nome"+this.nome+"RG "+this.RG+" Salario Inical"+this.getSalarioInicial()+" Salario Final"+this.getSalarioFinal());
	}
	
	public void salarioInicial(float v) {
		this.getSalarioInicial();
	
	}
	
	public void calculo(float v) {
	float aux = this.getSalarioInicial()*1.5f/100;
	float ano2017 = this.getSalarioInicial()+aux;
	float aux2 = ano2017 * 3.0f/100;
	float ano2018 = ano2017+aux2;
	float aux3 = ano2018 * 6.0f/100;
	float ano2019 = ano2018+aux3;
	float aux4 = ano2019*12f/100;
	float ano2020 = ano2019+aux4;
	
	this.setSalarioFinal(ano2020);

		
		
	}
	public float getSalarioInicial() {
		return salarioInicial;
	}
	public void setSalarioInicial(float salarioInicial) {
		this.salarioInicial = salarioInicial;
	}
	public float getSalarioFinal() {
		return salarioFinal;
	}
	public void setSalarioFinal(float salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	public float getParcial() {
		return parcial;
	}
	public void setParcial(float parcial) {
		this.parcial = parcial;
	}
}
