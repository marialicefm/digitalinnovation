package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

abstract class Funcionario (
    nome: String, //quando sobescreve uma classe
    cpf: String,
    var salario: Double
    ) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio (): Double

    override fun toString(): String = """{
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    } """.trimIndent()
}