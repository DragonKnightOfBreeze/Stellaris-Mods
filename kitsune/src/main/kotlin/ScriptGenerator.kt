package com.windea.mod.stellaris.kitsune

import java.io.*

fun main() {
	generatePortraitsScript()
}

private fun generatePortraitsScript() {
	val kitsuneIdeaCount = 32
	val kitsuneCount = 52

	val kitsuneDef = buildString {
		appendln("kitsune_idea = {texturefile = \"gfx/models/portraits/kitsune/kitsune_idea.dds\"}")
		repeat(kitsuneIdeaCount) {
			appendln("kitsune_idea_$it = {texturefile = \"gfx/models/portraits/kitsune/kitsune_idea_$it.dds\"}")
		}
		repeat(kitsuneCount) {
			appendln("kitsune_$it = {texturefile = \"gfx/models/portraits/kitsune/kitsune_$it.dds\"}")
		}
	}.trimEnd()
	val kitsuneRef = buildString {
		appendln("kitsune_idea")
		repeat(kitsuneIdeaCount) {
			appendln("kitsune_idea_$it")
		}
		repeat(kitsuneCount) {
			appendln("kitsune_$it")
		}
	}.trimEnd()
	val kitsuneIdeaRef = buildString {
		appendln("kitsune_idea")
		repeat(kitsuneIdeaCount) {
			appendln("kitsune_idea_$it")
		}
	}.trimEnd()
	val text = """
portraits = {
${kitsuneDef.prependIndent(1)}
}

portrait_groups = {
	kitsune = {
		default = kitsune_idea
		game_setup = {
			add = {
				portraits = {
${kitsuneRef.prependIndent(5)}
				}
			}
		}
		species = {
			add = {
				portraits = {
${kitsuneRef.prependIndent(5)}
				}
			}
		}
		pop = {
			add = {
				portraits = {
${kitsuneRef.prependIndent(5)}
				}
			}
		}
		leader = {
			add = {
				portraits = {
${kitsuneIdeaRef.prependIndent(5)}
				}
			}
		}
		ruler = {
			add = {
				portraits = {
${kitsuneIdeaRef.prependIndent(5)}
				}
			}
		}
	}
}
	""".trimIndent()
	File("kitsune/package/gfx/portraits/portraits/kitsune_portraits.txt").writeText(text)
}
