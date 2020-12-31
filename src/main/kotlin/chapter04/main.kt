package chapter04

fun higherOrder(func: (Int, Int) -> Int, x: Int, y: Int): Int = func(x, y)