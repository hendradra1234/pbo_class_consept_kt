package polymorphism

class MahasiswaMethodOverloading {
    var name = String()
    var year = 0

    fun show () {
        println("Hallo....")
    }
    fun show (name: String) {
        this.name = name
        println("Kami Mahasiswa $name")
    }
    fun show (year: Int) {
        this.year = year
        println("Kami Angkatan $year")
    }
    fun show (name1: String, name2: String) {
        println("Saya $name1 dan doi $name2")
        println("Salam kenal ya....")
    }
}