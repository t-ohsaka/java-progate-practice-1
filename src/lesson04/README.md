## クラスの定義

```java
class クラス名 {
    ...
}
```

例）FileReaderクラスを定義

```java
class FileReader {
    ...
}
```

## インスタンスの生成

```java
new クラス名();
```

例）FileReaderクラスのインスタンスを生成

```java
new FileReader();

// インスタンスを変数に代入
FileReader fr = new FileReader();
```

## インスタンスメソッド

インスタンスに紐づくメソッド

例）publicな`read`メソッド、privateな`nextLine`メソッド

```java
class FileReader {
    public String read() {
        ...
    }

    private void nextLine() {
        ...
    }
}
```

## インスタンス変数

クラス内に定義する。インスタンスごとに生成される

```java
class FileReader {
    private String path;
    public String fileName;
}
```

## this

そのメソッドを呼び出しているインスタンスに置き換えて実行される

```java
class FileReader {
    private String path;

    public String getPath() {
        return this.path;
    }

    public void setPath(String value) {
        path = value;
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        FileReader fr1 = new FileReader();
        FileReader fr2 = new FileReader();

        fr1.setPath("C:\sample\hoge.txt");
        fr2.setPath("C:\sample\fuga.txt");

        System.out.println(fr1.getPath());   // C:\sample\hoge.txt
        System.out.println(fr2.getPath());   // C:\sample\fuga.txt
    }
}
```

setter、getterでよく使われる。

```java
class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
```

## コンストラクタ

インスタンス生成時に自動で呼び出されるメソッド

```java
// この時に呼び出される
new FileReader();
```

### コンストラクタの定義の仕方

以下のようなメソッドを定義すると、それがコンストラクタになる

- クラス名と一致させる
- 戻り値は書かない(`void`も書かない)

インスタンス変数への代入をコンストラクタで行うことが多い

```java
class FileReader {
    private String path;

    // コンストラクタ
    public FileReader(String path) {
        this.path = path;
    }
}
```

```java
class Main {
    public static void main(String[] args) {
        FileReader fr = new FileReader("C:\sample\hoge.txt");
        ...
    }
}
```

### コンストラクタのオーバーロード

引数の個数や種類を変えて、インスタンスを生成したい時があるため、いつくかコンストラクタを定義しておくことができる。

```java
// String型の引数が1つのみ
FileReader fr1 = new FileReader("C:\sample\hoge.txt")

// String型の引数が2つ
FileReader fr1 = new FileReader("C:\sample\hoge.txt", "utf-8")
```

複数コンストラクタを定義する

```java
class FileReader {
    public FileReader(String path) {
        ...
    }

    public FileReader(String path, String encoding) {
        ...
    }
}
```

コンストラクタをオーバーライドすることで、新しくクラスを作らなくてもよくなる（コンストラクタの引数が違うだけのクラスを何個も作らなくてもよくなる）

### コンストラクタから別のコンストラクタを呼び出す

コンストラクタ内から`this()`を使うことで、別のコンストラクタを呼び出すことができる。  
また、コンストラクタの最初の行にしか記述できない

```java
class FileReader {
    private String path;
    private String encoding;

    public FileReader(String path) {
        // これの場合、encoding には utf-8 が渡される
        this(path, "utf-8");
    }

    public FileReader(String path, String encoding) {
        this.path = path;
        this.encoding = encoding;
    }
}
```

```java
// String型の引数が1つのみ
FileReader fr1 = new FileReader("C:\sample\hoge.txt")

// String型の引数が2つ
FileReader fr1 = new FileReader("C:\sample\hoge.txt", "sjis")
```

参考サイト：[【Java】 コンストラクタって何？ this( )の意味 | 一番かんたんなJava入門](https://nobuo-create.net/java-beginner-20/)


## クラス変数、クラスメソッド

クラスごとに１つずつしかない

インスタンスで共通の変数

`static`をつける

```java
class StringUtil {
    public static String reverse(String val) {
        ...
    }
}
```

共通処理のクラスとかに使う。インスタンスを生成していなくても(newしなくても)使えるため、便利

```java
class Main
    public static void main(String[] args) {
        StringUtil.reverse("aiueo");
    }
}
```

クラスメソッドから、インスタンス変数へのアクセスはできない。  
→クラスメソッドはインスタンスを生成しなくても呼び出せるため、インスタンス変数がない可能性がある

## 定義時の初期値

|型|初期値|
|---|---|
|参照型|null|
|byte|0|
|short|0|
|int|0|
|long|0L|
|float|0.0f|
|double|0.0d|
|char|'\u0000'|
|boolean|false|

参考サイト：[変数の初期値（Java言語仕様4.12.5） - Qiita](https://qiita.com/java-beginner/items/9fc60e3754445a57266e)
