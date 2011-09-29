// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TLongCharMap
import com.codahale.trove.collection.LongCharIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TLongCharHashMap

class LongCharMap private(private val underlying: TLongCharMap)
  extends Map[Long, Char]
          with MapLike[Long, Char, LongCharMap] {

  override def empty = LongCharMap.empty

  def +=(kv: (Long, Char)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Long) = {
    underlying.remove(key)
    this
  }

  override def update(key: Long, value: Char) {
    underlying.put(key, value)
  }

  def get(key: Long) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Long) = underlying.get(key)

  def iterator = new LongCharIterator(underlying.iterator())

  override def size = underlying.size()
}

object LongCharMap {
  type Coll = Map[_, _]

  def empty: LongCharMap = new LongCharMap(new TLongCharHashMap())

  def apply(elems: (Long, Char)*): LongCharMap = (newBuilder ++= elems).result

  def newBuilder = new LongCharMapBuilder(empty)

  class LongCharMapCanBuildFrom extends CanBuildFrom[Coll, (Long, Char), LongCharMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class LongCharMapBuilder(map: LongCharMap) extends Builder[(Long, Char), LongCharMap] {
    def +=(elem: (Long, Char)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Long, value: Char) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Long, Char), LongCharMap] = new LongCharMapCanBuildFrom
}
