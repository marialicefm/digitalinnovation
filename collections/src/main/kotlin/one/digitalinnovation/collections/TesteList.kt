package one.digitalinnovation.collections

fun main () {
    val Joao = Funcionario("Joao", 2000.0)
    val Pedro = Funcionario("Pedro", 1500.0)
    val Maria = Funcionario("Maria", 1810.0)

    val funcionarios = listOf<Funcionario>(Joao, Pedro, Maria)

    funcionarios.forEach {
        println(it)
    }

    println ("\nENCONTRANDO A FUNCIONÁRIA 'MARIA'")
    println (funcionarios.find { it.nome == "Maria"})

    println ("\nORDENANDO OS FUNCIONÁRIOS POR SALÁRIO")
    funcionarios.sortedBy { it.salario }.forEach{
        println (it)
    }

    println ("\nORDENANDO OS FUNCIONÁRIOS POR NOME")
    funcionarios.sortedBy { it.nome }.forEach{
        println (it)
    }
}

data class Funcionario (
    val nome: String,
    val salario: Double
    ) {
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}

