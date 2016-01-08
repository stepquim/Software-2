package ec.edu.espol;

public class CalService {
	
	ICalculator cal;
	
	public int AddTwoNumbers(int x, int y){
		return cal.add(x,y);
		
	}
	
	//GET & SET
int b;
	public ICalculator getCal() {
		return cal;
	}
;

	public void setCal(ICalculator cal) {
		this.cal = cal;
	}
{}
}
