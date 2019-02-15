package expresionesregulares;


public class Expresion {
	
	public static void main(String args[]){
		String valor = "$1,037.653";
		if ( valor.matches("^\\$(((\\d{1,3},)(\\d{3},)*\\d{3})|(\\d{1,3}))\\.\\d{2}")){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
	}
}
