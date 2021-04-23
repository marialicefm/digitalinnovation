package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3){""} //tipo de array que está sendo criado
    nomes[0] = "Maria"
    nomes[1] = "Pedro"
    nomes[2] = "Alice"

    for (nome in nomes) {
        println (nome + "\n")
    }

    println ("ORDENANDO OS NOMES...")

    nomes.sort()

    nomes.forEach {
        println (it)
    }

    println ("\nNOVOS NOMES...")
    val nomes2 = arrayOf("Pedro", "Henrique", "Luisa")

    nomes2.sort()

    nomes2.forEach {
        println(it)
    }
}