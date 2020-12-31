package chapter03

fun String.head() = first()
fun String.tail() = drop(1)
fun List<Int>.head() = first()
fun List<Int>.tail() = drop(1)

fun fiboDynamic(n: Int, fibo: IntArray): Int {
    fibo[0] = 0
    fibo[1] = 1
    for (i in 2..n) {
        fibo[i] = fibo[i - 1] + fibo[i - 2]
    }
    return fibo[n]
}

fun fiboRecursion(n: Int): Int = when (n) {
    0 -> 0
    1 -> 1
    else -> fiboRecursion(n - 1) + fiboRecursion(n - 2)
}

// 연습문제 3-2

fun power(x: Double, n: Int): Double = when {
    n == 0 -> 1.0
    n < 0 -> power(x, n + 1) / x
    else -> power(x, n - 1) * x
}

// 연습문제 3-3

fun factorial(n: Int): Int = when (n) {
    0 -> 1
    else -> factorial(n - 1) * n
}

fun take(n: Int, list: List<Int>): List<Int> = when {
    n <= 0 -> listOf()
    list.isEmpty() -> listOf()
    else -> listOf(list.head()) + take(n - 1, list.tail())
}

fun reverse(str: String): String = when {
    str.isEmpty() -> ""
    else -> reverse(str.tail()) + str.head()
}

// 연습문제 3-4

fun toBinary(n: Int): String = when (n) {
    0 -> "0"
    1 -> "1"
    else -> toBinary(n / 2) + (n % 2).toString()
}

fun elem(num: Int, list: List<Int>): Boolean = when {
    list.head() == num -> true
    list.size <= 1 -> false
    else -> elem(num, list.subList(1, list.size))
}