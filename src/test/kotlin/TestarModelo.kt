import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import arrow.core.Some

class TestarNomes : FunSpec () {
    init {
        test("Ordem dos nomes e sobrenomes") {
            gerarNome("Venceslau").shouldBe(Some(Prenome("Venceslau", null)))
        }
    }

}