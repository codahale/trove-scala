// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.generic

import com.codahale.trove.collection.{ByteSetLike, ByteSet}
import scala.collection.mutable.Builder
import scala.collection.generic.CanBuildFrom

trait ByteSetFactory[Coll <: ByteSet with ByteSetLike[Coll]] {
  def empty: Coll
  def newBuilder: Builder[Byte, Coll]
  def apply(elems: Byte*): Coll = (empty /: elems)(_ + _)
  def primitiveBytesetCanBuildFrom = new CanBuildFrom[Coll, Byte, Coll] {
    def apply(from: Coll) = newBuilder
    def apply() = newBuilder
  }
}
