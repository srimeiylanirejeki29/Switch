
public class Makanan {
	public class Switchcase {
		public static void main(String[] args) {
			int harga = 50000;
			switch (harga) {
			case 100000 :
				System.out.println ("Makanan anda yaitu Sate Maranggi");
				break;
			case 20000 :
				System.out.println ("Makanan anda yaitu Nasi Goreng");
				break;
			case 23000 :
				System.out.println ("Makanan anda yaitu Me tektek");
				break;
			case 15000 :
				System.out.println ("Makanan anda yaitu Soto Lamongan");
				break;
			case 50000 :
				System.out.println ("Makanan anda yaitu Bakso Super");
				break;
			default :
				System.out.println ("Tidak ada harga menu makanan");
			}

		}
	}
}
