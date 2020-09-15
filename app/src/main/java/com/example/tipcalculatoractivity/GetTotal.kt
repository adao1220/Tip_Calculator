package com.example.tipcalculatoractivity

enum class GetTotal {T1, T2, T3}

fun CalcSum(input: Double, getTotal: GetTotal): Double {
    val results = when(getTotal){
        GetTotal.T1 -> (input *(1.10))
        GetTotal.T2 -> (input *(1.20))
        GetTotal.T3 -> (input *(1.30))
    }
    return results.round(2)
}

fun GetTip( input: Double, getTotal: GetTotal): Double {
    val results = when (getTotal) {
        GetTotal.T1 -> (input * (.10))
        GetTotal.T2 -> (input * (.20))
        GetTotal.T3 -> (input * (.30))
    }
    return results.round(2)
}

private fun Double.round(decimals: Int): Double {
    var multiplier = 1.0
    repeat(decimals) { multiplier *= 10 }
    return kotlin.math.round(this * multiplier) / multiplier
}