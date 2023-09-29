package com.sarvesh.hackerrank_kotlin

import java.util.Scanner

/*
Two cats and a mouse are at various positions on a line. You will be given their starting positions.
Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and the cats travel at equal speed.
If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
        */

fun catAndMouse(x: Int, y: Int, z: Int): String {
    var result = ""
    val disFromA = Math.abs(x-z)
    val disFromB= Math.abs(y-z)

    if(disFromA<disFromB){
        result = "Cat A"
    }else if(disFromA>disFromB){
        result = "Cat B"
    }else{
        result = "Mouse C"
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
