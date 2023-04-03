fun main (){
    //Introdução ao kotlin

    //Variáveis e Constantes

     var a: Int = 10
    val b: Int = 5
    println("Var: " + a + " " + " Val: " + b)
    a = 4
    println("Novo Var:  " + a + " " + " Val: " + b)

    /*a palavra chave "var" cria variáveis com valores mutáveis,
    ou seja, pode ser mudado em qualquer parte do código,
    já a palavra chave "val" é uma constante, que depois de atribuir um valor
    continua com ele em todo código.*/

    //Tipos de Dados

    //a)
    println("==============")
    var NumeroDecimal : Double = 1.5
    println("O tipo de dado para armazenar o valor: " + NumeroDecimal + " " + "é do tipo Flutuante Double")

    //b

    var Texto: String = "Kotlin"
    var Inteiro: Int = 2011
    println("O tipo de dado para armazenar o: " + Texto + " " + "é uma string e para números inteiros: " + Inteiro + " " + "é do tipo Inteiro")

    //c

    var inteiro: Int = 12
    var decimal: Double = 1.2
    println("O tipo de dado para armazenar o: " + inteiro + " " + "é Inteiro e para número decimal: " + decimal + " " + "é do tipo flutuante")
    println("==============")

    //Operadores

    //a)

    var numero1: Int = 2
    var numero2: Int = 2
    var Soma: Int = numero1 + numero2
    println(Soma)

    //b

    var falso: Boolean = 5 < 3 && 2 < 4
    println("Será um valor falso:"+ falso + " " + "porque os números não são os maiores")

    //c

    var  NaoLogico: Boolean = !(10 > 5 || 3 < 1)
    println("Será falso:" + NaoLogico +" "+"porque a expressão (!) inverte o resultado do valor mesmo que na expressão (||) torna-se uma verdadeira " )
    println("==============")

    //Entrada, processamento e sáida

    //a)

    var primeiroNum: Int
    var segundoNum: Int
    println("Entre com o primeiro número: ")
    primeiroNum = readln().toInt()

    println("Entre com o segundo número: ")
    segundoNum = readln().toInt()

    var Soma2: Int = primeiroNum + segundoNum

    println("A soma dos númeoros é: "+Soma2)

    //b)

    var quadrado: Int
    println("Entre com um número inteiro: ")
    quadrado = readln().toInt()

    var NumeroaoQuadrado = quadrado * 2

    println("O número ao quadrado é: "+NumeroaoQuadrado)

    //c)

    var nome: String
    var idade: Int
    println("Entre com o seu nome: ")
    nome = readln().toString()

    println("Entre com a sua idade: ")
    idade = readln().toInt()

    println("Seja Bem Vindo(a)!! "+nome+" "+"de"+" "+idade+" "+"anos,"+" "+"está velho(a) ein kkk")
    println("==============")
    // If Else

    //1-

    var nota1: Int
    var nota2: Int

    println("Entre com a sua primeira nota ")
    nota1 = readln().toInt()

    println("Entre com a sua segunda nota ")
    nota2 = readln().toInt()

    var media: Int = nota1 + nota2

    if (media >= 7){
        println("Você foi Aprovado!")
    }else{
        println("Você foi Reprovado!")
    }

    //2-

    var imparPar: Int
    println("Entre com um número: ")
    imparPar = readln().toInt()

    var par = imparPar / 2

    if (imparPar = par){
        println(imparPar+" "+"É par")
    }else{
         println(imparPar+" "+"É par")
    }

    //3-

    var Positivo_Negativo_Zero
    println("Entre com um número: ")
    Positivo_Negativo_Zero = readln().toInt()

    if (Positivo_Negativo_Zero = +)
    {
    println(Positivo_Negativo_Zero+" "+"Este número é positivo")
    }
    else if(Positivo_Negativo_Zero = -)
    {
    print(Positivo_Negativo_Zero+" "+"Este número é negativo")
    }
    else(Positivo_Negativo_Zero = 0){
        println(Positivo_Negativo_Zero)
    }

    // 4-

    var Idade: Int
    println("Entre com a sua idade: ")
    Idade = readln().toInt()

    if (Idade >= 18 ){
        println(Idade" "+"É maior de idade")
    }else{
        println(Idade+" "+"É maior de idade")
    } 

    // When

    //1-

    println("Entre com um número para o dia da semana: ")
    val dia = readln().toInt()
    val resultado = when (dia) {
        1 -> "Segunda-feira"
        2 -> "Terça-feira"
        3 -> "Quarta-feira"
        4 -> "Quinta-feira"
        5 -> "Sexta-feira"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Dia inválido"
    }
    println(resultado)

    //2-

    println("Entre com um animal: ")
    val animal = readln().toString()
    val Animal = when (animal) {
        "Cachorro" , "Vaca" , "Gato" , "Baleia" -> "Mamífero"
        "Urubo" , "Bem-te-vi" , "Pica Pau" , "Águia" -> "Ave"
        "Tartaruga" , "Cobra" , "Jacaré" , "Lagarto" -> "Réptil"
        else -> "Animal Não Encontrado"
    }
    println(Animal)

    //3-

    println("Entre com uma letra: ")
    val VogalConsoante = readln().toString()
    val vogalconsosante_Resultado = when (VogalConsoante) {
        "a" , "e" , "i" , "o" , "u" -> "Vogal"
        "b" , "c" , "d" , "f" , "g" , "h" , "j" , "k" , "f" , "l" , "m" , "n" , "p" , "q" , "v" , "x" , "z"-> "Consoante"
        else -> "Isso não é uma letra"
    }
    println(vogalconsosante_Resultado)

    //4-

    println("Entre com um número do mês: ")
    val mes = readln().toInt()
    val resultadoMes = when (mes) {
        1 -> "janeiro"
        2 -> "fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agsoto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "novembro"
        12 -> "Dezembro"
        else -> "Mês inválido"
    }
    println(resultadoMes)

    println("Entre com um número para o dia da semana: ")
    val dia = readln().toInt()
    val resultado = when (dia) {
        1 -> "Segunda-feira"
        2 -> "Terça-feira"
        3 -> "Quarta-feira"
        4 -> "Quinta-feira"
        5 -> "Sexta-feira"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Dia inválido"
    }
    println(resultado)

}
