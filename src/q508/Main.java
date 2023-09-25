package q508;

public class Main {

	public static void main(String[] args) {
		System.out.println(
		"      item     count     price\r\n" 
		+ "       pen        20       100\r\n"
		+ "      note         5        95\r\n" 
		+ "    eraser       110        97");
		
		System.out.println("------------------------------------------------------------------");

		String a = "      item     count     price";
		String b = "       pen        20       100";
		String c = "      note         5        95";
		String d = "    eraser       110        97";
		System.out.print(a + "\n" + b + "\n" + c + "\n" + d + "\n");

		System.out.println("------------------------------------------------------------------");
		
		
		String x, y, z;
		x = "item";
		y = "count";
		z = "price";
		String xx, yy, zz;
		xx = "note";
		yy = "5";
		zz = "95";
		int yyi, zzi;
		yyi = 5;
		zzi = 95;
		System.out.printf("%10s%10s%10s\n", x, y, z);
		System.out.printf("%10s%10d%10d\n", xx, yyi, zzi);
		
		System.out.println("------------------------------------------------------------------");

		String[] ar = { "item", "count", "price", "pen", "20", "100", "note", " 5", "95", "eraser", "110", "97" };
		for (int i = 0; i < ar.length; i++) {
			if (i % 3 == 0 && i !=0) {
				System.out.println("");
			}
			System.out.printf("%10s", ar[i]);

		}

	}

}
