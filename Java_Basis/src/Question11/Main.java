package Question11;

public class Main {
	public static void main(String[] args) {
		// CalculateSuper,CalculateChild生成
		CalculateSuper calculateSuper = new CalculateSuper(5, 3);
		CalculateChild calculateChild = new CalculateChild(10, 7);

		// Superクラスのflow(足し算→引き算)出力
		calculateSuper.flow();

		// childクラスのflow(引き算→足し算)出力
		calculateChild.flow();
	}
}
