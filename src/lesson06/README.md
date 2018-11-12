# 継承

クラス定義の共通部分を別クラスにまとめて、コードの重複を排除する仕組み

変数とメソッドをまとめた共通クラスを作り、別のクラスからその定義をそのまま使うことができる。

## スーパークラスとサブクラス

継承されるクラス(共通部分をまとめたクラス)のことを「スーパークラス」と呼ぶ。また、継承して新しく定義するクラスを「サブクラス」と呼ぶ。

## `extends`

```java
class スーパークラス名 {
    ...
}
```

```java
class サブクラス名 extends スーパークラス名 {
    ...
}
```


## スーパークラスのメソッド・フィールドにアクセス

サブクラスのインスタンスで、スーパークラスのメソッドを呼ぶことができる。あたかも、サブクラスにそのメソッドがあるかのようになる

```java
// Vehicle.java
class Vehicle {
    public void run() {
        System.out.println("はしるはしる");
    }
}
```

```java
// Bicycle.java
class Bicycle extends Vehicle {
}
```

```java
// Main.java
class Main {
    Bicycle bicycle = new Bicycle();
    bicycle.run();
}
```

実行結果

```sh
はしるはしる
```


## スーパークラスのメソッドをオーバーライド

スーパークラスで定義されているメソッドをサブクラス側で処理の内容を変更することができる

同じメソッド名で、同じ引数の数、同じ引数の型であれば、オーバーライドされる

```java
// Vehicle.java
class Vehicle {
    public void run() {
        System.out.println("はしるはしる");
    }
}
```

```java
// Bicycle.java
class Bicycle extends Vehicle {
    // オーバーライドしている
    public void run() {
        System.out.println("自転車ではしってる");
    }
}
```

```java
// Main.java
class Main {
    Bicycle bicycle = new Bicycle();
    bicycle.run();
}
```

実行結果

```sh
自転車ではしってる
```

## スーパークラスのメソッドをサブクラスから呼び出す

`super`というキーワードを使うことでサブクラス側からスーパークラスのメソッドやフィールドにアクセスできるようになる

また、これを利用することで重複を消すことができる

```java
// Vehicle.java
class Vehicle {
    public void run() {
        System.out.println("はしるはしる");
    }
}
```

```java
// Bicycle.java
class Bicycle extends Vehicle {
    public void run() {
        // スーパークラスのメソッドを呼び出す
        super.run();
        System.out.println("自転車ではしってる");
    }
}
```

```java
// Main.java
class Main {
    Bicycle bicycle = new Bicycle();
    bicycle.run();
}
```

実行結果

```sh
はしるはしる
自転車ではしってる
```

スーパークラスの`run`も呼ばれていることがわかる

## スーパークラスのコンストラクタを呼ぶ

サブクラスのコンストラクタから、スーパークラスのコンストラクタを呼び出す場合、`super()`のように呼び出す。  
また、サブクラスのコンストラクタの先頭に記述しなければならない。

重複を削除できる

```java
// Vehicle.java
class Vehicle {
    private String name;

    Vehicle(String name) {
        this.name = name;
        System.out.println("スーパークラスのコンストラクタ");
    }
}
```

```java
// Bicycle.java
class Bicycle extends Vehicle {
    Bicycle(String name) {
        super(name);
        System.out.println("自転車のインスタンス生成");
    }
}
```

```java
// Main.java
class Main {
    Bicycle bicycle = new Bicycle();
}
```

実行結果

```java
スーパークラスのコンストラクタ
自転車のインスタンス生成
```

## アクセス修飾子

`protected`をつけることで、「クラス内」と「サブクラス内」からのみアクセス可能なフィールド、メソッドを定義できる

- public: どこからでもアクセス可能 
- protected: そのクラスと子クラス内からのみアクセス可能 
- private: そのクラス内からのみアクセス可能

## 抽象メソッドと抽象クラス

`abstract`キーワードで抽象クラスや抽象メソッドを作れる

### 抽象クラス

抽象クラスは、`new`できないクラス。必ず継承しないといけない。

```java
// Vehicle.java
abstract class Vehicle {
    public void run() {
        System.out.println("はしるはしる");
    }
}
```

```java
// Bicycle.java
class Bicycle extends Vehicle {
}
```

```java
// Main.java
class Main {
    Bicycle bicycle = new Bicycle();
    bicycle.run();


    // これはできない
    // Vehicle vehicle = new Vehicle();
}
```


### 抽象メソッド

抽象メソッドは、抽象メソッドを持つクラスを継承した場合、抽象メソッドを必ずオーバーライドしないといけない。


```java
// Vehicle.java
class Vehicle {
    abstract public void run();
}
```

`Bicycle`クラスは`run`を必ずオーバーライドしないといけなくなる

```java
// Bicycle.java
class Bicycle extends Vehicle {
    // オーバーライドする
    public void run() {
        System.out.println("自転車ではしってる");
    }
}
```


