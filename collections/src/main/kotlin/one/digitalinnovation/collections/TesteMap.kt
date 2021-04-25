package one.digitalinnovation.collections

fun main () {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0) //cria um par de chave - valor
    val map1 = mapOf(pair) //mapeia o par no map1

    map1.forEach { (t, u) ->
        println("Chave: $t - Valor: $u")
    }

    val map2 = mapOf("Maria" to 2500.0, "Pedro" to 3600.0) //referenciando chave - valor

    map2.forEach { a, b ->
        println("Chave: $a - Valor: $b")
    }

}