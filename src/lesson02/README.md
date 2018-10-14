
## Boolean型

- `true`
- `false`

## 比較演算子

- `==`
- `!=`
- `<`
- `>`
- `<=`
- `>=`

## 論理演算子

- `&&`：かつ
- `||`：または
- `!`：反転

## if文

```java
if (条件式１) {
    条件式１がtrueの時の処理;
} else if (条件式２) {
    条件式２がtrueの時の処理;
} else {
    上記以外の時の処理;
}
```

## switch文

```java
switch (値) {
    case 値１:
        値の評価==値１ の時の処理
        break;
    case 値２:
    case 値３:
        値の評価==値２ の時の処理
        値の評価==値３ の時の処理
        break;
    default:
        値の評価がどれも一致しなかった場合の処理
        break;
}
```

## while文

```java
while (条件) {
    条件がtrueの時の処理
}
```

1. ループ変数の定義、初期化
2. 条件式の評価
3. 繰り返し
4. ループ変数の更新
5. 2へ戻る

## for文

```java
for (初期化式; 条件; 増加式) {
    条件がtrueの間、ループ
}
```

## break文

途中for文を終了する

```java
for (...) {
    if (条件) {
        break;
    }
    処理
}
```

## continue文

途中で次のループへいく

```java
for (...) {
    if (条件) {
        continue;
    }
    処理
}
```

## 配列

宣言と初期化

```java
型[] 変数名 = {要素1, 要素2, ...};
```

取得

```java
変数名[インデックス番号]
```

代入

```java
変数名[インデックス番号] = 値
```

```java
// 宣言
int[] numbers = {1, 2, 3};

// 取得
System.out.println(numbers[0]); // 1

// 代入
numbers[2] = 9;
System.out.println(numbers[2]); // 9
```

> インデックス番号は`0`から

### 配列の長さを取得

`配列.length`で配列の要素数を取得できる

```java
int[] numbers = {1, 2, 3};
System.out.println(numbers.length); // 3
```

## 拡張for文

```java
for (型 変数名: 配列名) {
    繰り返す処理
}
```

配列は拡張for文で書くほうがスマート

```java
int[] numbers = {1, 2, 3};
for (int num: numbers) {
    System.out.println(numbers[i]);
}

/* 出力結果

1
2
3

*/
```
