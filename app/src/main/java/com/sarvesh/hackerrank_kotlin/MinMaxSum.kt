package com.sarvesh.hackerrank_kotlin

/*
Given five positive integers,
find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.

For example,
    arr= [1,3,5,7,9] .
    Our minimum sum is 1+3+5+7=16
    and
    our maximum sum is 3+5+7+9=24.
    We would print
    16 24
    */

fun miniMaxSum(arr: Array<Int>): Unit {
    var min : Long = arr[0].toLong()
    var max : Long = 0
    var total : Long = 0

    for(i in 0 until arr.size){
        val num = arr[i].toLong()
        total += num
        if(num<min){
            min = num
        }
        if(num>max){
            max = num
        }
    }
    println("${total - max} ${total - min}")

}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
