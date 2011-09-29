// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TFloatCharMap
import com.codahale.trove.collection.FloatCharIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TFloatCharHashMap

class FloatCharMap private(private val underlying: TFloatCharMap)
  extends Map[Float, Char]
          with MapLike[Float, Char, FloatCharMap] {

  override def empty = FloatCharMap.empty

  def +=(kv: (Float, Char)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Float) = {
    underlying.remove(key)
    this
  }

  override def update(key: Float, value: Char) {
    underlying.put(key, value)
  }

  def get(key: Float) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Float) = underlying.get(key)

  def iterator = new FloatCharIterator(underlying.iterator())

  override def size = underlying.size()
}

object FloatCharMap {
  type Coll = Map[_, _]

  def empty: FloatCharMap = new FloatCharMap(new TFloatCharHashMap())

  def apply(elems: (Float, Char)*): FloatCharMap = (newBuilder ++= elems).result

  def newBuilder = new FloatCharMapBuilder(empty)

  class FloatCharMapCanBuildFrom extends CanBuildFrom[Coll, (Float, Char), FloatCharMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class FloatCharMapBuilder(map: FloatCharMap) extends Builder[(Float, Char), FloatCharMap] {
    def +=(elem: (Float, Char)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Float, value: Char) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Float, Char), FloatCharMap] = new FloatCharMapCanBuildFrom
}
