package lesson04.practice08;

class Main {
    public static void main(String[] args) {
        Person person1 = new Person("山田太郎");
        Person person2 = new Person("山田次郎", "千葉");

        person1.printData();
        person2.printData();
    }
}


// 出力結果
//
// 私は山田太郎です。東京に住んでいます
// 私は山田次郎です。千葉に住んでいます
