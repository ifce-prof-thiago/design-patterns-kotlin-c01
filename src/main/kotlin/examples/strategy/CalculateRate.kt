package examples.strategy

interface CalculateRate {
    fun calculateRate(instalmentCount: Int): Double
}