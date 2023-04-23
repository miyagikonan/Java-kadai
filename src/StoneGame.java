import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Scanner;
public class StoneGame {
    public static void main(String[] args) {
        var h = "------------------------------";
        System.out.println(h);


        System.out.println("石取りゲームを開始します。");
        System.out.println("石の総数：25個");
        System.out.println("一度に取れる石の数：3個");
        System.out.println(h);
        System.out.println("残り：25個");
        String[] stone = {"●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●","●"};
        for (var i = 0; i < stone.length; i++){
            System.out.print(stone[i]);
        }
        System.out.println();
        System.out.println(h);

        //プレイヤーを交互にだす
        StoneGame.Player();

    }

    //プレイヤーを交互に出し数字を出力
    public static void Player() {
        var h = "------------------------------";
        String[] stone = {"●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●"};
        var remaining = stone.length;
        var a = 1;
        var b = 2;
        while (0 < remaining) {
            if (a % b != 0) {
                a += 1;
                System.out.println("プレイヤーAの番");
                while(true) {
                    var sc = new Scanner(System.in);
                    var s2 = sc.nextLine();
                    var num1 = Integer.parseInt(s2);


                    if (1 <= num1 && num1 <= 3) {
                        remaining -= num1;
                        System.out.println("残り：" + remaining + "個");

                        for (var j = 0; j < remaining; j++) {
                            System.out.print(stone[j]);
                        }
                        if (remaining <= 1) {
                            System.out.println("勝者：プレイヤーB");
                            break;
                        }
                        System.out.println();
                        System.out.println(h);
                    }else {
                        System.out.println("1~3の間で入力してください。");
                        continue;
                    }
                    break;
                }

            } else{
            b += 1;
            System.out.println("プレイヤーBの番");
            while(true) {
                var sc = new Scanner(System.in);
                var s2 = sc.nextLine();
                var num1 = Integer.parseInt(s2);

                if (1 <= num1 && num1 <= 3) {
                    remaining -= num1;
                    System.out.println("残り：" + remaining + "個");

                    for (var j = 0; j < remaining; j++) {
                        System.out.print(stone[j]);
                    }
                    if (remaining <= 1) {
                        System.out.println("勝者：プレイヤーA");
                        break;
                    }
                    System.out.println();
                    System.out.println(h);
                }else {
                    System.out.println("1~3の間で入力してください。");
                    continue;
                }
                break;
            }

            }
        }
    }
}





