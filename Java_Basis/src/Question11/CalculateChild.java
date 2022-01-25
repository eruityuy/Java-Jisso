package Question11;

public class CalculateChild extends CalculateSuper {

	// コンストラクタ
	public CalculateChild(int param1, int param2) {
		super(param1, param2);
	}

	// flowメソッドの足し算と引き算の出力を逆転
	public void flow() {
		sub();
		sum();
	}
}
