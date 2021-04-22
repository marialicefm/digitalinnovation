package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5) //precisa passar um tamanho pro array no parênteses

    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    println("PRINTANDO COM FOR ...")
    for (valor in values) { //imprime todos os valores do array
        println(valor)
    }


    //o it é a nossa variável que o kotlin já mostra quando tem forEach
    println("PRINTANDO COM FOR EACH ...")
    values.forEach {
        println(it)
    }

    println("PRINTANDO COM INDICES ...")
    for (valor in values.indices) {
        println(values[valor]) //recupera o valor que está naquela posição específica
    }


}