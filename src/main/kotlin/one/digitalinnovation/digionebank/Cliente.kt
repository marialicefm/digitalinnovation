package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.ClienteTipo

class Cliente(
    nome: String,
    cpf: String,
    clienteTipo: ClienteTipo,
    val senha:String
): Pessoa(nome, cpf), Logavel {

    override fun login(): Boolean = "senha123456" == senha

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf

    """.trimIndent()
}