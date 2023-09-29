package com.sarvesh.hackerrank_kotlin

/*
You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being b e t w e e n the two arrays. You must determine how many such numbers exist.

For example, given the arrays a = [2,6] and b = [24,36] , there are two numbers between them 6 and 12. 6%2=0, 6%6 =0, 0,24%6 = 0 and 36%6 = 0 for the first value. Similarly, 12%2=0, 12%6=0 and 24%12 = 0 , 36%12 =0.

Function Description

Complete the g e t T o t alX function in the editor below. It should return the number of integers that are betwen the sets. getTotalX has the following parameter(s):

a: an array of integers
b: an array of integers
Input Format

The first line contains two space-separated integers, n and m, the number of elements in array a and the number of elements in array b.

The second line contains distinct space-separated integers describing a[i] where 0<i<n.
The third line contains m distinct space-separated integers describing b[j] where 0<j<m.
Output Format

Print the number of integers that are considered to be
between a and b.

Sample Input

2 3
2 4
16 32 96
Sample Output

3
*/


fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var result =  0
    var maxFirst = a.max().toInt()
    var minSec = b.min().toInt()

    for(x in maxFirst..minSec){
        var status = true
        if (status) {
            for (i in 0 until a.size) {
                val it = a[i]
                if (x % it != 0) {
                    status = false
                    break
                }
            }
        }
        for (i in 0 until b.size) {
            val it = b[i]
            if (it % x != 0) {
                status = false
                break
            }
        }
        if (status) {
            result++
        }
    }


    return result

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
