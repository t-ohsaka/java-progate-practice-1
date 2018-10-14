
## 補足

### インデント

コード中で字下げを行うことをインデントという。 インデントを行うことでコードが見やすくなる。

```java
public class Sample {
public static void main(String[] args) {
System.out.println("Hello world!");
}
}
```

一応、動作するけど、見づらい...

`tab`を入力することで、字下げができる

### エスケープシーケンス

キーボードからの入力では表せない文字がある。改行、`'`、`"`など。これらは`\`を最初につけた2つの文字の組み合わせで「1文字」を表すことができる。これを**エスケープシーケンス**と呼ぶ。

主なエスケープシーケンス

|入力値|意味|
|---|---|
|\t|タブ|
|\n|改行|
|\'|'|
|\"|"|
|`\\`|`\`|

```java=
class Sample4 {
    public static void main(String[] args) {
        System.out.println("バックスラッシュ：\\");

        System.out.println("\t列を");
        System.out.println("\t整える");
    }
}
```

実行結果

```
バックスラッシュ：\
    列を
    整える
```
