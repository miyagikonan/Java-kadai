import java.util.Arrays;
import java.util.Scanner;
public class ccc {
    public static void main(String[] args) {
        var h = "------------------------------";
        System.out.println(h);
        var total = 25;
        var remaining = total;

        System.out.println("石取りゲームを開始します。");
        System.out.println("石の総数：" + total + "個");
        System.out.println("一度に取れる石の数：3個");
        System.out.println(h);


        System.out.println("残り：" + total + "個");
        String[] stone = {"●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●", "●" };
        for (var i = 0; i < stone.length; i++){
            System.out.print(stone[i]);
        }
        System.out.println();
        System.out.println(h);

        for (var i = 0; i < total; i++) {
            var a = 1;
            var b = 2;
            var A = "A";
            var B = "B";
            for (var j = 0; j < 9; i++) {
                if (a % b == 0) {
                    b += 1;
                    System.out.println("プレイヤー" + B + "の番");
                    System.out.println("石の数を入力してください。（1～3まで入力可能です。）");
                    var sc = new Scanner(System.in);
                    var s2 = sc.nextLine();
                    var num1 = Integer.parseInt(s2);
                    if (1 <= num1 && num1 <= 3){
                        remaining -= num1;
                        System.out.println("残り：" + remaining + "個");
                    }


                } else {
                    a += 1;
                    System.out.println("プレイヤー" + A + "の番");
                    System.out.println("石の数を入力してください。（1～3まで入力可能です。）");
                    var sc = new Scanner(System.in);
                    var s2 = sc.nextLine();
                    var num2 = Integer.parseInt(s2);
                    if (1 <= num2 && num2 <= 3){
                        remaining -= num2;
                        System.out.println("残り：" + remaining + "個");
                    }

                }


            }

        }
    }
}
