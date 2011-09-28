@header@

package com.codahale.trove.collection

import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.@type@SetFactory
import com.codahale.trove.immutable

trait @type@Set extends collection.Set[@type@] with @type@SetLike[@type@Set] {
  override def empty: @type@Set = @type@Set.empty
}

object @type@Set extends @type@SetFactory[@type@Set] {
  val empty: @type@Set = immutable.@type@Set.empty

  def newBuilder = immutable.@type@Set.newBuilder

  implicit def canBuildFrom: CanBuildFrom[@type@Set, @type@, @type@Set] = primitive@type@SetCanBuildFrom
}
