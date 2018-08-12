// 配列の要素の順序を逆順に並べかえて表示

import java.util.Random;
import java.util.Scanner;

class Shuffle {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int[] a = {1,2,3,4,5};	  // 配列を宣言
		int[] c = {5,5,5,5,5};
		int flag = 0;
		for (int i = 0; i < 5; i++) {
			while(flag == 0){
				int tmp = rand.nextInt(5);
				int j = 0;
				while(tmp!=c[j]){
					if (i==j){
						flag = 1;
						c[i]=tmp;
						break;
					}
					j++;
				}
			}
			flag = 0; 
		}

		for (int i = 0; i < 5; i++){
		System.out.println("newRandom[" + i + "] = " + a[c[i]]);	
		}
	}
}
