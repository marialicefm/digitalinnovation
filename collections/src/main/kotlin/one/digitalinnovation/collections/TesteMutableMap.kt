package one.digitalinnovation.collections

fun main (){
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "CLT")
    val Maria = Funcionario("Maria", 1810.0, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Pedro.nome, Pedro)
    repositorio.create(Maria.nome, Maria)

    println (repositorio.findById(Maria.nome))

    println ("\n-------LISTANDO TODOS OS FUNCIONÁRIOS-------")
    repositorio.findAll().forEach {
        println (it)
    }

    println ("\n-------DEPOIS DE REMOVER A MARIA-------")
    repositorio.remove(Maria.nome)
    repositorio.findAll().forEach {
        println (it)
    }
}