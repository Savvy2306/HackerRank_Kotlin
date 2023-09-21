package com.sarvesh.hackerrank_kotlin

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}

fun solveMeFirst(a: Int, b: Int): Int {
    return (a+b)

}