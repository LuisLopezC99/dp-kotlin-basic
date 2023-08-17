package design.patterns.design.patterns.strategy

class Context(
        private val solutionStrategy: StrategyCalculator,
) {
    fun executeStrategy(x:Double,y:Double):Double{
        return solutionStrategy.applySolution(x,y)
    }
}