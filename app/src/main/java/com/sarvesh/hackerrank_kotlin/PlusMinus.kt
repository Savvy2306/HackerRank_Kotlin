package com.sarvesh.hackerrank_kotlin

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var pos = 0
    var neg = 0
    var zer = 0
    val sizeValue = arr.size.toFloat()

    arr.forEach { it->
        if(it > 0){
            pos ++
        }else if(it < 0){
            neg ++
        }else{
            zer ++
        }
    }

    println(pos.toFloat() / sizeValue)
    println(neg.toFloat()/sizeValue)
    println(zer.toFloat()/sizeValue)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
