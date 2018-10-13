
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

## オーバーロード

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
