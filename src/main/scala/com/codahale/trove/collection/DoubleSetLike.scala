package com.codahale.trove.collection

import scala.collection.{SetLike, Set}

trait DoubleSetLike[+This <: DoubleSetLike[This] with Set[Double]] extends SetLike[Double, This] { self =>

}
