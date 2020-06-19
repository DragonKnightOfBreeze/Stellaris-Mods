import java.io.*

//生成文件：gfx/portraits/portraits/kitsune_portraits.txt

val packagePath = "kitsune/package"
val filePath = "$packagePath/gfx/portraits/portraits/kitsune_portraits.txt"
val ddsFileNames:Array<String> = File("$packagePath/gfx/models/portraits/kitsune").list() ?: arrayOf()
val defaultRefText = "idea_1"
val refText = ddsFileNames.joinToString("\n") {
	it.substringBefore(".")
}
val defText = ddsFileNames.joinToString("\n"){
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

println("完成。")
