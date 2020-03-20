package com.windea.mod.stellaris

import java.io.*

fun main() {
	//renameAndCopyImages()
	//moveImages()
	generateString()
}

fun copyAndRenameImages() {
	File("kitsune/reference/images").mkdirs()
	File("kitsune/reference/images_unsorted").listFiles { file -> file.isFile }!!.forEachIndexed { index, file ->
		file.renameTo(File("kitsune/reference/images/kitsune_$index.${file.extension}"))
	}
	File("kitsune/reference/images_unsorted/idea").listFiles { file -> file.isFile }!!.forEachIndexed { index, file ->
		file.renameTo(File("kitsune/reference/images/kitsune_idea_$index.${file.extension}"))
	}
	File("kitsune/reference/images_unsorted/preposition").listFiles { file -> file.isFile }!!.forEachIndexed { _, file ->
		file.renameTo(File("kitsune/reference/images/${file.name}"))
	}
}

fun moveImages(){
	File("kitsune/reference/gfx").copyRecursively(File("kitsune/package/gfx/models/portraits/kitsune"))
}

fun generateString() {
	val s1 = StringBuilder()
	val s2 = StringBuilder()
	run{
		s1.appendln("kitsune_idea = {texturefile = \"gfx/models/portraits/kitsune/kitsune_idea.dds\"}")
		s2.appendln("kitsune_idea")
	}
	repeat(32){
		s1.appendln("kitsune_idea_$it = {texturefile = \"gfx/models/portraits/kitsune/kitsune_idea_$it.dds\"}")
		s2.appendln("kitsune_idea_$it")
	}
	repeat(52){
		s1.appendln("kitsune_$it = {texturefile = \"gfx/models/portraits/kitsune/kitsune_$it.dds\"}")
		s2.appendln("kitsune_$it")
	}
	File("kitsune/reference/generated_string.txt").writeText("$s1\n$s2")
}
