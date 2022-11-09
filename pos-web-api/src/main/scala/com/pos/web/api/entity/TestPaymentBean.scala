package com.pos.web.api.entity

import java.io.Serializable
import javax.persistence.{Column, Entity, GeneratedValue, GenerationType, Id, Table}


@SerialVersionUID(1L)
@Entity
@Table(name="TEST")
class TestPaymentBean extends Serializable with Equals
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="TEST_ID")
  var testId: Long = _

  @Column(name="HELLO")
  var hello: String = _

  @Column(name="WORLD")
  var world: Long = _

  override def canEqual(other:Any) = other.isInstanceOf[TestPaymentBean]

  override def hashCode = 41 * (41 + testId.intValue())

  override def equals(other:Any) = other match
  {
    case that: TestPaymentBean => this.testId == that.testId
    case _ => false
  }
}