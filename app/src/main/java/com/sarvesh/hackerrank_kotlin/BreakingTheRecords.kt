package com.sarvesh.hackerrank_kotlin

/*
Maria plays games of college basketball in a season. Because she wants to go pro, she tracks her points scored per game sequentially in an array defined as score = [ 80, 81, ………, 8n-1]. After each game , she checks to see if score Si breaks her record for most or least points scored so far during that season.

Given Maria’s array of scores for a season of n games, find and print the number of times she breaks her record for most and least points scored during the season.

Note

Assume her records for most and least points at the start of the season are the number of points scored during the first game of the season.

Input Format

The first line contains an integer denoting n (the number of games). The second line contains n space-separated integers describing the respective values of 80, 81, ………, 8n-1,

Output Format

Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her worst (lowest) score decreased.

Sample Input

9
10 5 20 20 4 5 2 25 1
Sample Output

24*/

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var minScore = scores[0]
    var maxScore = scores[0]
    var minCount = 0
    var maxCount = 0

    for(i in 1 until scores.size){
        if(scores[i]<minScore){
            minScore = scores[i]
            minCount++
        }else if(scores[i]>maxScore){
            maxScore = scores[i]
            maxCount++
        }
    }

    return arrayOf(maxCount,minCount)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
