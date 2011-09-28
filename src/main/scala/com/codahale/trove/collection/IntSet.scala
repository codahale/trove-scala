// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.IntSetFactory
import com.codahale.trove.immutable

trait IntSet extends collection.Set[Int] with IntSetLike[IntSet] {
  override def empty: IntSet = IntSet.empty
}

object IntSet extends IntSetFactory[IntSet] {
  val empty: IntSet = immutable.IntSet.empty

  def newBuilder = immutable.IntSet.newBuilder

  implicit def canBuildFrom: CanBuildFrom[IntSet, Int, IntSet] = primitiveIntsetCanBuildFrom
}
