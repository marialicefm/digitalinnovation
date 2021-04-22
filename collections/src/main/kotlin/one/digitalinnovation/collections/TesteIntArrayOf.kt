package one.digitalinnovation.collections

fun main(){
    val values = intArrayOf(1,20,12,16,8)

    // it é o objeto que representa o valor naquele momento
    values.forEach {
        println (it)
    }

    println ("IMPRIME COM VALOR ORDENADO...")
    values.sort()
    values.forEach {
        println(it)
    }
}