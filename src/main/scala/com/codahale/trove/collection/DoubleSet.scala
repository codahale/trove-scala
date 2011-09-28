// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.DoubleSetFactory
import com.codahale.trove.immutable

trait DoubleSet extends collection.Set[Double] with DoubleSetLike[DoubleSet] {
  override def empty: DoubleSet = DoubleSet.empty
}

object DoubleSet extends DoubleSetFactory[DoubleSet] {
  val empty: DoubleSet = immutable.DoubleSet.empty

  def newBuilder = immutable.DoubleSet.newBuilder

  implicit def canBuildFrom: CanBuildFrom[DoubleSet, Double, DoubleSet] = primitiveDoublesetCanBuildFrom
}
