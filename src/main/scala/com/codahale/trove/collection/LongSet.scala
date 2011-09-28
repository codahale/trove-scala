// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.LongSetFactory
import com.codahale.trove.immutable

trait LongSet extends collection.Set[Long] with LongSetLike[LongSet] {
  override def empty: LongSet = LongSet.empty
}

object LongSet extends LongSetFactory[LongSet] {
  val empty: LongSet = immutable.LongSet.empty

  def newBuilder = immutable.LongSet.newBuilder

  implicit def canBuildFrom: CanBuildFrom[LongSet, Long, LongSet] = primitiveLongSetCanBuildFrom
}
