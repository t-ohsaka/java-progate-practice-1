package lesson04.practice08;

class Person {
    private String name;
    private String place;

    public Person(String name) {
        // this()を使って、別のコンストラクタを呼び出す
        this.name = name;
        this.place = "東京";
    }

    public Person(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public void printData() {
        System.out.println("私は" + name + "です。" + place + "に住んでいます")
    }
}


// Person(String) 内で Person(String, String) を呼び出す
