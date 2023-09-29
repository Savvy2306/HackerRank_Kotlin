package com.sarvesh.hackerrank_kotlin

/*
You are in charge of the cake for a child's birthday.
You have decided the cake will have one candle for each year of their total age.
They will only be able to blow out the tallest of the candles.
Count how many candles are tallest.

Example
      candles = [4,4,1,3]
      The maximum height candles are  units high. There are 2 of them, so return 2.
        */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    var count = 0
    val max = candles.max().toLong()
    for(i in 0 until candles.size){
        val num =  candles[i].toLong()
        if(num.equals(max)){
            count++
        }
    }

    return count.toInt()
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}

