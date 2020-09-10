package com.seeju.xkik.data

import com.jaqxues.akrolyb.prefs.Preference
import com.jaqxues.akrolyb.prefs.Types.Companion.genericType



object Preferences {
    val SELECTED_PACKS = Preference<List<String>>(
        "selected_packs", emptyList(), genericType<List<String>>()
    )
}