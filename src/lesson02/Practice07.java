package lesson02;

class Practice07 {
    public static void main(String[] args) {
        int number = 13;
        
        // defaultを用いて、どのcaseにも合致しない場合の処理を記述してください
        switch (number % 5) {
            case 0:
                System.out.println("大吉です");
                break;
            case 1:
                System.out.println("中吉です");
                break;
            case 4:
                System.out.println("凶です");
                break;
            
        }
    }
}

/* 手順
 * 1. defaultを使い、「吉です」と出力させる
 * 2. numberの値を13以外に変更し、出力の変化を確認する
 */
