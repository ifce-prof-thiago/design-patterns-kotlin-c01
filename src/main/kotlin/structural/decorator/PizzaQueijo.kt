package creational.decorator

class PizzaQueijo : Pizza() {
    override fun description() = "Pizza de Queijo"
    override fun price() = 34.00
}