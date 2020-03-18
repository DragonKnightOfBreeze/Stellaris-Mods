package com.windea.mod.stellaris

import java.io.*

fun main() {
	//renameAndCopyImages()
	generatePortraitString()
}

fun renameAndCopyImages() {
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

fun generatePortraitString() {
	val s1 = StringBuilder()
	val s2 = StringBuilder()
	File("kitsune/reference/images").listFiles { file -> file.isFile }!!.forEach { file ->
		s1.appendln(file.nameWithoutExtension.let {
			"""$it = {texturefile = "gfx/models/portraits/kitsune/$it.dds""""
		})
		s2.appendln(file.nameWithoutExtension)
	}
	File("kitsune/reference/portrait_string.txt").writeText("$s1\n$s2")
}
