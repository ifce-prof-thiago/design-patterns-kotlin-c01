package behavioral.strategy

class CalculateMercadoPagoRate : CalculateRate {
    override fun calculateRate(instalmentCount: Int): Double {

        val rate = 2.0

        if (instalmentCount == 1) {
            return rate
        }

        return instalmentCount * 1.99 + 5.0

    }


}