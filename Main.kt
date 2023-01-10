import java.awt.print.PrinterIOException
import java.time.LocalDate
import java.time.Month
import java.time.Period
import java.util.Date
import java.util.SimpleTimeZone
import java.util.stream.Collector.Characteristics
import kotlin.system.exitProcess

//PROJETO DE PRÉ MATRÍCULA DE UM CURSO

//1-Verificar se nome é menor que 64 caracteres ou nulo
//2-Verificar se nome aceita somente caracter
//2-Conferir idade-Calcular o ano de nascimento com ano atual
//3-Conferir se idade é menor ou maior que 18 anos
//4-Três opções de cursos
//6-Usuario digitar dados (nome completo, cidade,DN)
//7-Imprimir o cadastro completo com todos os dados
//8-Finalizar com parabens!


fun subtrair2023(nascimento: Int): Int {
    return 2023.minus(nascimento)
}

fun verificaLetras(str: String): Boolean {
    for (char in str) {
        if (char.isLetter() == false) {
            return false;
        }
    }

    return true
}

//Passo 1-Verificar se nome é menor que 64 caracteres ou nulo
//2-Verificar se nome aceita somente caracter
fun main() {
    println("Olá, qual o seu nome completo?")
    var nome: String = readlnOrNull()!!
    while (nome.length > 64 || verificaLetras(nome) == false) {
        println("Nome inválido")
        nome = readlnOrNull()!!
    }

//2-Conferir idade-Calcular o ano de nascimento com ano atual
    println("Digite o ano do seu nascimento")
    val nascimento: Int = readln().toInt()
    val resultado = 2023.minus(nascimento)

//3-Conferir se idade é menor ou maior que 18 anos
    println("${if (resultado >= 18) "Ok, sua idade é $resultado e é maior de 18 anos" else "Você ainda não é maior de idade"}")

//4-Três opções de cursos
    print(
        """Das opções abaixo, digite a opção do curso desejado: 
        |1 Gestão de Recursos Humanos 
        |2 Análise e Desenvolvimento de Sistemas 
        |3 Pedagogia
        |""".trimMargin()
    )
    var entrada = readln()
    var opcurso: Int = 0
    try {
        opcurso = entrada.toInt()
    } catch (erro: NumberFormatException) {
        println("Você digitou algo diferente de um número.")

    }
    var curso1 = "Gestão de Recurso HUmanos"
    var curso2 = "Análise e Desenvolvimento de Sistemas"
    var curso3 = "Pedagogia"
    if (opcurso != 1 && opcurso != 2 && opcurso != 3) {
        println("Sua opção de curso é INVÁLIDA, digite novamente")
    } else {
        if (opcurso == 1) {
            println("O curso selecionado foi $curso1")
        } else {
            if (opcurso == 2) {
                println("O curso selecionado foi $curso2")
            } else {
                if (opcurso == 3) {
                    println("O curso selecionado foi $curso3")
                }
            }
        }
    }

    println("Informe os seguintes dados para Matrícula:")
    print("Naturalidade:")
    var cidade: String = readlnOrNull()!!


    print("Nome completo:")
    var nomecompleto: String = readlnOrNull()!!

    println("Seus dados estão corretos?")
    println(
        """$nomecompleto
        | $resultado anos
        | $cidade
        | $entrada
        | """.trimMargin()
    )
    var resposta: String= readln()
    if (resposta=="Sim || SIM"){
        println("Sim,  pré matrícula efetuada com sucesso.")
    }else{
        println("Sua pré matrícula não foi efetuada.")
    }

}