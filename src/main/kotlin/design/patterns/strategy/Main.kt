package design.patterns.design.patterns.strategy

fun main() {
    val addStrategy = Add()
    val subtractStrategy = Sub()
    val multiplyStrategy = Mull()
    val divideStrategy = Div()
    val percentageStrategy = Percent()

    val context = Context(addStrategy)
    println(context.executeStrategy(10.0, 5.0)) // Suma: 15.0
    val context2 = Context(subtractStrategy)
    println(context2.executeStrategy(10.0, 5.0)) // Suma: 15.0
}