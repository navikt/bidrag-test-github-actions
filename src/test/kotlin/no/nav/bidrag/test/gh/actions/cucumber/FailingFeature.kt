package no.nav.bidrag.test.gh.actions.cucumber

import io.cucumber.java.no.Så

class FailingFeature {

    @Så("rapporterer cucumber feil")
    fun skal_cucumber_rapportere_feil() {
        // Write code here that turns the phrase above into concrete actions
        throw IllegalStateException("manglende implementasjon")
    }

}