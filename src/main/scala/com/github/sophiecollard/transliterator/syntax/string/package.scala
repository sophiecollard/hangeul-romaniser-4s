package com.github.sophiecollard.transliterator.syntax

import scala.util.Try

package object string {

  implicit class StringOps(string: String) {
    def safeCharAt(index: Int): Option[Char] =
      Try(string.charAt(index)).toOption
  }

}
