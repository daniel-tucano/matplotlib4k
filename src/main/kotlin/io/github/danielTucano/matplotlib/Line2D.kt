package io.github.danielTucano.matplotlib

interface Line2D: Artist {

    companion object {
        internal var line2DNumber: Int = 0
            get() {
                field++
                return field
            }
        private set
    }

    enum class Line2DArgs: KwargKey {linewidth, linestyle, color, marker, markersize, markeredgewidth, markeredgecolor, markerfacecolor,
        markerfacecoloralt, fillstyle, antialiased, dash_capstyle, solid_capstyle, dash_joinstyle, solid_joinstyle, pickradius,
        drawstyle, markevery}

}