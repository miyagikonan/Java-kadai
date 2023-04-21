public class Main {
    public static void main(String[] args) {

    }
        public static int Player(int gg) {
            var a = 1;
            var b = 2;
            var A = "A";
            var B = "B";
            for (var i = 0; i < 9; i++) {
                if (a % b == 0){
                    b += 1;
                    System.out.println("プレイヤー" + B + "の番");
                }else {
                    a += 1;
                    System.out.println("プレイヤー" + A + "の番");
                }
            }
            return gg;
        }
}