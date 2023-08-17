package design.patterns.design.patterns.strategy

class Percent:StrategyCalculator {
    override fun applySolution(x: Double, y: Double): Double {
        return (x*y)/100
    }
}