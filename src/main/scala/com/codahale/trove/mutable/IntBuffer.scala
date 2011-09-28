// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

import scala.collection.mutable.{Builder, Buffer}
import gnu.trove.list.array.TIntArrayList
import scala.collection.{TraversableOnce, Traversable}
import com.codahale.trove.collection.IntIterator

class IntBuffer(private val underlying: TIntArrayList)
  extends Buffer[Int]
          with Builder[Int, IntBuffer] {
  
  def +=(elem: Int) = {
    underlying.add(elem)
    this
  }

  def +=:(elem: Int) = this.+=(elem)

  override def ++=(xs: TraversableOnce[Int]) = {
    xs match {
      case b: IntBuffer => underlying.addAll(b.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def ++=:(xs: TraversableOnce[Int]) = this.++=(xs)

  override def --=(xs: TraversableOnce[Int]) = {
    xs match {
      case b: IntBuffer => underlying.removeAll(b.underlying)
      case other => super.--=(other)
    }
    this
  }

  override def -=(x: Int) = {
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

  def insertAll(n: Int, elems: Traversable[Int]) {
    elems match {
      case b: IntBuffer => underlying.insert(n, b.underlying.toArray)
      case other => underlying.insert(n, elems.toArray)
    }
  }

  def length = underlying.size()

  def remove(n: Int) = underlying.removeAt(n)

  def update(n: Int, newelem: Int) {
    underlying.replace(n, newelem)
  }

  def iterator = new IntIterator(underlying.iterator())

  def result() = this
}

object IntBuffer {
  def newBuilder: Builder[Int, IntBuffer] = new IntBuffer(new TIntArrayList())
  
  def empty: IntBuffer = newBuilder.result()

  def apply(elems: Int*): IntBuffer = {
    if (elems.isEmpty) empty
    else {
      val b = newBuilder
      b ++= elems
      b.result
    }
  }
  
  def unapplySeq[A](x: IntBuffer): Some[IntBuffer] = Some(x)
}
