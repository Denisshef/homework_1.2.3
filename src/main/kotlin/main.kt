fun main() {
    val buyPastMonth = true
    var buyThisMonth = 15000.0

    if (buyThisMonth <= 10000) {
        buyThisMonth -= 100
        println("==> скидка при покупке свыше 1000 р. -> 100 р.")
    } else if (buyThisMonth > 1000) {
        println("==> скидка 5% -> ${buyThisMonth * 0.05} р.")
        buyThisMonth -= (buyThisMonth * 0.05)
    }

    if (buyPastMonth) {
        println("==> скидка \"Меломан\" 1% -> ${buyThisMonth * 0.01} р.")
        buyThisMonth -= (buyThisMonth * 0.01)
    }

    println("Итого к оплате с учетом всех скидок -> $buyThisMonth р.")
}