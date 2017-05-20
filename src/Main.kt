/**
 * Created by QUANG on 5/20/2017.
 */


class Money constructor(val value: Int, val cen: String) {
    override fun toString() = value.toString() + " " + cen
}


fun main(args: Array<String>) {
    val x = Money(10000, "VND")
    println(x.toString())
    val y = Student("Quảng","20143620","CNTT 2-4","CNTT")
    y.showInfo()
}


