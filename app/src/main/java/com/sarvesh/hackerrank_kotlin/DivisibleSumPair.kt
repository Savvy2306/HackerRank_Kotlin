package com.sarvesh.hackerrank_kotlin

/*
Though it will be weird to see this question I really need to understand some core concepts while I continue my journey of coding. I have a problem which is on Hackerrank it goes like DIVISIBLE SUM PAIRS

I will anyhow give the problem statement here:

Problem Statement

Given an array, where we have to find the number of pairs divisible by the given number k, and there is one more condition to it, which is : the arr[i] < arr[j] from those pairs.

Example

For example, ar=[1,2,3,4,5,6] and k=5. Our three pairs meeting the criteria are [1,4] [2,3] and [4,6].
*/

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    // Write your code here
    var count = 0

    for(i in 0 until ar.size-1){
        var sum = 0
        for(j in i+1 until ar.size){
            sum = ar[i]+ar[j]
            if(sum%k == 0){
                count++
            }
        }
    }

    return count

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}


