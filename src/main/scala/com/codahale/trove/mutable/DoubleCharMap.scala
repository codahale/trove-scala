// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TDoubleCharMap
import com.codahale.trove.collection.DoubleCharIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TDoubleCharHashMap

class DoubleCharMap private(private val underlying: TDoubleCharMap)
  extends Map[Double, Char]
          with MapLike[Double, Char, DoubleCharMap] {

  override def empty = DoubleCharMap.empty

  def +=(kv: (Double, Char)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Double) = {
    underlying.remove(key)
    this
  }

  override def update(key: Double, value: Char) {
    underlying.put(key, value)
  }

  def get(key: Double) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Double) = underlying.get(key)

  def iterator = new DoubleCharIterator(underlying.iterator())

  override def size = underlying.size()
}

object DoubleCharMap {
  type Coll = Map[_, _]

  def empty: DoubleCharMap = new DoubleCharMap(new TDoubleCharHashMap())

  def apply(elems: (Double, Char)*): DoubleCharMap = (newBuilder ++= elems).result

  def newBuilder = new DoubleCharMapBuilder(empty)

  class DoubleCharMapCanBuildFrom extends CanBuildFrom[Coll, (Double, Char), DoubleCharMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class DoubleCharMapBuilder(map: DoubleCharMap) extends Builder[(Double, Char), DoubleCharMap] {
    def +=(elem: (Double, Char)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Double, value: Char) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Double, Char), DoubleCharMap] = new DoubleCharMapCanBuildFrom
}
