// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TIntIntMap
import com.codahale.trove.collection.IntIntIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TIntIntHashMap

class IntIntMap private(private val underlying: TIntIntMap)
  extends Map[Int, Int]
          with MapLike[Int, Int, IntIntMap] {

  override def empty = IntIntMap.empty

  def +=(kv: (Int, Int)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Int) = {
    underlying.remove(key)
    this
  }

  override def update(key: Int, value: Int) {
    underlying.put(key, value)
  }

  def get(key: Int) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Int) = underlying.get(key)

  def iterator = new IntIntIterator(underlying.iterator())

  override def size = underlying.size()
}

object IntIntMap {
  type Coll = Map[_, _]

  def empty: IntIntMap = new IntIntMap(new TIntIntHashMap())

  def apply(elems: (Int, Int)*): IntIntMap = (newBuilder ++= elems).result

  def newBuilder = new IntIntMapBuilder(empty)

  class IntIntMapCanBuildFrom extends CanBuildFrom[Coll, (Int, Int), IntIntMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class IntIntMapBuilder(map: IntIntMap) extends Builder[(Int, Int), IntIntMap] {
    def +=(elem: (Int, Int)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Int, value: Int) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Int, Int), IntIntMap] = new IntIntMapCanBuildFrom
}
