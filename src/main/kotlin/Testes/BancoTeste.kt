package Testes

import one.digitalinnovation.digionebank.Banco

fun main (){
    val digioneBank = Banco(nome = "Digione", numero = 12)

    println(digioneBank.nome)
    println(digioneBank.numero)

    val banco2 = digioneBank.copy("nubank")

    println(banco2.info())
    println(banco2.nome)

}