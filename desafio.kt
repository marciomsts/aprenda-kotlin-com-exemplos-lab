// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome:String)

data class ConteudoEducacional(val nome: String, var duracao: Int){
   
    fun alterarDuracao(duracao:Int){
        this.duracao =duracao
    }
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel:Nivel) {
	
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario){
        this.inscritos.add(usuario) 
        println("Aluno adicionado com sucesso")
        
    }
}

fun main() {
   // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
	
    var novoUsuario:Usuario=Usuario("Marcio");
    var novoConteudo:ConteudoEducacional=ConteudoEducacional("Desenvolvimento kotlin",120)
    var novoConteudo2:ConteudoEducacional =ConteudoEducacional("Banco de Dados",70)
    val conteudos:List<ConteudoEducacional> =listOf(novoConteudo,novoConteudo2)
    var desenvolverdor:Formacao = Formacao("Desenvolvedor Kotlin",conteudos,Nivel.INTERMEDIARIO)
    desenvolverdor.matricular(novoUsuario)