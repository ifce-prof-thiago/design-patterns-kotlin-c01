package creational.decorator

fun main() {

    // calabreza --> massa integral --> borda --> massa integral

    val pizza = PizzaCalabreza()
    val pizzaComMassa = MassaIntegral(pizza)

    val pizzaComBorda = BordaRequejao(pizza)

    val pizzaFinal = MassaIntegral(pizzaComBorda)

    println("Pizza: ${pizzaFinal.description()}")
    println("Preço: ${pizzaFinal.price()}")

}