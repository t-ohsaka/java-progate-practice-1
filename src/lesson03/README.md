
## メソッド

```java
戻り値の型 メソッド名 (引数リスト) {
    処理
    return 式;
}
```

例）firstNameとlastNameを受け取り、String型を返すfullNameメソッド。

```java
String fullName(String lastName, String firstName) {
    return lastName + " " + firstName;
}
```

### 引数

`型 引数名`で記述する。複数ある場合、カンマで区切る

```java
戻り値の型 メソッド名(型 引数名1, 型 引数名2) {
    処理
}
```

### 戻り値

int型の値を返すメソッドの場合

```java
int add(int a, int b) {
    return a + b;
}
```

戻り値のないメソッドは`void`と記述する

```java
void printHello() {
    System.out.println("Hello");
}
```

### オーバーロード

引数の型や個数が違う**同名のメソッド**を定義できる

```java
void hello() {
    System.out.println("こんにちは世界！");
}

void hello(String name) {
    System.out.println("こんにちは" + name + "さん！");
}
```

引数によって、呼び出すほうが変わる

```java
hello();            // こんにちは世界！
hello("太郎");    // こんにちは太郎さん！
```

## クラス

クラスの定義

```java
class クラス名 {
    メソッドの定義
}
```

- クラス名の最初の文字は大文字
- ファイル名は**クラス名.java**とする

クラスのメソッドの呼び出し

```java
クラス名.メソッド名();
```

### ライブラリ

importで他のクラスを使えるようになる

```java
import クラス名;
```

`java.lang.*`のクラスは`import`しなくても使える

例）コンソールからの入力を受け取る

`Scanner`クラスを使う

```java
import java.util.Scanner

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("あなたの名前：");
        String name = sc.next();

        System.out.println(name + "さん、こんにちは！");
    }
}
```

整数を受け取るには、`Scanner.nextInt()`、小数を受け取るには`Scanner.nextDouble`を使う

## オブジェクト指向の学習

クラスはデータと処理をまとめることが目的

比喩とコンピュータの処理を一緒にしないこと

## 参考文献

- [疑りぶかいあなたのためのオブジェクト指向再入門](http://kmaebashi.com/programmer/object/)
