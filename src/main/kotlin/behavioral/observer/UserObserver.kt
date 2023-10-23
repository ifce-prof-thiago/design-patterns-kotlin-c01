package behavioral.observer

class UserObserver(val name: String, subject: MessageSubject) : MessageObserver {

    init {
        subject.subscribe(this)
    }

    override fun update(sender: String, message: Message) {
        println("$name: ${message.content} (received)")
    }

}