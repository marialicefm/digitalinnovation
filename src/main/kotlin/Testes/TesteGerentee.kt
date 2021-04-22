package one.digitalinnovation.digionebank.Testes

import Testes.TesteAutenticacao
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main () {
    val marialice = Gerente(nome = "Marialice", cpf = "087.887.894-70", salario = 5000.0, senha = "senha123")

    ImprimeRelatorioFuncionario.imprime(marialice)

    TesteAutenticacao().autentica(marialice)
}



