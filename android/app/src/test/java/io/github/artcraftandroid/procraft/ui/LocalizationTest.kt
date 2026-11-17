package io.github.artcraftandroid.procraft.ui

import org.junit.Assert.assertEquals
import org.junit.Test

class LocalizationTest {
    @Test
    fun languageChoiceControlsTranslation() {
        assertEquals("设置", UiLanguage.translate("Settings", true))
        assertEquals("Settings", UiLanguage.translate("Settings", false))
        assertEquals("  设置  ", UiLanguage.translate("  SETTINGS  ", true))
    }

    @Test
    fun dynamicMessagesKeepTheirValues() {
        assertEquals("删除 12 件作品？", UiLanguage.translate("Delete 12 artworks?", true))
        assertEquals("第 3 帧", UiLanguage.translate("Frame 3", true))
        assertEquals("作者：Alice \$1 \\ Bob", UiLanguage.translate("Made by Alice \$1 \\ Bob", true))
        assertEquals("已将 5 个文件中的 2 个保存到图库", UiLanguage.translate("Saved 2 of 5 to Gallery", true))
    }

    @Test
    fun unknownTextIsPreserved() {
        assertEquals("My custom artwork", UiLanguage.translate("My custom artwork", true))
    }
}
