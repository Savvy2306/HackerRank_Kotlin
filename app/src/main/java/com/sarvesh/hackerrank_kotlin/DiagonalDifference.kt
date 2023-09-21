package com.sarvesh.hackerrank_kotlin

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var lTorDiag = 0
    var rTolDiag = 0

    for(i in 0 until arr.size){
        lTorDiag += arr[i][i]
        rTolDiag += arr[i][arr.size-1-i]
    }

    return Math.abs(lTorDiag - rTolDiag)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
