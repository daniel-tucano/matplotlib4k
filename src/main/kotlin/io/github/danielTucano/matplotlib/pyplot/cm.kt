package io.github.danielTucano.matplotlib.pyplot

import io.github.danielTucano.matplotlib.Colormap

enum class ColorMaps : Colormap {
    Blues, BrBG, BuGn, BuPu, CMRmap, GnBu, Greens, Greys, OrRd, Oranges, PRGn, PiYG,
    PuBu, PuBuGn, PuOr, PuRd, Purples, RdBu, RdGy, RdPu, RdYlBu, RdYlGn, Reds, Spectral,
    Wistia, YlGn, YlGnBu, YlOrBr, YlOrRd, afmhot, autumn, binary, bone, brg, bwr, cool,
    coolwarm, copper, cubehelix, flag, gist_earth, gist_gray, gist_heat, gist_ncar, gist_rainbow,
    gist_stern, gist_yarg, gnuplot, gnuplot2, gray, hot, hsv, jet, nipy_spectral, ocean, pink,
    prism, rainbow, seismic, spring, summer, terrain, winter;

    override val variableName: String = "plt.cm.${this@ColorMaps.name}"

}