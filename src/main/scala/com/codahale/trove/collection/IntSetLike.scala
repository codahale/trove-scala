package com.codahale.trove.collection

import scala.collection.{SetLike, Set}

trait IntSetLike[+This <: IntSetLike[This] with Set[Int]] extends SetLike[Int, This] { self =>

}
