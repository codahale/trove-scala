// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TIntFloatMap
import com.codahale.trove.collection.IntFloatIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TIntFloatHashMap

class IntFloatMap private(private val underlying: TIntFloatMap)
  extends Map[Int, Float]
          with MapLike[Int, Float, IntFloatMap] {

  override def empty = IntFloatMap.empty

  def +=(kv: (Int, Float)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Int) = {
    underlying.remove(key)
    this
  }

  override def update(key: Int, value: Float) {
    underlying.put(key, value)
  }

  def get(key: Int) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Int) = underlying.get(key)

  def iterator = new IntFloatIterator(underlying.iterator())

  override def size = underlying.size()
}

object IntFloatMap {
  type Coll = Map[_, _]

  def empty: IntFloatMap = new IntFloatMap(new TIntFloatHashMap())

  def apply(elems: (Int, Float)*): IntFloatMap = (newBuilder ++= elems).result

  def newBuilder = new IntFloatMapBuilder(empty)

  class IntFloatMapCanBuildFrom extends CanBuildFrom[Coll, (Int, Float), IntFloatMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class IntFloatMapBuilder(map: IntFloatMap) extends Builder[(Int, Float), IntFloatMap] {
    def +=(elem: (Int, Float)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Int, value: Float) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Int, Float), IntFloatMap] = new IntFloatMapCanBuildFrom
}
