import arrow.core.Option
import arrow.core.Some
import arrow.core.None

data class Prenome(val simples: String, val composto: List<String>?)
data class Sobrenome(val particula: String?, val familia: List<String>)

fun gerarNome(n: String) = Some(Prenome(n, null))

