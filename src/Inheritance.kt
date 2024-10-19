import inheritance.*

import abstract_class_and_interface.Squares1

fun singleInheritanceDemo () {
    println("\nSingle Inheritance Class Demo \n")

    val objSquare = SquaresInheritance()
    val objCube = cube()

    objSquare.side = 20
    objCube.side = 10

    println("B U J U R S A N G K A R")
    println("-------------------------")
    println("Sisi   : ${objSquare.side}")
    println("Luas   : ${objSquare.calculateArea()}")
    println("-------------------------")
    println("K U B U S")
    println("-------------------------")
    println("Sisi   : ${objCube.side}")
    println("Volume : ${objCube.calculateVolume()}")
    println("-------------------------")
}

fun multilevelInheritanceDemo() {
    println("\nMultilevel Inheritance Class Demo \n")

    val mhs = MultilevelInheritanceC()

    mhs.name = "Hendra"
    mhs.data()
    mhs.show()
}

fun hirerachicalInheritanceDemo() {
    println("\nHirerachical Inheritance Class Demo \n")

    val objSquare = Square2()
    val objCube = Cube2()

    objSquare.side = 10
    objCube.side = 15

    println("B U J U R S A N G K A R")
    println("-------------------------")
    println("Sisi   : ${objSquare.side}")
    println("Luas   : ${objSquare.calculateArea()}")
    println("-------------------------")
    println("K U B U S")
    println("-------------------------")
    println("Sisi   : ${objCube.side}")
    println("Volume : ${objCube.calculateVolume()}")
    println("-------------------------")

}