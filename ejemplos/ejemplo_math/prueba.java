public class prueba {
	static {
		System.loadLibrary("math");
	}

	public static void main(String argv[]) {
		System.out.println(swig.math.pow(2,10));
	}
}
