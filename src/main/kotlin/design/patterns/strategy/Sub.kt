package design.patterns.design.patterns.strategy

class Sub:StrategyCalculator {
    override fun applySolution(x: Double, y: Double): Double {
        return x-y
    }
}