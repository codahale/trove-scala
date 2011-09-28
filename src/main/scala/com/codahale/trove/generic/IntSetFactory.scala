// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.generic

import com.codahale.trove.collection.{IntSetLike, IntSet}
import scala.collection.mutable.Builder
import scala.collection.generic.CanBuildFrom

trait IntSetFactory[Coll <: IntSet with IntSetLike[Coll]] {
  def empty: Coll
  def newBuilder: Builder[Int, Coll]
  def apply(elems: Int*): Coll = (empty /: elems)(_ + _)
  def primitiveIntSetCanBuildFrom = new CanBuildFrom[Coll, Int, Coll] {
    def apply(from: Coll) = newBuilder
    def apply() = newBuilder
  }
}
