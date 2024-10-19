import abstract_class_and_interface.*

fun abstractClassDemo () {
    println("\nAbstract Class Demo \n")

    val objSquare = Squares1()
    val objCube = cube1()

    objSquare.side = 2
    objCube.side = 4

    objCube.showWide(objSquare.calculateWide())
    objCube.showVolume(objCube.calculateVolume())
    GeometryAbstractClass.close()
}

fun interfaceDemo () {
    println("\nInterface Demo \n")
    val title = Title1()
    val name = Name1()

    title.show()
    name.show()
}

fun finalClassDemo () {
    println("\nFinal Class Demo \n")

    val geometry = GeometryFinalClass()

    geometry.showWide(200)
    geometry.showVolume(250)

}