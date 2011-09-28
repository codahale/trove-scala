// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

import scala.collection.mutable.{Builder, Buffer}
import gnu.trove.list.array.TByteArrayList
import scala.collection.{TraversableOnce, Traversable}
import com.codahale.trove.collection.ByteIterator

class ByteBuffer(private val underlying: TByteArrayList)
  extends Buffer[Byte]
          with Builder[Byte, ByteBuffer] {
  
  def +=(elem: Byte) = {
    underlying.add(elem)
    this
  }

  def +=:(elem: Byte) = this.+=(elem)

  override def ++=(xs: TraversableOnce[Byte]) = {
    xs match {
      case b: ByteBuffer => underlying.addAll(b.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def ++=:(xs: TraversableOnce[Byte]) = this.++=(xs)

  override def --=(xs: TraversableOnce[Byte]) = {
    xs match {
      case b: ByteBuffer => underlying.removeAll(b.underlying)
      case other => super.--=(other)
    }
    this
  }

  override def -=(x: Byte) = {
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

  def insertAll(n: Int, elems: Traversable[Byte]) {
    elems match {
      case b: ByteBuffer => underlying.insert(n, b.underlying.toArray)
      case other => underlying.insert(n, elems.toArray)
    }
  }

  def length = underlying.size()

  def remove(n: Int) = underlying.removeAt(n)

  def update(n: Int, newelem: Byte) {
    underlying.replace(n, newelem)
  }

  def iterator = new ByteIterator(underlying.iterator())

  def result() = this
}

object ByteBuffer {
  def newBuilder: Builder[Byte, ByteBuffer] = new ByteBuffer(new TByteArrayList())
  
  def empty: ByteBuffer = newBuilder.result()

  def apply(elems: Byte*): ByteBuffer = {
    if (elems.isEmpty) empty
    else {
      val b = newBuilder
      b ++= elems
      b.result
    }
  }
  
  def unapplySeq[A](x: ByteBuffer): Some[ByteBuffer] = Some(x)
}
