class Restring {
	public static void main(String[] args) {
		String str = "DURGA";
		int r = 0;
		System.out.println(str.length());
		for (int y = 0; y <= str.length(); y++) {
			r = str.length() - y;
			System.out.println(r);
		}
		System.out.println(r);

	}
}