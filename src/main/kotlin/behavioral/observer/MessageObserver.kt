package behavioral.observer

interface MessageObserver {
    fun update(sender: String, message: Message)
}