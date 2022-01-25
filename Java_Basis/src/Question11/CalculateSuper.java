package Question11;

public class CalculateSuper {
	// フィールド値
	protected int param1;
	protected int param2;

	// コンストラクタ
	protected CalculateSuper(int param1, int param2) {
		this.param1 = param1;
		this.param2 = param2;
	}

	// sum()とsub()メソッド実行
	protected void flow() {
		sum();
		sub();
	}

	// 足し算結果出力
	protected void sum() {
		System.out.println(param1 + "と" + param2 + "足すと" + (param1 + param2));
	}

	// 引き算結果出力
	protected void sub() {
		System.out.println(param1 + "と" + param2 + "引くと" + (param1 - param2));
	}
}
