package com.sarvesh.hackerrank_kotlin

/*
You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive inﬁnity).

The ﬁrst kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
You have to ﬁgure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

For example,
kangaroo 1 starts at x1 = 2 with a jump distance v1 = 1 and
kangaroo 2 starts at x2 = 1 with a jump distance of v2 = 2.
After one jump, they are both at x = 3, (x1+v1 = 2 +1, x2 + v2 = 1+2),
so our answer is YES
*/

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {
    // Write your code here
    var dis = x2-x1
    var jump = v1-v2
    var result = ""

    if(v1>v2 && dis%jump == 0){
        result = "YES"
    }else{
        result = "NO"
    }

    return result

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
