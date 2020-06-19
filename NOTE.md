# 图像

* 种族肖像的大小限制是588x380，但显示的大小是240x340（长度减去偏移100然后中心裁剪/扩展到240，宽度底部对齐），格式需要为DS3。
* 目前使用的种族肖像宽度：（多数情况下）适量裁剪/扩展后，调整宽度到340。
* 载入图片的大小是1920x1080，格式需要为DS1，否则不同分辨率下可能会显示不完全。
* 目前使用的载入图片策略：（多数情况下）调整长度到1920后，中心裁剪宽度到1080。
* 起源图片：220x115
* 事件图片：The graphics for the event pictures are DDS files, 450x150 pixels, 32bpp RGBA.（不生成Mip贴图）
* 载入图片：BC1（线形），生成Mip位图
* 种族肖像：BC2（线形），生成Mip位图
* 一般图标和图片：B8G8R8，没有附加设置

# 本地化文件的特殊标记

编号：
* Cardinal: %C% will produce cardinal numbers: 1, 2, 3, 4...
* Ordinal: %O% will produce ordinal numbers: 1st, 2nd, 3rd, 4th...
* Roman: %R% will produce Roman numbers: I, II, III, IV...

颜色：
* `§Y<text>§!` 黄色文本
* B蓝 E青 G绿 H橙 L棕 M紫 P亮红 R红 S深橙 T灰 W白 Y黄 !默认

图标：
* `£pop£` 人口
* `£unity£` 凝聚力

其他：
* `$job_researcher_plural$` 引用其他文本

# 其他

* 本地化文件的编码必须是`UTF-8 BOM`。否则无法生效。
* 本地化文件的名字、位置和缩进是没有限制的。
* 部分情况下需要修改`mods_registry.json`以更新mod信息。
* 查看错误日志：logs/error.log
* 脚本文件默认必须使用UTF-8编码
* namelist需要是UTF-8 BOM编码
* 事件的namespace要与文件名同名？

Stellaris Script(.txt, .mod, .gfx) （除了name_list都是UTF-8编码）
Stellaris Localization(.yum)