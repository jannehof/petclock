import sun.misc.Signal
import java.lang.Thread.sleep
import java.time.LocalDateTime
import java.util.*
import kotlin.math.max
import kotlin.system.exitProcess

fun main(args: Array<String>) {


    fun stringToDigits(time: String): Array<Int> {

        // lock up what to print
        var digits = emptyArray<Int>()

        time.forEach {
            val number = it.code - 48
            //println("$it $number")
            digits = when (number) {
                // 10 is colon
                // 11 is semicolon
                in 0..10 -> digits.plus(it.code - 48)
                else -> {
                    println("unknown char")
                    digits.plus(11)
                }
            }
        }
        return digits
    }

    fun printLargeDigits(digitArray: Array<Int>, inverted: Boolean) {

        val bitmap = getClockBitmap()

        // do the print
        for (row in 0..6) {
            // row
            for (index in digitArray.indices) {
                for (col in 0..4) {
                    myPrint(bitmap[digitArray[index]][row][col], inverted)
                }
                myPrint(0)
            }
            println()
        }

    }

    fun clearScreen() {
        val os = System.getProperty("os.name").lowercase(Locale.getDefault())
        val onWindows = os.startsWith("windows")

        if (onWindows) {
            try {
                ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor()
            } catch (e : Exception) {
                // TODO
            }
        } else{
            print("\u001b[H\u001b[2J") // clear screen
        }

        println(os)
        println(onWindows)
    }

    val startTime = System.currentTimeMillis()

    Signal.handle(Signal("INT")) {
        val elapsedTime = (System.currentTimeMillis() - startTime) / 1000.0
        println("\nThe program has run for $elapsedTime seconds")
        exitProcess(0)
    }

    Signal.handle(Signal("TERM")) {
        val elapsedTime = (System.currentTimeMillis() - startTime) / 1000.0
        println("\nThe program has run for $elapsedTime seconds")
        exitProcess(0)
    }

    var count = 0


    while (true) {
        count += 1

        val current = LocalDateTime.now()

        // Layout to print
        clearScreen()

        println("Current Date and Time is: $current")
        println()
        printLargeDigits(
            stringToDigits(
                current.hour.toString().padStart(2, '0') + ":" +
                        current.minute.toString().padStart(2, '0') + ":" +
                        current.second.toString().padStart(2, '0')
            ) ,false)


        println()
        val sleepTime = max(998 - current.nano / 1_000_000L, 0)
        // print(sleepTime)
        sleep(sleepTime)  // sleep until next second
    }
}