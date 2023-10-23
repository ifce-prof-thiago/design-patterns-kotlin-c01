package behavioral.observer

interface MessageSubject {
    fun subscribe(observer: MessageObserver) // attach
    fun remove(observer: MessageObserver) // detach
    fun publish(sender: String, message: Message) // notify
}