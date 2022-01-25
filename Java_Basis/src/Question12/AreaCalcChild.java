package Question12;

public class AreaCalcChild implements AreaCalc {
	// sankakuメソッド（下記shikakuを2で除算）
	public int sankaku(int a, int b) {
		return shikaku(a, b) / 2;
	}

	// shikakuメソッド（2つの数字の積）
	public int shikaku(int a, int b) {
		return a * b;
	}
}
