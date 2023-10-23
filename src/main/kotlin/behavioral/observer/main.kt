package behavioral.observer


fun main() {

    val groupKotlin = GroupMessageSubject()

    val thiago = UserObserver("Thiago F.", groupKotlin)
    val porfirio = UserObserver("Lucas porfirio", groupKotlin)

    groupKotlin.publish(thiago.name, Message("Hi"))

    groupKotlin.remove(thiago)

    groupKotlin.publish(porfirio.name, Message("Are you ok?"))

}
