import java.io.File

data class Funcionario(val nome: String, val cargo: String, val salario: String)

class Funcionarios {
    fun cadastrarFuncionario() {
        print("Nome do funcionário: ")
        val nome = readLine()!!

        print("Cargo do funcionário: ")
        val cargo = readLine()!!

        print("Salário do funcionário: ")
        val salario = readLine()!!

        val funcionario = Funcionario(nome, cargo, salario)
        File("funcionarios.csv").appendText("${funcionario.nome},${funcionario.cargo},${funcionario.salario}\n")
        println("Funcionário cadastrado com sucesso!")
    }

    fun verFuncionarios() {
        val file = File("funcionarios.csv")
        if (!file.exists()) {
            println("Nenhum funcionário cadastrado.")
            return
        }

        val funcionarios = file.readLines()
        for (funcionario in funcionarios) {
            val (nome, cargo, salario) = funcionario.split(",")
            println("Nome: $nome")
            println("Cargo: $cargo")
            println("Salário: $salario")
            println()
        }
    }

    fun excluirFuncionario() {
        print("Digite o nome do funcionário que deseja excluir: ")
        val nome = readLine()!!

        val file = File("funcionarios.csv")
        if (!file.exists()) {
            println("Nenhum funcionário cadastrado.")
            return
        }

        val funcionarios = file.readLines()
        val funcionariosFiltrados = funcionarios.filter { it.split(",")[0] != nome }
        file.writeText(funcionariosFiltrados.joinToString("\n"))
        println("Funcionário excluído com sucesso!")
    }
}