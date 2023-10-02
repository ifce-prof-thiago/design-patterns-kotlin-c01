package behavioral.strategy

class CalculateCieloRate : CalculateRate {

    override fun calculateRate(instalmentCount: Int): Double {

        val rate = 4.99

        if (instalmentCount == 1) {
            return rate
        }

        return rate + (instalmentCount * 1.99)
    }


}