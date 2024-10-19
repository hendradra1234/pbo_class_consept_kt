package polymorphism

open class TitleMethodOverriding {
    var name1 = String()
    var name2 = String()

    fun setName (name1: String, name2: String) {
        this.name1 = name1
        this.name2 = name2
    }

    open fun show () {
        println("Hi...")
        println("Nice to meet you")
        println("can i get your number")
    }
}

class TitleMethodOverridingChild: TitleMethodOverriding() {
    override fun show () {
        println("Hi there, iam ${super.name1}")
        println("and this ${super.name2}")
        println("Nice to meet you")
    }
}