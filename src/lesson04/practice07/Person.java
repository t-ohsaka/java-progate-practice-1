class Person {
    private String name;
    private String place;

    public Person(String name) {
        this.name = name;
        this.place = "東京";
    }

    // コンストラクタをオーバーロードし、引数を2つ受け取るコンストラクタを定義する
    
    public void printData() {
        System.out.println("私は" + name + "です。" + place + "に住んでいます")
    }
}


// コンストラクタを追加する
// String型のnameと、String型のplaceを受け取るコンストラクタ
// コンストラクタ内でインスタンス変数のplaceに受け取ったplaceを代入する

