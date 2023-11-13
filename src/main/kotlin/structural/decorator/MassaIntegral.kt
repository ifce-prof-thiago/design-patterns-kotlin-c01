package creational.decorator

class MassaIntegral(pizza: Pizza) : AdditionalDecorator(pizza) {
    override fun description() = "${pizza.description()} + Massa Integral"

    override fun price() = pizza.price() + 7.00
}