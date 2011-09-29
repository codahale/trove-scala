// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TIntLongMap
import com.codahale.trove.collection.IntLongIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TIntLongHashMap

class IntLongMap private(private val underlying: TIntLongMap)
  extends Map[Int, Long]
          with MapLike[Int, Long, IntLongMap] {

  override def empty = IntLongMap.empty

  def +=(kv: (Int, Long)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Int) = {
    underlying.remove(key)
    this
  }

  override def update(key: Int, value: Long) {
    underlying.put(key, value)
  }

  def get(key: Int) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Int) = underlying.get(key)

  def iterator = new IntLongIterator(underlying.iterator())

  override def size = underlying.size()
}

object IntLongMap {
  type Coll = Map[_, _]

  def empty: IntLongMap = new IntLongMap(new TIntLongHashMap())

  def apply(elems: (Int, Long)*): IntLongMap = (newBuilder ++= elems).result

  def newBuilder = new IntLongMapBuilder(empty)

  class IntLongMapCanBuildFrom extends CanBuildFrom[Coll, (Int, Long), IntLongMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class IntLongMapBuilder(map: IntLongMap) extends Builder[(Int, Long), IntLongMap] {
    def +=(elem: (Int, Long)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Int, value: Long) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Int, Long), IntLongMap] = new IntLongMapCanBuildFrom
}
