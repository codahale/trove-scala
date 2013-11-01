// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TIntObjectMap
import com.codahale.trove.collection.IntObjectIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TIntObjectHashMap

class IntObjectMap[A] private(private val underlying: TIntObjectMap[A])
  extends Map[Int, A]
          with MapLike[Int, A, IntObjectMap[A]] {

  override def empty = IntObjectMap.empty[A]

  def +=(kv: (Int, A)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Int) = {
    underlying.remove(key)
    this
  }

  override def update(key: Int, value: A) {
    underlying.put(key, value)
  }

  def get(key: Int) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Int) = underlying.get(key)

  def iterator = new IntObjectIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object IntObjectMap {
  type Coll = Map[_, _]

  def empty[A]: IntObjectMap[A] = new IntObjectMap[A](new TIntObjectHashMap[A]())

  def apply[A](elems: (Int, A)*): IntObjectMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new IntObjectMapBuilder[A](empty)

  class IntObjectMapCanBuildFrom[A] extends CanBuildFrom[Coll, (Int, A), IntObjectMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class IntObjectMapBuilder[A](map: IntObjectMap[A]) extends Builder[(Int, A), IntObjectMap[A]] {
    def +=(elem: (Int, A)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Int, value: A) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (Int, A), IntObjectMap[A]] = new IntObjectMapCanBuildFrom[A]
}
