package com.PartyTyme87.ixiporn

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class IxipornPlugin: Plugin() {
    override fun load(context: Context) {
        // This registers your specific provider class so Cloudstream can see it
        registerMainAPI(ixipornProvider())
    }
}
