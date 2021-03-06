package org.jetbrains.dokka.allModulesPage.templates

import org.jetbrains.dokka.base.templating.SubstitutionCommand

fun interface Substitutor {
    fun trySubstitute(context: TemplatingContext<SubstitutionCommand>, match: MatchResult): String?
}