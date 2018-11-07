package lesson04.practice09;

class Person {
    private String name;
    private String place;

    public Person(String name) {
        this(name, "東京");
    }

    public Person(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public void printData() {
        System.out.println("私は" + name + "です。" + place + "に住んでいます");
    }

    // nameのgetterを定義
}

