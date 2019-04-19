import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    val box3 = Box3()
    val box5 = Box5()
    println("Please enter object's length: ")
    val length = scanner.nextDouble()
    println("Please enter object's width: ")
    val width = scanner.nextDouble()
    println("Please enter object's height: ")
    val height = scanner.nextDouble()

    when {
        box3.validate(length, width, height) -> print("Box3")
        box5.validate(length, width, height) -> print("Box5")
        else -> print("Can't put object to Box3 and Box5 ")
    }

}

open class Box(
    var length: Double,
    var width: Double,
    var height: Double
) {
    fun validate(l: Double, w: Double, h: Double): Boolean {
        return length < l && width < w && height < h
    }
}

class Box3 : Box(23.toDouble(), 14.toDouble(), 13.toDouble())

class Box5 : Box(39.5, 27.5, 23.toDouble())