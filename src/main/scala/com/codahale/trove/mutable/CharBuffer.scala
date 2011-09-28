// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

import scala.collection.mutable.{Builder, Buffer}
import gnu.trove.list.array.TCharArrayList
import scala.collection.{TraversableOnce, Traversable}
import com.codahale.trove.collection.CharIterator

class CharBuffer(private val underlying: TCharArrayList)
  extends Buffer[Char]
          with Builder[Char, CharBuffer] {
  
  def +=(elem: Char) = {
    underlying.add(elem)
    this
  }

  def +=:(elem: Char) = this.+=(elem)

  override def ++=(xs: TraversableOnce[Char]) = {
    xs match {
      case b: CharBuffer => underlying.addAll(b.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def ++=:(xs: TraversableOnce[Char]) = this.++=(xs)

  override def --=(xs: TraversableOnce[Char]) = {
    xs match {
      case b: CharBuffer => underlying.removeAll(b.underlying)
      case other => super.--=(other)
    }
    this
  }

  override def -=(x: Char) = {
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

  def insertAll(n: Int, elems: Traversable[Char]) {
    elems match {
      case b: CharBuffer => underlying.insert(n, b.underlying.toArray)
      case other => underlying.insert(n, elems.toArray)
    }
  }

  def length = underlying.size()

  def remove(n: Int) = underlying.removeAt(n)

  def update(n: Int, newelem: Char) {
    underlying.replace(n, newelem)
  }

  def iterator = new CharIterator(underlying.iterator())

  def result() = this
}

object CharBuffer {
  def newBuilder: Builder[Char, CharBuffer] = new CharBuffer(new TCharArrayList())
  
  def empty: CharBuffer = newBuilder.result()

  def apply(elems: Char*): CharBuffer = {
    if (elems.isEmpty) empty
    else {
      val b = newBuilder
      b ++= elems
      b.result
    }
  }
  
  def unapplySeq[A](x: CharBuffer): Some[CharBuffer] = Some(x)
}
