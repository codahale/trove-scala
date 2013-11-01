@header@

package com.codahale.trove.mutable

import gnu.trove.map.TObject@valueType@Map
import com.codahale.trove.collection.Object@valueType@Iterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TObject@valueType@HashMap

class Object@valueType@Map[A] private(private val underlying: TObject@valueType@Map[A])
  extends Map[A, @valueType@]
          with MapLike[A, @valueType@, Object@valueType@Map[A]] {

  override def empty = Object@valueType@Map.empty[A]

  def +=(kv: (A, @valueType@)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: A) = {
    underlying.remove(key)
    this
  }

  override def update(key: A, value: @valueType@) {
    underlying.put(key, value)
  }

  def get(key: A) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: A) = underlying.get(key)

  def iterator = new Object@valueType@Iterator[A](underlying.iterator())

  override def size = underlying.size()
}

object Object@valueType@Map {
  type Coll = Map[_, _]

  def empty[A]: Object@valueType@Map[A] = new Object@valueType@Map[A](new TObject@valueType@HashMap[A]())

  def apply[A](elems: (A, @valueType@)*): Object@valueType@Map[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new Object@valueType@MapBuilder[A](empty)

  class Object@valueType@MapCanBuildFrom[A] extends CanBuildFrom[Coll, (A, @valueType@), Object@valueType@Map[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class Object@valueType@MapBuilder[A](map: Object@valueType@Map[A]) extends Builder[(A, @valueType@), Object@valueType@Map[A]] {
    def +=(elem: (A, @valueType@)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: A, value: @valueType@) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (A, @valueType@), Object@valueType@Map[A]] = new Object@valueType@MapCanBuildFrom[A]
}
