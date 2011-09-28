// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.FloatSetFactory
import com.codahale.trove.immutable

trait FloatSet extends collection.Set[Float] with FloatSetLike[FloatSet] {
  override def empty: FloatSet = FloatSet.empty
}

object FloatSet extends FloatSetFactory[FloatSet] {
  val empty: FloatSet = immutable.FloatSet.empty

  def newBuilder = immutable.FloatSet.newBuilder

  implicit def canBuildFrom: CanBuildFrom[FloatSet, Float, FloatSet] = primitiveFloatSetCanBuildFrom
}
