package lesson03;

class Practice06 {
    public static void main(String[] args) {
        printMsg("山田");
        printMsg("山田", "はじめまして");
    }

    static printMsg(String name) {
        System.out.println("こんにちは、" + name + "です");
    }
}

/* printMsgをオーバーロードし、下のような出力になるようにする */

/* 出力結果 *

こんにちは、山田です
はじめまして、山田です

 */
