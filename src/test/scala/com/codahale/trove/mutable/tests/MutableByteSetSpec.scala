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

    @Test def `has a size of zero` = {
      set.size.must(be(0))
    }
  }

  class `A set with one element` {
    val set = ByteSet.empty
    set += 1

    @Test def `is not empty` = {
      set.must(not(be(empty)))
    }

    @Test def `has a size of one` = {
      set.size.must(be(1))
    }

    @Test def `contains that element` = {
      set.contains(1).must(be(true))
    }

    @Test def `does not contain other elements` = {
      set.contains(40).must(be(false))
    }
    
    class `with the element removed` {
      set -= 1

      @Test def `is empty` = {
        set.must(be(empty))
      }

      @Test def `has a size of zero` = {
        set.size.must(be(0))
      }

      @Test def `does not contain that element` = {
        set.contains(1).must(be(false))
      }
    }
  }

  class `A set with two elements` {
    val set = ByteSet.empty
    set ++= Seq(1, 2)

    @Test def `is not empty` = {
      set.must(not(be(empty)))
    }

    @Test def `has a size of two` = {
      set.size.must(be(2))
    }

    @Test def `contains those elements` = {
      set.contains(1).must(be(true))
      set.contains(2).must(be(true))
    }

    @Test def `does not contain other elements` = {
      set.contains(40).must(be(false))
    }

    class `with those elements removed` {
      set --= Seq(1, 2)

      @Test def `is empty` = {
        set.must(be(empty))
      }

      @Test def `has a size of zero` = {
        set.size.must(be(0))
      }

      @Test def `does not contain those elements` = {
        set.contains(1).must(be(false))
        set.contains(2).must(be(false))
      }
    }
  }
}
