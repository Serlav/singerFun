fun main() {
    var purchaseAmount = 20000.0 //сумма покупки
    val singerFun = true    //постоянный клиент
    var discount: Double

    if ((purchaseAmount >= 1001) && (purchaseAmount <= 10000)) {
        purchaseAmount -= 100
    } else if (purchaseAmount >= 10001) {
        purchaseAmount *= 0.95
    }

    if (singerFun) discount = 0.99
    else discount = 1.0

    purchaseAmount *= discount

    println("Сумма к оплате: $purchaseAmount")
}