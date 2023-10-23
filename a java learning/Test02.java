class Test02 {
	static int count;

	public Test02() {
		count++;
	}

	public static void main(String[] args) {
		String s = new String("abs");
		String s1 = "abs";
		String s2 = new String("abs");
		String s3 = "abs";
		String s4 = s.concat(s1);
		String s5 = s2.concat(s3);
		System.out.println(s4 == s5);// false
		System.out.println(s1 == s3);
		System.out.println(s4.equals(s5));

		System.out.println(Test02.count);
	}
}