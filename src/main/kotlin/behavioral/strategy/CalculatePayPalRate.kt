package behavioral.strategy

class CalculatePayPalRate : CalculateRate {

    override fun calculateRate(instalmentCount: Int): Double {

        val rate = 5.0

        if (instalmentCount == 1) {
            return rate
        }

        return instalmentCount * 3.0

    }

}