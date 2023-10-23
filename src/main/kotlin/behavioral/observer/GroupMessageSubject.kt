package behavioral.observer

class GroupMessageSubject : MessageSubject {

    private val observers = mutableListOf<MessageObserver>()

    override fun subscribe(observer: MessageObserver) {
        observers.add(observer)
    }

    override fun remove(observer: MessageObserver) {
        observers.remove(observer)
    }

    override fun publish(sender: String, message: Message) {
        observers.forEach { it.update(sender, message)}
    }

}