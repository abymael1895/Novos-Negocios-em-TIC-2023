fun main() {
    val funcionarios = Funcionarios()

    while (true) {
        println("Olá Seja Bem vindo(a) !!")
        println(" ")
        println("-=-= Sistema de Cadastro de Funcionários =-=-")
        println("1 - Cadastrar funcionário")
        println("2 - Ver funcionários")
        println("3 - Excluir funcionário")
        println("0 - Sair")
        println("Digite a opção desejada: ")
        val opcao = readLine()?.toIntOrNull()

        when (opcao) {
            1 -> funcionarios.cadastrarFuncionario()
            2 -> funcionarios.verFuncionarios()
            3 -> funcionarios.excluirFuncionario()
            0 -> return
            else -> println("Opção inválida. Por favor, tente novamente.")
        }
        println()
    }
}