fun myPrint(input: Int, inverted : Boolean = false) {
    if (inverted) {
        when (input) {

            //0 -> print(" ")

            1 -> print("\u2588") // block
            0 -> print("\u2591")
        }
    } else {
        when (input) {
            1 -> print("\u2588") // block
            0 -> print(" ")
        }
    }
}

fun getClockBitmap(): Array<Array<IntArray>> {

    val d0: Array<IntArray> = arrayOf(
        intArrayOf(0, 1, 1, 1, 0),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(0, 1, 1, 1, 0),
    )

    val d1: Array<IntArray> = arrayOf(
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 1, 1, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(1, 1, 1, 1, 1),
    )

    val first2old = arrayOf(
        intArrayOf(0, 1, 1, 1, 0),
        intArrayOf(0, 0, 0, 0, 1),
        intArrayOf(0, 0, 0, 1, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 1, 0, 0, 0),
        intArrayOf(1, 0, 0, 0, 0),
        intArrayOf(1, 1, 1, 1, 1),
    )

    val d2 = arrayOf(
        intArrayOf(0, 1, 1, 1, 0),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(0, 0, 0, 1, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 1, 0, 0, 0),
        intArrayOf(1, 0, 0, 0, 0),
        intArrayOf(1, 1, 1, 1, 1),
    )

    val d3: Array<IntArray> = arrayOf(
        intArrayOf(0, 1, 1, 1, 0),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(0, 0, 0, 0, 1),
        intArrayOf(0, 0, 1, 1, 0),
        intArrayOf(0, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(0, 1, 1, 1, 0),
    )

    val d4 = arrayOf(
        intArrayOf(1, 0, 0, 0, 0),
        intArrayOf(1, 0, 0, 0, 0),
        intArrayOf(1, 0, 1, 0, 0),
        intArrayOf(1, 0, 1, 0, 0),
        intArrayOf(1, 1, 1, 1, 1),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
    )

    val d5 = arrayOf(
        intArrayOf(1, 1, 1, 1, 1),
        intArrayOf(1, 0, 0, 0, 0),
        intArrayOf(1, 0, 0, 0, 0),
        intArrayOf(1, 1, 1, 1, 0),
        intArrayOf(0, 0, 0, 0, 1),
        intArrayOf(0, 0, 0, 0, 1),
        intArrayOf(1, 1, 1, 1, 0),
    )

    val d6: Array<IntArray> = arrayOf(
        intArrayOf(0, 1, 1, 1, 0),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 0),
        intArrayOf(1, 1, 1, 1, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(0, 1, 1, 1, 0),
    )

    val d7: Array<IntArray> = arrayOf(
        intArrayOf(1, 1, 1, 1, 1),
        intArrayOf(0, 0, 0, 0, 1),
        intArrayOf(0, 0, 0, 1, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
    )

    val d8: Array<IntArray> = arrayOf(
        intArrayOf(0, 1, 1, 1, 0),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(0, 1, 1, 1, 0),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(0, 1, 1, 1, 0),
    )

    val d9: Array<IntArray> = arrayOf(
        intArrayOf(0, 1, 1, 1, 0),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(0, 1, 1, 1, 1),
        intArrayOf(0, 0, 0, 0, 1),
        intArrayOf(1, 0, 0, 0, 1),
        intArrayOf(0, 1, 1, 1, 0),
    )

    val dColon = arrayOf(
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 1, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
    )

    val dSemiColon = arrayOf(
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 1, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
        intArrayOf(0, 1, 0, 0, 0),
        intArrayOf(1, 0, 0, 0, 0),
        intArrayOf(0, 0, 0, 0, 0),
    )
    return arrayOf(d0, d1, d2, d3, d4, d5, d6, d7, d8, d9, dColon, dSemiColon)
}