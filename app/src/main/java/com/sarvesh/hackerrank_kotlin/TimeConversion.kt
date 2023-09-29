package com.sarvesh.hackerrank_kotlin

/*
Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Input Format
       A single string s containing a time in 12 -hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01< hh < 12 and 00< mm,ss < 59.

Output Format
       Convert and print the given time 24 in -hour format, where 00 < hh < 23

Sample Input
        07:05:45PM
Sample Output
        19:05:45
        */

fun timeConversion(s: String): String {
    val zone = s.substring(8, 10)
    val time = s.substring(0, 8)
    val hour = s.substring(0, 2)
    val minutes = s.substring(2, 8)
    var result: String
    if (zone == "AM") {
        result = if (hour == "12") "00$minutes" else time
    } else {
        var sum = hour.toInt() + 12
        result = if (hour == "12") time else "$sum$minutes"
    }
    return result

}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}