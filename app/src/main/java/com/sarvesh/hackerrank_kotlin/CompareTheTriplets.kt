package com.sarvesh.hackerrank_kotlin

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var bob = 0
    var alice =  0

    for(i in 0 until a.size){
        if(a[i]>b[i]){
            alice++
        }else if(a[i]<b[i]){
            bob++
        }
    }

    return arrayOf(alice,bob)

}

fun main(args: Array<String>) {

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
