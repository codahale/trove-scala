// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.generic

import com.codahale.trove.collection.{LongSetLike, LongSet}
import scala.collection.mutable.Builder
import scala.collection.generic.CanBuildFrom

trait LongSetFactory[Coll <: LongSet with LongSetLike[Coll]] {
  def empty: Coll
  def newBuilder: Builder[Long, Coll]
  def apply(elems: Long*): Coll = (empty /: elems)(_ + _)
  def primitiveLongSetCanBuildFrom = new CanBuildFrom[Coll, Long, Coll] {
    def apply(from: Coll) = newBuilder
    def apply() = newBuilder
  }
}
