package one.digitalinnovation.collections

fun main (){
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "CLT")
    val Maria = Funcionario("Maria", 1810.0, "PJ")

    val funcionarios = mutableListOf(Joao, Maria) //lista que consegue alterar

    funcionarios.forEach {
        println (it)
    }

    println ("\n---ADICIONANDO FUNCIONÁRIO---")
    funcionarios.add(Pedro)
    funcionarios.forEach {
        println (it)
    }

    println ("\n---REMOVENDO FUNCIONÁRIO---")
    funcionarios.remove(Joao)
    funcionarios.forEach {
        println (it)
    }

    println ("\n---CONJUNTO DE FUNCIONÁRIOS---")
    val funcionariosSet = mutableSetOf(Joao) //conjunto que possui joão como funcionario
    funcionariosSet.forEach {
        println (it)
    }

    println ("\n *** ADICIONANDO 2 FUNCIONÁRIOS ***")
    funcionariosSet.add(Pedro) //adiciona pedro ao conjunto de funcionários
    funcionariosSet.add(Maria) //adiciona maria ao conjunto de funcionários
    funcionariosSet.forEach {
        println (it)
    }

    println ("\n *** DEMITINDO 1 FUNCIONÁRIO ***")
    funcionariosSet.remove(Maria) //removendo maria do conjunto de funcionários
    funcionariosSet.forEach {
        println (it)
    }
}