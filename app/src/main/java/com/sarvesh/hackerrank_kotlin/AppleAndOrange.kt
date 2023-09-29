package com.sarvesh.hackerrank_kotlin

/*
Sam’s house has an apple tree and an orange tree that yield an abundance of fruit. In the diagram below, the red region denotes his house, where s is the start point, and t is the endpoint. The apple tree is to the left of his house, and the orange tree is to its right. You can assume the trees are located on a single point, where the apple tree is at point a, and the orange tree is at point b.

When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. A negative value of d means the fruit fell d units to the tree’s left, and a positive value of d means it falls d units to the tree’s right

Complete the function countApplesAndOranges

where :

start Starting point of Sam’s house location.

end Ending location of Sam’s house location.

Loc a Location of the Apple tree.

Loc o Location of the Orange tree.

size a Number of apples that fell from the tree.

apples Distance at which each apple falls from the tree.

size o Number of oranges that fell from the tree.

orange Distance at which each orange falls from the tree.

Given the value of d for m apples and oranges, can you determine how many apples and oranges will fall on Sam’s house (i.e., in the inclusive range [s,t])? Print the number of apples that fall on Sam’s house as your first line of output, then print the number of oranges that fall on Sam’s house as your second line of output.

Input Format

The first line contains two space-separated integers denoting the respective values of and . The second line contains two space-separated integers denoting the respective values of and . The third line contains two space-separated integers denoting the respective values of and . The fourth line contains space-separated integers denoting the respective distances that each apple falls from point . The fifth line contains space-separated integers denoting the respective distances that each orange falls from point .

Constraints

1 < s, t, a, b, m, n < 10
-10 < d < 10
a < s < t < b
Output Format

Print two lines of output:

On the first line, print the number of apples that fall on Sam’s house.
On the second line, print the number of oranges that fall on Sam’s house.*/

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // Write your code here
    var countApple = 0
    var countOrange = 0

    apples.forEachIndexed { index,value->
        apples[index] = value + a
        if(apples[index]>=s && apples[index]<=t){
            countApple++
        }
    }
    oranges.forEachIndexed { index,value->
        oranges[index] = value + b
        if(oranges[index]>=s && oranges[index]<=t){
            countOrange++
        }
    }

    println(countApple)
    println(countOrange)



}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
