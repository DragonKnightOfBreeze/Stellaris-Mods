import java.io.*

//打包mod目录，同时进行必要的转化处理
//移除.hcl后缀

val srcPath = "kitsune/src"
val packagePath = "kitsune/package"

File(packagePath).mkdirs()
File(srcPath).absolutePath
File(srcPath).walk().forEach {
	println(it.path)
	val targetPath = it.path.replace("src","package").removeSuffix(".hcl")
	it.copyTo(File(targetPath),true)
}

println("完成。")
