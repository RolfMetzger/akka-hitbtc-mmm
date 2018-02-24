package com.mbcu.hitbtc.mmm.sequences

import com.mbcu.hitbtc.mmm.models.response.Order

import scala.collection.immutable.ListMap

trait OrderbookTrait {


  def getTopSel : Option[Order]
  def getLowSel : Option[Order]
  def getTopBuy : Option[Order]
  def getLowBuy : Option[Order]
}
