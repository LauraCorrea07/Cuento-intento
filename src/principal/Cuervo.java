package principal;

public class Cuervo {

    static boolean empujar;
	
	public static boolean empujarJarra(int PESO_JARRA_INICIAL) {
		if(PESO_JARRA_INICIAL != 6) {
			empujar = true;
		}else{
			empujar = false;
		}
		return(empujar);
	} 
}
