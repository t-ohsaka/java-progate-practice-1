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
