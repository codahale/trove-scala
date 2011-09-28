// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

import scala.collection.mutable.{Builder, Buffer}
import gnu.trove.list.array.TFloatArrayList
import scala.collection.{TraversableOnce, Traversable}
import com.codahale.trove.collection.FloatIterator

class FloatBuffer(private val underlying: TFloatArrayList)
  extends Buffer[Float]
          with Builder[Float, FloatBuffer] {
  
  def +=(elem: Float) = {
    underlying.add(elem)
    this
  }

  def +=:(elem: Float) = this.+=(elem)

  override def ++=(xs: TraversableOnce[Float]) = {
    xs match {
      case b: FloatBuffer => underlying.addAll(b.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def ++=:(xs: TraversableOnce[Float]) = this.++=(xs)

  override def --=(xs: TraversableOnce[Float]) = {
    xs match {
      case b: FloatBuffer => underlying.removeAll(b.underlying)
      case other => super.--=(other)
    }
    this
  }

  override def -=(x: Float) = {
    underlying.remove(x)
    this
  }

  override def sizeHint(size: Int) {
    underlying.ensureCapacity(size)
  }

  def apply(n: Int) = underlying.get(n)

  def clear() {
    underlying.clear()
  }

  def insertAll(n: Int, elems: Traversable[Float]) {
    elems match {
      case b: FloatBuffer => underlying.insert(n, b.underlying.toArray)
      case other => underlying.insert(n, elems.toArray)
    }
  }

  def length = underlying.size()

  def remove(n: Int) = underlying.removeAt(n)

  def update(n: Int, newelem: Float) {
    underlying.replace(n, newelem)
  }

  def iterator = new FloatIterator(underlying.iterator())

  def result() = this
}

object FloatBuffer {
  def newBuilder: Builder[Float, FloatBuffer] = new FloatBuffer(new TFloatArrayList())
  
  def empty: FloatBuffer = newBuilder.result()

  def apply(elems: Float*): FloatBuffer = {
    if (elems.isEmpty) empty
    else {
      val b = newBuilder
      b ++= elems
      b.result
    }
  }
  
  def unapplySeq[A](x: FloatBuffer): Some[FloatBuffer] = Some(x)
}
