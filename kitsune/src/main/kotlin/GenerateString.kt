package com.windea.mod.stellaris

import java.io.*

fun main() {
	generateString()
}

fun generateString() {
	val s1 = StringBuilder()
	val s2 = StringBuilder()
	run {
		s1.appendln("kitsune_idea = {texturefile = \"gfx/models/portraits/kitsune/kitsune_idea.dds\"}")
		s2.appendln("kitsune_idea")
	}
	repeat(32) {
		s1.appendln("kitsune_idea_$it = {texturefile = \"gfx/models/portraits/kitsune/kitsune_idea_$it.dds\"}")
		s2.appendln("kitsune_idea_$it")
	}
	repeat(52) {
		s1.appendln("kitsune_$it = {texturefile = \"gfx/models/portraits/kitsune/kitsune_$it.dds\"}")
		s2.appendln("kitsune_$it")
	}
	File("kitsune/assets/generated_string.txt").writeText("$s1\n$s2")
}
