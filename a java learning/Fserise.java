class Fserise {
	public static void main(String[] args) {
		int a = 0;
		System.out.print(a + " ");
		int b = 1;
		System.out.print(b + " ");
		int c = 10;
		for (int i = 0; i < c; i++) {
			int p = a + b;
			System.out.print(p + " ");
			a = b;
			b = p;

		}
	}
}