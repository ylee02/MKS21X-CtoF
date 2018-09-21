public class CtoFTester {
	public static double CtoF(int c) {
		return c * 1.8 + 32;
	}
	public static double FtoC(int f) {
		return (f - 32) / 1.8;
	}
	public static void main(String[] args) {
		System.out.println(CtoF(100));
		System.out.println(FtoC(32));
	}
}