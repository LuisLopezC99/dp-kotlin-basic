package design.patterns.strategy


import com.github.stefanbirkner.systemlambda.SystemLambda
import design.patterns.design.patterns.strategy.*
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.math.abs
import kotlin.test.assertTrue
import java.io.ByteArrayOutputStream
import java.io.PrintStream


class StrategyTest {
    private val standardOut = System.out
    private val outputStreamCaptor = ByteArrayOutputStream()

    @BeforeEach
    fun setUp() {
        System.setOut(PrintStream(outputStreamCaptor))
    }

    @AfterEach
    fun tearDown() {
        System.setOut(standardOut)
    }

    private val tolerance = 1e-6

    @Test
    fun `testing a Calculator program with different strategies`() {
        testAddStrategy()
        testSubtractStrategy()
        testMultiplyStrategy()
        testDivideStrategy()
        testPercentageStrategy()
    }

    private fun testAddStrategy() {
        val addStrategy = Add()
        val result = Context(addStrategy).executeStrategy(10.0, 5.0)
        assertTrue(abs(result - 15.0) < tolerance)
    }

    private fun testSubtractStrategy() {
        val subtractStrategy = Sub()
        val result = Context(subtractStrategy).executeStrategy(10.0, 5.0)
        assertTrue(abs(result - 5.0) < tolerance)
    }

    private fun testMultiplyStrategy() {
        val multiplyStrategy = Mull()
        val result = Context(multiplyStrategy).executeStrategy(10.0, 5.0)
        assertTrue(abs(result - 50.0) < tolerance)
    }

    private fun testDivideStrategy() {
        val divideStrategy = Div()
        val result = Context(divideStrategy).executeStrategy(10.0, 5.0)
        assertTrue(abs(result - 2.0) < tolerance)
    }

    private fun testPercentageStrategy() {
        val percentageStrategy = Percent()
        val result = Context(percentageStrategy).executeStrategy(50.0, 20.0)
        assertTrue(abs(result - 10.0) < tolerance)
    }
}