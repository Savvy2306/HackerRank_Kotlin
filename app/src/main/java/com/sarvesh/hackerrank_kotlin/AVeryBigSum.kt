package com.sarvesh.hackerrank_kotlin

fun aVeryBigSum(ar: Array<Long>): Long {
    // Write your code here
    var total : Long = 0

    ar.forEach { it->
        total += it
    }

    return total

}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)
}
