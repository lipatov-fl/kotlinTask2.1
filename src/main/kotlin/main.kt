package ru.netology

fun main() {
    val amount: Int = 55000
    val minTranslation: Int = 35
    val minCommission: Double = 0.75

    val amountCop: Int = amount * 100
    val minTranslationCop: Int = minTranslation * 100

    val sumCommission: Double = amountCop / 100 * 0.75


    if(sumCommission < minTranslationCop) {
        println("Сумма коммисии равна $minTranslation руб.")
    } else {
        val sumCommissionRub: Double = sumCommission / 100
        println("Сумма коммисии равна $sumCommissionRub руб.")
    }
}