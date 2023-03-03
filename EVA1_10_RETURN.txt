package EVA1_10_RETURN;

public class EVA1_10_RETURN {

	public EVA1_10_RETURN() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square(10);
		
		int resu;
		resu = square(3);
		System.out.println(resu);
		
		System.out.println(square(5));
		
	}
	public static int square(int n) {
		return n * n;
	}

}
