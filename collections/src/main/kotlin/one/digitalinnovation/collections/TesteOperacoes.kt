package one.digitalinnovation.collections

fun main () {
    val salarios = doubleArrayOf(215.9, 845.6, 356.8)

    for (salario in salarios) {
        println(salario)
    }

    println(".........................")

    println("Maior salario: ${salarios.max()}") //pega o maior valor
    println("Menor salario: ${salarios.min()}") //pega o menor valor
    println("Media salarial: ${salarios.average()}") //dá a média dos salários

    val salariosMaiorQue500 = salarios.filter {
        it > 500.0
    }

    println("\nTODOS OS SALÁRIOS MAIORES QUE R$ 500:")
    salariosMaiorQue500.forEach {
        println(it)
    }

    println ("QUANTOS ELEMENTOS TEM ENTRE R$ 200 E R$1000?")
    println (salarios.count { it in 200.0..1000.0}) //conta quantos elementos tem entre 200 e 1000

    println ("BUSCANDO UM VALOR ESPECÍFICO:")
    println (salarios.find { it == 215.9 }) //busca um valor específico através do que é passado no it
    println (salarios.find { it == 520.8 }) //busca um valor específico que não existe

    println ("O VALOR EXISTE?")
    println (salarios.any { it == 215.9 }) //busca qualquer valor através do que é passado no it e valida o elemento
    println (salarios.any { it == 315.8 }) //busca qualquer valor através do que é passado no it e valida o elemento

}
