class Co {
	public static void main(String[] args) {
		// int divisior1 = 6;
		// int divisior2 = 8;
		int count = 0;
		for (int i = 1; i <= 40; i++) {
			if (i % 6 == 0 && i % 8 == 0) {

				count++;

			}
		}
		if (count % 2 == 0) {
			System.out.println("count " + count + " is even");
		} else
			System.out.println("count " + count + " is not a even count");
	}
}