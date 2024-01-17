import java.math.RoundingMode

fun main() {
    println("Enter Temperature")
    val userInput: String = readln()
    TempConverter(userInput)
//    println(
//        "Converted Temperature is: ${
//            TempConverter().fahrenheit("0").toBigDecimal().setScale(2, RoundingMode.HALF_EVEN)
//        } \u2109"
//    )
//    //println(TempConverter().fahrenheit("100"))
//    println(
//        "Converted Temperature is:${
//            TempConverter().celsius("0").toBigDecimal().setScale(2, RoundingMode.HALF_EVEN)
//        }\u2103"
//    )

    val switch = true
    try {
        if (switch) {
            println(
                "Converted Temperature is: ${
                    TempConverter(userInput).fahrenheit().toBigDecimal().setScale(2, RoundingMode.HALF_EVEN)
                } \u2109"
            )
        } else {
            println(
                "Converted Temperature is:${
                    TempConverter(userInput).celsius().toBigDecimal().setScale(2, RoundingMode.HALF_EVEN)
                }\u2103"
            )
        }
    } catch (_: Exception) {
        println("Wrong Input")

    }


}

class TempConverter(private val inputData: String) {

    fun fahrenheit(): Double {

        return inputData.toDouble() * 9 / 5 + 32
    }

    fun celsius(): Double {
        return (inputData.toDouble() - 32) * 5 / 9
    }
}
