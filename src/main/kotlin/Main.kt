import kotlin.random.Random

fun main()
{
    println("Камень-Ножницы-Бумага")

    var win: String?

    do
    {
        val p = getP()
        val c = getC()

        println("вы выбрали: ${ss(p)}")
        println("компьютер выбрал: ${ss(c)}")

        win = wins(p, c)

        if (win == null)
        {
            println("ничья :(\n")
        }

        else
        {
            println("$win выигрывает")
        }
    }

    while (win == null)
}

fun getP(): Int
{
    println("1-камень, 2-ножницы, 3-бумага:")

    return readLine()?.toIntOrNull() ?: getP()
}

fun getC(): Int
{
    return Random.nextInt(1, 4)
}

fun ss(choice: Int): String
{
    return when (choice)
    {
        1 -> "Камень"
        2 -> "Ножницы"
        3 -> "Бумага"
        else -> "Неизвестно"
    }
}

fun wins(playS: Int, compS: Int): String?
{
    if (playS == compS) return null

    return when (playS)
    {
        1 -> if (compS == 2) "wxlksy" else "Computer"
        2 -> if (compS == 3) "wxlksy" else "Computer"
        3 -> if (compS == 1) "wxlksy" else "Computer"
        else -> null
    }
}