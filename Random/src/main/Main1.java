package main;

import java.util.Random;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		int count = 0;
		Random rand = new Random();
		int rnd = rand.nextInt(1000);
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		System.out.println(rnd);
		while (true) {

			count++;
			System.out.println("Ədədi daxil edin");
			int x = scanner.nextInt();
			if (count > 4)
				money = ((count-4)*100)+money;
			if (rnd < x) {
				System.out.println("Böyük ədəd daxil etdiniz");
			} else if (rnd > x) {
				System.out.println("Kiçik ədəd daxil etdiniz");
			} else {
				if (count == 1) {
					System.out.println("Tebrikler ilk cehdinizi tapdiniz 1000man qazandiniz");
				} else if (count == 2) {
					System.out.println("Tebrikler " + count + "-ci  cehdinizi tapdiniz 500man qazandiniz");
				} else if (count == 3) {
					System.out.println("Tebrikler " + count + "-ci cehdinizi tapdiniz 100man qazandiniz");
				} else if (count == 4) {
					System.out.println("Təbriklər. Ədədi" + count + "-ci cəhdinizdə tapdınız." + money + "man borclusunuz");

				} else {

					System.out.println("ededi " + count + " -ci cehdinizde tapdiniz. " + money + "man borclusunuz");
				}
				break;
			}
		}
	}

}