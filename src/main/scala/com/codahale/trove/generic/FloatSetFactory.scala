// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.generic

import com.codahale.trove.collection.{FloatSetLike, FloatSet}
import scala.collection.mutable.Builder
import scala.collection.generic.CanBuildFrom

trait FloatSetFactory[Coll <: FloatSet with FloatSetLike[Coll]] {
  def empty: Coll
  def newBuilder: Builder[Float, Coll]
  def apply(elems: Float*): Coll = (empty /: elems)(_ + _)
  def primitiveFloatsetCanBuildFrom = new CanBuildFrom[Coll, Float, Coll] {
    def apply(from: Coll) = newBuilder
    def apply() = newBuilder
  }
}
