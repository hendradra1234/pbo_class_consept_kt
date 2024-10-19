package inheritance

open class SquaresInheritance {
    var side = 0
    fun calculateArea() = side * side
}

class cube: SquaresInheritance() {
    fun calculateVolume() = super.side * super.side * super.side
}