package hackerrank.basic

import hackerrank.utils.stdinStringArrayToIntArray

/**
 * Given an array of integers, where all elements but one occur twice, find the unique element.
 */
fun lonelyinteger(a: Array<Int>): Int {
    return a.reduce { acc, num -> acc xor num } // if all values appear twice, except 1, they will be all xored out, except the unique element
}

fun main(args: Array<String>) {
    val result = lonelyinteger("1 2 3 4 3 2 1".stdinStringArrayToIntArray)
    println(result)
}