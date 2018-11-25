# インターフェース

## インターフェースの定義

```java
interface インターフェース名 {
    型名 フィールド名 = 式;
    戻り値の型 メソッド名();
}
```

基本的には修飾子に何もつけない。つけなくても、以下のものがつく

- フィールドには`public static final`がつく(定数)
- メソッドには`abstract`がつく(抽象メソッド)

オブジェクトの生成ができない

## インターフェースの実装

```java
class クラス名 implements インターフェース名 {
    ...
}
```