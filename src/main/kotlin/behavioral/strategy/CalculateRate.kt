package behavioral.strategy

interface CalculateRate {
    fun calculateRate(instalmentCount: Int): Double
}