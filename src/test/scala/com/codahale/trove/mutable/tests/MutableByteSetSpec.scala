package com.codahale.trove.mutable.tests

import com.codahale.simplespec.Spec
import com.codahale.trove.mutable.ByteSet
import org.junit.Test

class MutableByteSetSpec extends Spec {
  class `An empty set` {
    val set = ByteSet.empty

    @Test def `is empty` = {
      set.must(be(empty))
    }
  }
}
