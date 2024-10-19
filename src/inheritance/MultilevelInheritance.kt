package inheritance

open class MultilevelInheritance {
    var name = ""

    fun show () {
        println("Hallo, ini parrent class")
    }
}

open class MultilevelInheritanceB: MultilevelInheritance() {
    fun hello () {
        println("Hallo, salam kenal")
    }
}

class MultilevelInheritanceC: MultilevelInheritanceB() {
    fun data () {
        println("Nama saya: ${super.name}")
    }
}