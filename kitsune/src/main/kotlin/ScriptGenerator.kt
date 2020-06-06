package com.windea.mod.stellaris.kitsune

import java.io.*

fun main() {
	generatePortraitsScript()
}

private fun generatePortraitsScript() {
	val filePath = "kitsune/package/gfx/portraits/portraits/kitsune_portraits.txt"
	val fileNames:Array<String> = File("kitsune/package/gfx/models/portraits/kitsune").list() ?: arrayOf()
	val defaultRefText = "idea_1"
	val refText = fileNames.joinToString("\n") {
		it.substringBefore(".")
	}
	val defText = fileNames.joinToString("\n"){
		"${it.substringBefore(".")} = {texturefile = \"gfx/models/portraits/kitsune/$it\"}"
	}

	val text = """
portraits = {
${defText.prependIndent("\t")}
}

portrait_groups = {
	kitsune = {
		default = $defaultRefText
		game_setup = {
			add = {
				portraits = {
${refText.prependIndent("\t".repeat(5))}
				}
			}
		}
		species = {
			add = {
				portraits = {
${refText.prependIndent("\t".repeat(5))}
				}
			}
		}
		pop = {
			add = {
				portraits = {
${refText.prependIndent("\t".repeat(5))}
				}
			}
		}
		leader = {
			add = {
				portraits = {
${refText.prependIndent("\t".repeat(5))}
				}
			}
		}
		ruler = {
			add = {
				portraits = {
${refText.prependIndent("\t".repeat(5))}
				}
			}
		}
	}
}
	""".trimIndent()

	File(filePath).writeText(text)
}
