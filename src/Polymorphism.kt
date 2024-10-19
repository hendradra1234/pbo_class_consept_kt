import polymorphism.*

fun overloadingDemo () {
    println("\nPolymorphism Overloading\n")
    val mhs = MahasiswaMethodOverloading()

    mhs.show()
    mhs.show("ISB ATHA LUHUR")
    mhs.show("2024")
    mhs.show("Hendra", "Clarisha")
}

fun overiddingDemo () {
    println("\nPolymorphism Overriding\n")
    val title = TitleMethodOverriding()
    val name = TitleMethodOverriding()

    name.setName("Hendra", "Lia")
    title.show()
    name.show()
}