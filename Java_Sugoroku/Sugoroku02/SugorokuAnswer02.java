package Sugoroku02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Daisuke Kusuda
 * Playerクラス：すごろくのプレイヤー情報格納
 */
class Player {
	// フィールド変数 String name:名前、 int num:進んだマス
	public String name;
	public int num;

	/**
	 * コンストラクタ フィールド変数nameとnumを初期化
	 * @param name プレイヤー名
	 */
	Player(String name) {
		this.name = "Player" + name;
		this.num = 0;
	}

	/**
	 * String引数をフィールド変数に代入するsetメソッド
	 * @param name プレイヤー名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * フィールド変数nameを戻すメソッドgetメソッド
	 * @return String プレイヤー名を戻す
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 進んだコマ数(int型)をフィールド変数に加えるメソッド
	 * @param num 現在のコマ数
	 */
	public void addNum(int num) {
		this.num += num;
	}

	/**
	 * 現在までに進んだコマ数（フィールド変数num）を戻すgetメソッド
	 * @return int 現在のコマ数
	 */
	public int getNum() {
		return this.num;
	}
}

/**
 * @author Daisuke Kusuda
 * SugorokuAnswer02クラス:すごろくを実行するクラス
 */
public class SugorokuAnswer02 {
	// Playerクラスを格納するListを生成
	List<Player> playerList = new ArrayList<Player>();
	// GOALまでのマス数を定義
	int GOAL;
	// サイコロを振った数を定義
	static int count = 0;

	/**
	 * エントリーポイント(mainメソッド)
	 * @param args String[] エントリーポイント
	 */
	public static void main(String[] args) {
		try {
			// 参加プレイヤーを表示
			System.out.printf("参加するプレイヤーの人数してください:");
			//BufferReaderを生成
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			// 参加人数を入力：Stringからintに型変更
			String input = br.readLine();
			int playerNum = Integer.parseInt(input);
			
			// SugorokuAnswer01を生成
			SugorokuAnswer02 sugo = new SugorokuAnswer02();
			
			// 参加人数だけPlayerクラスを生成しplaerListに生成
			for (int i = 0; i < playerNum; i++) {
				sugo.playerList.add(new Player(String.valueOf(i + 1)));
			}
			
			// ゴールまでのマスの数を定義：マス数を入力しGOALに代入（初期化）
			System.out.printf("ゴールまでのマスの数:");
			input = br.readLine();
			sugo.GOAL = Integer.parseInt(input);
			System.out.println("");
			
			// idEnd：whileのフラグ管理
			int isEnd = 0;
			// isEndが0かつinput(参加人数)がqでないとき：true
			while (isEnd == 0 && !input.equals("q")) {
				// sugoroku()メソッドを実行しfinish(終了フラグ)を受け取る：finish=0 or =1
				isEnd = sugo.sugoroku();
				// GOAL前に終了するときは"q"を入力
				System.out.printf("終了する場合は q を入力してください:");
				input = br.readLine();
				System.out.println("");
				// ゲーム数をカウント
				count++;
			}
			// ゴールに近いplayerインスタンス順にplayerListの順番を並べ替え
			for (int i = 0; i < sugo.playerList.size() - 1; i++) {
				for (int j = 0; j < sugo.playerList.size() - 1; j++) {
					// j番目とj+1番目のコマ数を比較しj+1のほうが大きければ順番を並べ替え
					if (sugo.playerList.get(j).getNum() < sugo.playerList.get(j + 1).getNum()) {
						// 一時的に代入するplyaerインスタンスを生成
						Player temp = new Player("temp");
						// 入れ替えるplayerインスタンスをtempに代入
						temp = sugo.playerList.get(j);
						// j番目にj+1番目のインスタンスを代入
						sugo.playerList.set(j, sugo.playerList.get(j + 1));
						// j+1番目にj番目のインスタンスを代入
						sugo.playerList.set(j + 1, temp);
					}
				}
			}
			
			// 順位を発表する
			System.out.println("順位発表");
			// 進んだコマ数が大きい順に順位とplayer名とマスを表示
			for (int i = 0; i < playerNum; i++) {
				System.out.println((i + 1) + "位:" + sugo.playerList.get(i).getName() + ","
						+ sugo.playerList.get(i).getNum() + "マス");
			}
		} catch (Exception e) { // 例外処理が発生したらcatch
			System.out.println("例外：" + e);
		}
	}

	/**
	 * サイコロを降る前のコマ数から進んだコマ数を足し
	 * 現在情報（playerインスタンスの名前とコマ数）を表示し、終了フラグを管理するメソッド
	 * @return int 終了フラグfinishの値 0:sugorokuメソッドを繰り返す, 1:すごろくメソッド終了
	 */
	public int sugoroku() {
		int finish = 0;
		for (int i = 0; i < playerList.size(); i++) {
			// サイコロを降る前のコマ数から各playerインスタンスが進んだコマ数を足す
			playerList.get(i).addNum(saikoro());
			// playerインスタンスの名前と現在のコマ数を表示
			System.out.println(playerList.get(i).getName() + " は " + playerList.get(i).getNum() + " まで進みました ");
			// 進んだコマ数がGOALのコマ数を過ぎたらfinish=1(終了フラグ)
			if (playerList.get(i).getNum() >= GOAL) {
				finish = 1;
			}
		}
		return finish;
	}

	/**
	 * サイコロの目をint型で戻すメソッド
	 * @return int サイコロの目(1~6の乱数)
	 */
	public int saikoro() {
		// Randomインスタンスを生成し乱数を戻す
		Random r = new Random();
		int random = r.nextInt(6) + 1;
		return random;
	}
}