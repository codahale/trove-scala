// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.generic

import com.codahale.trove.collection.{CharSetLike, CharSet}
import scala.collection.mutable.Builder
import scala.collection.generic.CanBuildFrom

trait CharSetFactory[Coll <: CharSet with CharSetLike[Coll]] {
  def empty: Coll
  def newBuilder: Builder[Char, Coll]
  def apply(elems: Char*): Coll = (empty /: elems)(_ + _)
  def primitiveCharsetCanBuildFrom = new CanBuildFrom[Coll, Char, Coll] {
    def apply(from: Coll) = newBuilder
    def apply() = newBuilder
  }
}
