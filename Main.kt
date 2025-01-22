data class Player(val name: String, val points: Int, val money: Double)

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val sum = numbers.filter { it in 3..9 }.sum()
    println("Сумма элементов от 3 до 9: $sum")

    val result: String = numbers.fold("") { acc: String, number: Int -> acc + number }
    println("Элементы списка в строку: $result")

    val players = listOf(
        Player("Игрок1", 10, 100.0),
        Player("Игрок2", 20, 200.0),
        Player("Игрок3", 30, 300.0)
    )

    val totalPoints = players.sumOf { it.points }
    val totalMoney = players.sumOf { it.money }
    println("Общее количество очков: $totalPoints")
    println("Общее количество выигранных денег: $totalMoney")

    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")

    val groupedFruits = fruits.filter { it.length % 2 == 0 }
        .groupBy { it.first().lowercaseChar() }

    println("Группировка фруктов по первому символу: $groupedFruits")
}