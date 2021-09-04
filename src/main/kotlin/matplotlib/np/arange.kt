package matplotlib.np

import matplotlib.np.NPVar.Companion.npVarNumber
import python.PythonScriptBuilder

fun arange(limInf: Double, limSup: Double, step: Double): NPVar {
    return object : NPVar {
        override val variableName: String = "np_var_$npVarNumber"
        init {
            PythonScriptBuilder.addCommand("$variableName = np.arange($limInf,$limSup,$step)")
        }
    }
}