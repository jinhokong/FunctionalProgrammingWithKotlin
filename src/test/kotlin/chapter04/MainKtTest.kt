package chapter04

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

internal class MainKtTest {
    @Test
    fun higherOrder() {
        val sum: (Int, Int) -> Int = { x, y -> x + y }
        val minus: (Int, Int) -> Int = { x, y -> x - y }
        val product: (Int, Int) -> Int = { x, y -> x * y }

        Assertions.assertAll(
            Executable { Assertions.assertEquals(6, higherOrder(sum,1,5)) },
            Executable { Assertions.assertEquals(3, higherOrder(minus,5,2)) },
            Executable { Assertions.assertEquals(8, higherOrder(product,4,2)) }
        )
    }
}