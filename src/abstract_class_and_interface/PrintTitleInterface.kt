package abstract_class_and_interface

interface print {
    fun show()
}

class Title1 : print {
    override fun show() {
        println("Hello there...")
        println("Welcome to ISB Atma Luhur")
    }
}

class Name1 : print {
    override fun show() {
        println("Saya Hendra dan ini si dia")
        println("Salam kenal")
    }
}