package com.sarvesh.hackerrank_kotlin

/*HackerLand University has the following grading policy :

Every student receives a grade in the inclusive range from 0 to 100 .
Any grade less than 40 is a failing grade.
Sam is a professor at the university and likes to round each student’s grade according to these rules:

If the diﬀerence between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
Examples

grade = 84 round to 85 (85–84 is less than 3)
grade = 29 do not round (result is less than 40)
grade = 57 do not round (60–57 is 3 or higher)
Given the initial value of grade for each of Sam’s n students, write code to automate the rounding process.
       */

fun gradingStudents(grades: Array<Int>): Array<Int> {

    val newGradeList : MutableList<Int> = ArrayList()

    grades.forEach{num->
        if(num >= 38 && num % 5 > 2){
            val total = num + (5 - num % 5)
            newGradeList.add(total)
        }else{
            newGradeList.add(num)
        }
    }

    return newGradeList.toTypedArray()

}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
