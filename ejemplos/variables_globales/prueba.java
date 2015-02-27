public class prueba {
	static {
		System.loadLibrary("variables");
	}

	public static void main(String argv[]) {
		variables.variables_globales.setProfundidad(10);
		System.out.println(variables.variables_globales.getProfundidad());
	}
}
