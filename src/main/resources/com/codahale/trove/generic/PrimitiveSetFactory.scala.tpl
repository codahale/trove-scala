@header@

package com.codahale.trove.generic

import com.codahale.trove.collection.{@type@SetLike, @type@Set}
import scala.collection.mutable.Builder
import scala.collection.generic.CanBuildFrom

trait @type@SetFactory[Coll <: @type@Set with @type@SetLike[Coll]] {
  def empty: Coll
  def newBuilder: Builder[@type@, Coll]
  def apply(elems: @type@*): Coll = (empty /: elems)(_ + _)
  def primitive@type@setCanBuildFrom = new CanBuildFrom[Coll, @type@, Coll] {
    def apply(from: Coll) = newBuilder
    def apply() = newBuilder
  }
}
