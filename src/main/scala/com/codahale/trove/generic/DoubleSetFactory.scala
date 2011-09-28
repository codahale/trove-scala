package com.codahale.trove.generic

import com.codahale.trove.collection.{DoubleSetLike, DoubleSet}
import scala.collection.mutable.Builder
import scala.collection.generic.CanBuildFrom

trait DoubleSetFactory[Coll <: DoubleSet with DoubleSetLike[Coll]] {
  def empty: Coll
  def newBuilder: Builder[Double, Coll]
  def apply(elems: Double*): Coll = (empty /: elems)(_ + _)
  def doublesetCanBuildFrom = new CanBuildFrom[Coll, Double, Coll] {
    def apply(from: Coll) = newBuilder
    def apply() = newBuilder
  }
}
