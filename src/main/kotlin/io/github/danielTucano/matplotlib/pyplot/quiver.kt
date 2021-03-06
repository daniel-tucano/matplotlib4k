package io.github.danielTucano.matplotlib.pyplot

import io.github.danielTucano.extensions.toPythonNumberArrayStringOrEmpty
import io.github.danielTucano.extensions.toPythonStringOrNone
import io.github.danielTucano.extensions.toPythonStringQuotedOrNone
import io.github.danielTucano.matplotlib.Axes
import io.github.danielTucano.matplotlib.Quiver
import io.github.danielTucano.matplotlib.Quiver.Companion.quiverNumber
import io.github.danielTucano.matplotlib.np.NPVar
import io.github.danielTucano.matplotlib.toPythonColorTupleArrayOrNone
import io.github.danielTucano.python.PythonScriptBuilder
import java.awt.Color

fun quiver(
    xValues: NPVar,
    yValues: NPVar,
    uValues: NPVar,
    vValues: NPVar,
    units: Axes.QuiverUnitsOptions? = null,
    angles: Axes.QuiverAnglesOptions? = null,
    scale: Double? = null,
    scale_units: Axes.QuiverScaleUnitsOptions? = null,
    width: Double? = null,
    headwidth: Double? = null,
    headlength: Double? = null,
    headaxislegth: Double? = null,
    minshaft: Double? = null,
    minlength: Double? = null,
    pivot: Axes.QuiverPivotOptions? = null,
    color: List<Color> = listOf(Color.BLACK),
    zorder: Double = 3.0
): Quiver {
    return object : Quiver {
        override val variableName: String = "quiver_$quiverNumber"
        init {
            PythonScriptBuilder.addCommand(
                "${this.variableName} = plt.quiver(" +
                        "${xValues.variableName}," +
                        "${yValues.variableName}," +
                        "${uValues.variableName}," +
                        "${vValues.variableName}," +
                        "units=${units.toPythonStringQuotedOrNone()}," +
                        "angles=${angles.toPythonStringQuotedOrNone()}," +
                        "scale=${scale.toPythonStringOrNone()}," +
                        "scale_units=${scale_units.toPythonStringQuotedOrNone()}," +
                        "width=${width.toPythonStringOrNone()}," +
                        "headwidth=${headwidth.toPythonStringOrNone()}," +
                        "headlength=${headlength.toPythonStringOrNone()}," +
                        "headaxislegth=${headaxislegth.toPythonStringOrNone()}," +
                        "minshaft=${minshaft.toPythonStringOrNone()}," +
                        "minlength=${minlength.toPythonStringOrNone()}," +
                        "pivot=${pivot.toPythonStringQuotedOrNone()}," +
                        "color=${color.toPythonColorTupleArrayOrNone()}," +
                        "zorder=${zorder.toPythonStringOrNone()}" +
                        ")"
            )
        }
    }
}

fun quiver(
    xValues: List<Double>,
    yValues: List<Double>,
    uValues: List<Double>,
    vValues: List<Double>,
    units: Axes.QuiverUnitsOptions? = Axes.QuiverUnitsOptions.width,
    angles: Axes.QuiverAnglesOptions? = null,
    scale: Double? = null,
    scale_units: Axes.QuiverScaleUnitsOptions? = null,
    width: Double? = null,
    headwidth: Double = 3.0,
    headlength: Double = 5.0,
    headaxislength: Double = 4.5,
    minshaft: Double = 1.0,
    minlength: Double = 1.0,
    pivot: Axes.QuiverPivotOptions = Axes.QuiverPivotOptions.tail,
    color: List<Color> = listOf(Color.BLACK),
    zorder: Double = 3.0
): Quiver {
    return object : Quiver {
        override val variableName: String = "quiver_$quiverNumber"
        init {
            PythonScriptBuilder.addCommand(
                "${this.variableName} = plt.quiver(" +
                        "${xValues.toPythonNumberArrayStringOrEmpty()}," +
                        "${yValues.toPythonNumberArrayStringOrEmpty()}," +
                        "${uValues.toPythonNumberArrayStringOrEmpty()}," +
                        "${vValues.toPythonNumberArrayStringOrEmpty()}," +
                        "units=${units.toPythonStringQuotedOrNone()}," +
                        "angles=${angles.toPythonStringQuotedOrNone()}," +
                        "scale=${scale.toPythonStringOrNone()}," +
                        "scale_units=${scale_units.toPythonStringQuotedOrNone()}," +
                        "width=${width.toPythonStringOrNone()}," +
                        "headwidth=${headwidth.toPythonStringOrNone()}," +
                        "headlength=${headlength.toPythonStringOrNone()}," +
                        "headaxislength=${headaxislength.toPythonStringOrNone()}," +
                        "minshaft=${minshaft.toPythonStringOrNone()}," +
                        "minlength=${minlength.toPythonStringOrNone()}," +
                        "pivot=${pivot.toPythonStringQuotedOrNone()}," +
                        "color=${color.toPythonColorTupleArrayOrNone()}," +
                        "zorder=${zorder.toPythonStringOrNone()}" +
                        ")"
            )
        }
    }
}