package one.digitalinnovation.collections

fun main () {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "CLT")
    val Maria = Funcionario("Maria", 1810.0, "PJ")

    val funcionariosCLT = setOf(Joao, Pedro)
    val funcionariosPJ = setOf(Maria)

    println("\n UNINDO OS DOIS CONJUNTOS DE FUNCIONÁRIOS")
    val resultUnion = funcionariosCLT.union(funcionariosPJ)
    resultUnion.forEach {
        println(it)
    }

    println("\n RETIRANDO O FUNCIONÁRIO QUE JÁ ESTÁ NO CONJUNTO PJ")
    val funcionarios3 = setOf(Joao, Pedro, Maria)
    val resultSubtract = funcionarios3.subtract(funcionariosPJ)
    resultSubtract.forEach {
        println(it)
    }

    println("\n FUNCIONÁRIOS EM COMUM AOS DOIS CONJUNTOS")
    val resultIntersect = funcionarios3.subtract(funcionariosPJ)
    resultIntersect.forEach {
        println(it)
    }
}
