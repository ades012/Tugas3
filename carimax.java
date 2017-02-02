class CariMax {
	public static void main (String[] args) {
		int angka1 = 10;
		int angka2 = 20;
		int angka3 = 30;

		int max = 0;

		max = angka1 >= max ? angka1 : max;
		max = angka2 >= max ? angka2 : max;
		max = angka3 >= max ? angka3 : max;

		System.out.println("Angka terbesar : "+max);
	}
}
