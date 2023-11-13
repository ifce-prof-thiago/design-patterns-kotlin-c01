package creational.decorator

class BordaRequejao(pizza: Pizza) : AdditionalDecorator(pizza) {
    override fun description() = "${pizza.description()} + Borda de Requeijão"
    override fun price() = pizza.price() + 10.50
}