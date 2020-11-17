package co.edu.uniquindio.compiladores.sintaxis

class Decision(var expresionLogica: ExpresionLogica, var listaSentencia: ArrayList<Sentencia>, var listaSentenciaAltro:ArrayList<Sentencia>?):Sentencia() {

    override fun toString(): String {
        return "Desicion(expresionLogica=$expresionLogica, listaSentencia=$listaSentencia)"
    }


}