package com.sarvesh.hackerrank_kotlin

fun simpleArraySum(ar: Array<Int>): Int {
    // Write your code here
    var sum = 0
    ar.forEach { num->
        sum = sum + num
    }

    return sum

}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
