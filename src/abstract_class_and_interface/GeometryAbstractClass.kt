package abstract_class_and_interface

abstract class GeometryAbstractClass {
    protected abstract var side: Int

    fun showWide(wide: Int) {
        println("Luas: $wide")
    }

    fun showVolume(volume: Int) {
        println("Volume: $volume")
    }

    companion object {
        fun close () {
            println("Close Program")
        }
    }
}


class Squares1 : GeometryAbstractClass() {
    public override var side: Int = 0
    fun calculateWide() = side * side
}

class cube1: GeometryAbstractClass() {
    public override var side: Int = 0
    fun calculateVolume() = side * side * side
}
