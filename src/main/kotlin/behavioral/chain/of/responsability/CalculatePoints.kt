package behavioral.chain.of.responsability

abstract class CalculatePoints {

    var next: CalculatePoints? = null
    abstract fun execute(value: Double): Int
    fun next(next: CalculatePoints?) {
        this.next = next
    }

}