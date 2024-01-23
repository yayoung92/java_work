package japangi;

import java.util.Scanner;

public class Japangi {
	public static void main(String[] args) {
		boolean check = true;
		Drink d = new Drink();
		Coin m = new Coin();

		Scanner scan = new Scanner(System.in);

		stop: while (check) {
			System.out.println("======= 골라보렴 자판기 =======");
			System.out.println("1.돈 넣기 , 2.그냥 안 먹을래");
			int a = scan.nextInt();
			System.out.println();

			switch (a) {
			case 1:
				System.out.println(" \\ 돈 넣어죵 : ");
				m.setCoin(scan.nextInt());

				if (m.getCoin() < d.getW()) {
					System.out.println("돈이 너무 부족할걸?");
					System.out.println();

				} else if (m.getCoin() >= d.getW()) {
					System.out.println("뭐 먹을랭??? 골라골라골라");
					System.out.println("1.콜라:500원  2.환타:300원  3.물:100원");
					int number = scan.nextInt();

					switch (number) {
					case 1:
						if (m.getCoin() >= d.getC()) {
							System.out.println("구매 성공! 여깄어 콜라~_~");
							m.coin = m.coin - d.c;
							System.out.println("잔돈은 돌려줄게 : " + m.getCoin());
						} else
							System.out.println("돈이 부족해!");
						break stop;
					case 2:
						if (m.getCoin() >= d.getH()) {
							System.out.println("구매 성공! 여깄어 환타~_~");
							m.coin = m.coin - d.h;
							System.out.println("잔돈은 돌려줄게 : " + m.getCoin());
						} else
							System.out.println("돈이 부족해!");
						break stop;
					case 3:
						if (m.getCoin() >= d.getW()) {
							System.out.println("구매 성공! 여깄어 물~_~");
							m.coin = m.coin - d.w;
							System.out.println("잔돈은 돌려줄게 : " + m.getCoin());
						} else
							System.out.println("돈이 부족해!");
						break stop;
					default:
						if (m.getCoin() < d.w) {
							System.out.println("최선이야?");
						}

						break;
					}
				}
				break;
			case 2:
				System.out.println("잘 가");
				break stop;
			}
		}
	}
}

class Coin {
	public int coin;

	Coin() {

	}

	Coin(int coin) {
		this.coin = coin;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	@Override
	public String toString() {
		return "Coin [coin=" + coin + "]";
	}

}

class Drink {
	int c = 500;
	int h = 300;
	int w = 100;
	
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}

}