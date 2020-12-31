package chapter03

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

open class RecursiveKtTest {
    @Test
    fun fiboDynamic() {
        val result = fiboDynamic(10, IntArray(100))
        Assertions.assertEquals(55, result)
    }

    @Test
    fun fiboRecursion() {
        val result = fiboRecursion(10)
        Assertions.assertEquals(55, result)
    }

    @Test
    fun power() {
        val result = power(10.0, 2)
        Assertions.assertEquals(100.0, result)
    }

    @Test
    fun factorial() {
        val result = factorial(10)
        Assertions.assertEquals(3628800, result)
    }

    @Test
    fun take() {
        val result = take(3, listOf(1, 2, 3, 4, 5))
        Assertions.assertEquals(listOf(1, 2, 3), result)
    }

    @Test
    fun reverse() {
        val result = reverse("abcd")
        Assertions.assertEquals("dcba", result)
    }

    @Test
    fun toBinary() {
        val result1 = toBinary(10)
        val result2 = toBinary(2)
        val result3 = toBinary(100)
        Assertions.assertAll(
            Executable { Assertions.assertEquals("1010", result1) },
            Executable { Assertions.assertEquals("10", result2) },
            Executable { Assertions.assertEquals("1100100", result3) }
        )
    }

    @Test
    fun elem() {
        val result1 = elem(5, listOf(1, 2, 3, 4, 5, 6, 7, 8, 9))
        val result2 = elem(1, listOf(3, 4, 5, 6, 7))
        val result3 = elem(3, listOf(1, 1, 1, 2, 3, 34, 45, 6, 7, 5))
        Assertions.assertAll(
            Executable { Assertions.assertEquals(true, result1) },
            Executable { Assertions.assertEquals(false, result2) },
            Executable { Assertions.assertEquals(true, result3) }
        )

    }

    @Test
    fun zip() {
        val result = zip(listOf(1,2), listOf(5,6,7))
        Assertions.assertEquals(listOf(Pair(1,5), Pair(2,6)),result)
    }

    @Test
    fun quickSort() {
        val result = quickSort(listOf(2,5,3,4,1))
        Assertions.assertEquals(listOf(1,2,3,4,5),result)
    }

    @Test
    fun gcd() {
        val result = gcd(60,48)
        Assertions.assertEquals(12,result)
    }
}