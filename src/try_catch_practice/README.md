# 例外処理

```java
try {
    // 例外が起きる可能性がある処理
    ... 
} catch(例外のクラス 変数名) {
    // 例外が起きたときの処理
    ...  } finally {
    // 必ず最後実行する処理
    ...
}
```

## 例外クラス

`Throwable`クラスのサブクラス

`Error`クラスと`Exception`クラスに分かれる。

- `Error`クラスのサブクラス、プログラムの実行が続行できないようなエラー
- `Exception`クラスのサブクラスは、例外処理をしてもいいエラー

## 独自の例外クラスを定義

`Exception`クラスを継承したクラスを定義する

```java
class SampleException extends Exception {
}
```

## 例外を送出する

```java
throw 例外のオブジェクトを指す変数
```

例）`SampleException`の例外を送出する

```java
public void setName(String name) throws SampleExeption {
    if (name == Null) {
        SampleException e = new SampleException();
        throw e;
    }
}
```


