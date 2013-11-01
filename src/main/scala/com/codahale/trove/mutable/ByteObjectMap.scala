// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TByteObjectMap
import com.codahale.trove.collection.ByteObjectIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TByteObjectHashMap

class ByteObjectMap[A] private(private val underlying: TByteObjectMap[A])
  extends Map[Byte, A]
          with MapLike[Byte, A, ByteObjectMap[A]] {

  override def empty = ByteObjectMap.empty[A]

  def +=(kv: (Byte, A)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Byte) = {
    underlying.remove(key)
    this
  }

  override def update(key: Byte, value: A) {
    underlying.put(key, value)
  }

  def get(key: Byte) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Byte) = underlying.get(key)

  def iterator = new ByteObjectIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object ByteObjectMap {
  type Coll = Map[_, _]

  def empty[A]: ByteObjectMap[A] = new ByteObjectMap[A](new TByteObjectHashMap[A]())

  def apply[A](elems: (Byte, A)*): ByteObjectMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new ByteObjectMapBuilder[A](empty)

  class ByteObjectMapCanBuildFrom[A] extends CanBuildFrom[Coll, (Byte, A), ByteObjectMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ByteObjectMapBuilder[A](map: ByteObjectMap[A]) extends Builder[(Byte, A), ByteObjectMap[A]] {
    def +=(elem: (Byte, A)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Byte, value: A) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (Byte, A), ByteObjectMap[A]] = new ByteObjectMapCanBuildFrom[A]
}
