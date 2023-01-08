enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

 data class Usuario(val nome: String, val id : Int)
  
data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel :String)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
 	inscritos.add(usuario)
    //  TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    
    val usuario = Usuario ("lenivaldo", 1) 
    val usuario1 = Usuario("João", 2)
     val grau = Nivel.BASICO
    val dificuldade = when (grau){
        Nivel.BASICO -> "BÁSICO"
        Nivel.INTERMEDIARIO -> "INTERMEDIÁRIO"
        Nivel.AVANCADO -> "AVANÇADO"
        
    }
        val grau1 = Nivel.INTERMEDIARIO
    val dificuldade1 = when (grau1){
        Nivel.BASICO -> "BÁSICO"
        Nivel.INTERMEDIARIO -> "INTERMEDIÁRIO"
        Nivel.AVANCADO -> "AVANÇADO"
        
    }
        val grau2 = Nivel.AVANCADO
    val dificuldade2 = when (grau2){
        Nivel.BASICO -> "BÁSICO"
        Nivel.INTERMEDIARIO -> "INTERMEDIÁRIO"
        Nivel.AVANCADO -> "AVANÇADO"
        
    }
   
    val conteudo = ConteudoEducacional("Tipos de Funções em kotlin", 2, dificuldade)
    val conteudo1 = ConteudoEducacional("Controle de Fluxo em kotlin", 5, dificuldade1)
    val conteudo2 = ConteudoEducacional("Funções de Escopo em Kotlin", 5, dificuldade2)
    val biblioteca = mutableListOf<ConteudoEducacional>()
    biblioteca.add(conteudo)
    biblioteca.add(conteudo1)
    biblioteca.add(conteudo2)
    
    val formacao = Formacao("Kotlin", biblioteca)
    formacao.matricular(usuario)
    formacao.matricular(usuario1)
    
   
	
    
       
    println(formacao.inscritos)
    println(formacao)

    
    
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
