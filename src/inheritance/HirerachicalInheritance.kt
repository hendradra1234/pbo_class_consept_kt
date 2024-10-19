package inheritance

open class atribute {
    var side = 0
}

class Square2: atribute() {
    private var wide = 0

    fun calculateArea(): Int {
        wide = super.side * super.side
        return wide
    }
}

class Cube2: atribute() {
    private var volume = 0

    fun calculateVolume(): Int {
        volume = super.side * super.side * super.side
        return volume
    }
}