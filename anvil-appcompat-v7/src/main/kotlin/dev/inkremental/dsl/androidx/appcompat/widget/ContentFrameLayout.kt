@file:Suppress("DEPRECATION", "UNCHECKED_CAST", "MemberVisibilityCanBePrivate", "unused")

package dev.inkremental.dsl.androidx.appcompat.widget

import androidx.appcompat.widget.ContentFrameLayout
import dev.inkremental.Anvil
import dev.inkremental.bind
import dev.inkremental.dsl.android.widget.FrameLayoutScope
import dev.inkremental.dsl.androidx.appcompat.AppCompatv7Setter
import dev.inkremental.dsl.androidx.appcompat.CustomAppCompatv7Setter
import dev.inkremental.v
import kotlin.Suppress
import kotlin.Unit

fun contentFrameLayout(configure: ContentFrameLayoutScope.() -> Unit = {}) =
    v<ContentFrameLayout>(configure.bind(ContentFrameLayoutScope))
abstract class ContentFrameLayoutScope : FrameLayoutScope() {
  companion object : ContentFrameLayoutScope() {
    init {
      Anvil.registerAttributeSetter(AppCompatv7Setter)
      Anvil.registerAttributeSetter(CustomAppCompatv7Setter)
    }
  }
}
